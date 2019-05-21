package com.pagatodo.registration_process.renapo;

public class RenapoResponse extends StandardResponse {

    private RenapoDataResponse body;

    public static RenapoResponse getInstance(){
        return new RenapoResponse();
    }


    public RenapoDataResponse getBody() {
        return body;
    }
}
