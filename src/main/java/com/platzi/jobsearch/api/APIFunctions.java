package com.platzi.jobsearch.api;

import feign.Feign;
import feign.gson.GsonDecoder;

public interface APIFunctions {
    static <T> T buildAPI(Class<T> aClass, String url){
        return Feign.builder() //Create web client
                .decoder(new GsonDecoder()) //De-codification using GsonDecoder
                .target(aClass,url); //Selecting target
    }
}
