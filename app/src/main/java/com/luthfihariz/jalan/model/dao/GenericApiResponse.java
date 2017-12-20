package com.luthfihariz.jalan.model.dao;

/**
 * Created by luthfihariz on 11/15/16.
 */

public class GenericApiResponse<R> {
    private String status;
    private R data;

    public String getStatus() {
        return status;
    }

    public R getData() {
        return data;
    }
}
