package com.pagatodo.registration_process.renapo;

import com.pagatodo.registration_process.ServiceResponse;

public class StandardResponse implements ServiceResponse {

    private boolean success;
    private int statusCode;
    private String reasonPhrase;
    private String responseMessage;

    public boolean isSuccess() {
        return success;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getReasonPhrase() {
        return reasonPhrase;
    }

    public String getResponseMessage() {
        return responseMessage;
    }
}
