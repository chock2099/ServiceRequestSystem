package com.pagatodo.registration_process.renapo;

import android.content.Context;
import android.util.Log;
import android.view.View;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.google.gson.Gson;
import com.pagatodo.registration_process.FullService;
import com.pagatodo.registration_process.GeneratorService;
import com.pagatodo.registration_process.RequestSingleton;

import org.json.JSONObject;

public class GetDataCURPRequest extends GeneratorService {

    private Context context;

    private GetDataCURPRequest(Context context) {
        this.context = context;
        this.fullService = FullService.getInstance();
        this.TAG_LOG = "WSC";
    }

    public static GeneratorService Build(Context context){
        return new GetDataCURPRequest(context);
    }


    @Override
    public void sendRequest() {
        if (this.progressBar != null){
            this.progressBar.setVisibility(View.VISIBLE);
        }
        if (!this.fullService.getRequestURL().isEmpty()) {
            if (this.isDebug){
                Log.d(TAG_LOG, "Request: " + this.fullService.getRequestURL() + this.fullService.getMethodURL());
            }
            JsonObjectRequest jsonObjectRequest = new JsonObjectRequest
                    (Request.Method.GET, this.fullService.getRequestURL() + this.fullService.getMethodURL(), null,
                            new Response.Listener<JSONObject>() {

                                @Override
                                public void onResponse(JSONObject response) {
                                    if (isDebug) {
                                        Log.d(TAG_LOG, response.toString());
                                    }

                                    Gson gson = new Gson();
                                    fullService.setServiceResponse(gson.fromJson(response.toString(), fullService.getServiceResponse().getClass()));
                                    getServiceResponse();

                                }
                            }, new Response.ErrorListener() {

                        @Override
                        public void onErrorResponse(VolleyError error) {
                            if (isDebug) {
                                Log.d(TAG_LOG, error.toString());
                            }
                            Log.d("Response", "Error");
                            if (progressBar != null) {
                                progressBar.setVisibility(View.GONE);
                            }
                            if (listener != null) {
                                listener.requestFailure(fullService.getIdRequest());
                            }
                        }
                    });
            RequestSingleton.getInstance(context).addToRequestQueue(jsonObjectRequest);
        } else {
            if (listener != null) {
                listener.requestFailure(fullService.getIdRequest());
            }
        }

    }

    @Override
    public void getServiceResponse() {

        if (this.progressBar != null){
            this.progressBar.setVisibility(View.GONE);
        }

        if (listener != null){
            listener.requestSuccess(fullService.getIdRequest(),fullService.getServiceResponse());
        }
    }


}
