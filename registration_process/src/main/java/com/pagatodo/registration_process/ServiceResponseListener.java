package com.pagatodo.registration_process;

public interface ServiceResponseListener {

    void requestSuccess(int idRequest, ServiceResponse response);

    void requestFailure(int idRequest);
}
