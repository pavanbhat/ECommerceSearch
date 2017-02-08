package com.pavan.ilovezappos.model;

import com.google.gson.annotations.SerializedName;
import com.pavan.ilovezappos.model.Result;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;

/**
 * @author Pavan Prabhakar Bhat
 * @version 1.0
 * @date 2/6/2017.
 */

public class product_extraction {

    @SerializedName("originalTerm")
    private String originalTerm;
    @SerializedName("currentResultCount")
    private String currentResultCount;
    @SerializedName("totalResultCount")
    private String totalResultCount;
    @SerializedName("term")
    private String term;
    @SerializedName("results")
    private List<Result> results = null;
    @SerializedName("statusCode")
    private String statusCode;
    @SerializedName("additionalProperties")
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getOriginalTerm() {
        return originalTerm;
    }

    public void setOriginalTerm(String originalTerm) {
        this.originalTerm = originalTerm;
    }

    public String getCurrentResultCount() {
        return currentResultCount;
    }

    public void setCurrentResultCount(String currentResultCount) {
        this.currentResultCount = currentResultCount;
    }

    public String getTotalResultCount() {
        return totalResultCount;
    }

    public void setTotalResultCount(String totalResultCount) {
        this.totalResultCount = totalResultCount;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }


}
