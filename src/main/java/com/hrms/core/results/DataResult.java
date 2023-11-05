package com.hrms.core.results;

public class DataResult<T> extends Result{
    T data;
    public DataResult(boolean success,T data) {
        super(success);
        this.data=data;
    }

    public DataResult(String message, T data) {
        super(message);
        this.data=data;
    }

    public DataResult(boolean success, T data, String message) {
        super(success, message);
        this.data=data;
    }
}
