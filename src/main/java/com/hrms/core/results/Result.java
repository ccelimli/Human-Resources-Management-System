package com.hrms.core.results;

public class Result {
    boolean success;
    String message;

    public Result(boolean success){
        this.success=success;
    }

    public Result (String message){
        this.message=message;
    }

    public Result(boolean success, String message){
        this.success=success;
        this.message=message;
    }
}
