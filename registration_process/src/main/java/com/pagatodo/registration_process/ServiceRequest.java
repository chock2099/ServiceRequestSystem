package com.pagatodo.registration_process;

import android.view.View;

public interface ServiceRequest {

    ServiceRequest setServiceRequest(FullService fullService);

    ServiceRequest setRequestURL(String requestURL);

    ServiceRequest setMethodURL(String methodURL);

    ServiceRequest setDebug(boolean isDebug);

    ServiceRequest setDebugTAG(String tagDebug);

    ServiceRequest setProgress(View progressBar);

    ServiceRequest addServicesResponseListener(ServiceResponseListener listener);

    ServiceRequest idRequest(int idRequest);

    ServiceRequest setResponse(ServiceResponse serviceResponse);

    void sendRequest();

    void getServiceResponse();
}
