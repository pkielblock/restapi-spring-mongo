package com.pkielblock.application.resources.exceptions;

import java.io.Serializable;

public class StandardError implements Serializable {
    private Long timestamp;
    private Integer status;
    private String eroor;
    private String message;
    private String path;

    public StandardError() {

    }

    public StandardError(Long timestamp, Integer status, String eroor, String message, String path) {
        this.timestamp = timestamp;
        this.status = status;
        this.eroor = eroor;
        this.message = message;
        this.path = path;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getEroor() {
        return eroor;
    }

    public void setEroor(String eroor) {
        this.eroor = eroor;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
