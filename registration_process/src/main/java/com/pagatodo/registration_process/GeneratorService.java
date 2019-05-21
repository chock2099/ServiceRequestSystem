package com.pagatodo.registration_process;

import android.view.View;

public abstract class GeneratorService implements ServiceRequest{

    protected String TAG_LOG;
    protected FullService fullService;
    protected boolean isDebug;
    protected View progressBar;
    protected ServiceResponseListener listener;

    @Override
    public ServiceRequest setServiceRequest(FullService fullService) {
        this.fullService = fullService;
        return this;
    }

    @Override
    public GeneratorService idRequest(int idRequest) {
        this.fullService.setIdRequest(idRequest);
        return this;
    }

    @Override
    public GeneratorService setRequestURL(String requestURL) {
        this.fullService.setRequestURL(requestURL);
        return this;
    }

    @Override
    public GeneratorService setMethodURL(String methodURL) {
        this.fullService.setMethodURL(methodURL);
        return this;
    }

    @Override
    public GeneratorService setDebug(boolean debug){
        this.isDebug = debug;
        return this;
    }

    @Override
    public GeneratorService setDebugTAG(String debugTAG){
        this.TAG_LOG = debugTAG;
        return this;
    }

    @Override
    public GeneratorService setProgress(View progressBar){
        this.progressBar = progressBar;
        return this;
    }

    @Override
    public GeneratorService addServicesResponseListener(ServiceResponseListener listener) {
        this.listener = listener;
        return this;
    }

    @Override
    public GeneratorService setResponse(ServiceResponse serviceResponse) {
        this.fullService.setServiceResponse(serviceResponse);
        return this;
    }

    public abstract void sendRequest();

    public abstract void getServiceResponse();
}
