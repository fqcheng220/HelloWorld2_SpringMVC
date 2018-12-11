package com.fqcheng220.result;

public class  CommonResult<T> {
    public int mStatusCode;
    public String mMsg;
    public T mBody;

    public CommonResult status(int mStatusCode){
        this.mStatusCode = mStatusCode;
        return this;
    }

    public CommonResult body(T body){
        this.mBody = body;
        return this;
    }
}
