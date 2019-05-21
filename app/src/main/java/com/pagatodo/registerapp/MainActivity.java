package com.pagatodo.registerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ProgressBar;

import com.pagatodo.registration_process.renapo.GetDataCURPRequest;
import com.pagatodo.registration_process.ServiceResponse;
import com.pagatodo.registration_process.ServiceResponseListener;
import com.pagatodo.registration_process.renapo.RenapoResponse;

public class MainActivity extends AppCompatActivity implements ServiceResponseListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ProgressBar progressBar = findViewById(R.id.progress_bar);

        GetDataCURPRequest.Build(this)
                .idRequest(1234)
                .setRequestURL(BuildConfig.EIGA)
                .setMethodURL("GetData?curp=CARL621022HGRSMS05")
                .setResponse(RenapoResponse.getInstance())
                .setDebug(true)
                .setDebugTAG(BuildConfig.TAG_DEBUG)
                .setProgress(progressBar)
                .addServicesResponseListener(this)
                .sendRequest();

        /*GetDataCURPRequest.Build(this)
                .setServiceRequest(new FullService(1234,
                        BuildConfig.EIGA,
                        "GetData?curp=CARL621022HGRSMS05",RenapoResponse.getInstance()))
                .setDebug(true)
                .setProgress(progressBar)
                .addServicesResponseListener(this)
                .sendRequest();*/
    }

    @Override
    public void requestSuccess(int idRequest, ServiceResponse response) {
        RenapoResponse renapoResponse = (RenapoResponse) response;
        Log.d(BuildConfig.TAG_DEBUG,renapoResponse.getBody().getCurp());
    }

    @Override
    public void requestFailure(int idRequest) {
        Log.d(BuildConfig.TAG_DEBUG,"FALLO");
    }

}
