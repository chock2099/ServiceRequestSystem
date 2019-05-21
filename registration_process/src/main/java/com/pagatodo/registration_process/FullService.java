package com.pagatodo.registration_process;

public class FullService {

    private int idRequest;
    private String requestURL;
    private String methodURL;
    private ServiceResponse serviceResponse;


    private FullService() {
    }

    public static FullService getInstance(){
        return new FullService();
    }

    public FullService(int idRequest, String requestURL, String methodURL, ServiceResponse serviceResponse) {
        this.idRequest = idRequest;
        this.requestURL = requestURL;
        this.methodURL = methodURL;
        this.serviceResponse = serviceResponse;
    }

    public int getIdRequest() {
        return idRequest;
    }

    public void setIdRequest(int idRequest) {
        this.idRequest = idRequest;
    }

    public String getRequestURL() {
        return requestURL;
    }

    public void setRequestURL(String requestURL) {
        this.requestURL = requestURL;
    }

    public String getMethodURL() {
        return methodURL;
    }

    public void setMethodURL(String methodURL) {
        this.methodURL = methodURL;
    }

    public ServiceResponse getServiceResponse() {
        return serviceResponse;
    }

    public void setServiceResponse(ServiceResponse serviceResponse) {
        this.serviceResponse = serviceResponse;
    }
}
