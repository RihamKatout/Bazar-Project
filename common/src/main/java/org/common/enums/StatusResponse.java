package org.common.enums;

public enum StatusResponse {
    SUCCESS("Success"),
    ERROR("Error");
    private String status;
    StatusResponse(String status){
        this.status = status;
    }
}
