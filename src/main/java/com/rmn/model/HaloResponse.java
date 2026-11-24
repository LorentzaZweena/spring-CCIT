package com.rmn.model;

public class HaloResponse {
    private String pesan;
    private String status;

    public HaloResponse(String pesan, String status) {
        this.pesan = pesan;
        this.status = status;
    }

    public String getPesan() {
        return pesan;
    }

    public void setPesan(String pesan) {
        this.pesan = pesan;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}