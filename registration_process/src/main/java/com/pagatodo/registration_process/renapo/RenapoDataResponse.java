package com.pagatodo.registration_process.renapo;

public class RenapoDataResponse {

    private int errorCode;
    //error
    private String curp;
    private String name;
    private String fatherLastName;
    private String motherLastName;
    private String sex;
    private String bornDate;
    private String nationality;
    private int probatoryDocument;
    private int recordYear;
    private String foja;
    private String tome;
    //book
    private int actNumber;
    private String crip;
    private String recordStateNumber;
    private String recordMunicipalityKey;
    private String recordForeignNumber;
    private String letterFolio;
    private String bornStateKey;
    private String issuingEntityKey;
    private String status;

    public int getErrorCode() {
        return errorCode;
    }

    public String getCurp() {
        return curp;
    }

    public String getName() {
        return name;
    }

    public String getFatherLastName() {
        return fatherLastName;
    }

    public String getMotherLastName() {
        return motherLastName;
    }

    public String getSex() {
        return sex;
    }

    public String getBornDate() {
        return bornDate;
    }

    public String getNationality() {
        return nationality;
    }

    public int getProbatoryDocument() {
        return probatoryDocument;
    }

    public int getRecordYear() {
        return recordYear;
    }

    public String getFoja() {
        return foja;
    }

    public String getTome() {
        return tome;
    }

    public int getActNumber() {
        return actNumber;
    }

    public String getCrip() {
        return crip;
    }

    public String getRecordStateNumber() {
        return recordStateNumber;
    }

    public String getRecordMunicipalityKey() {
        return recordMunicipalityKey;
    }

    public String getRecordForeignNumber() {
        return recordForeignNumber;
    }

    public String getLetterFolio() {
        return letterFolio;
    }

    public String getBornStateKey() {
        return bornStateKey;
    }

    public String getIssuingEntityKey() {
        return issuingEntityKey;
    }

    public String getStatus() {
        return status;
    }
}
