package com.example.esportinformation;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Live implements Serializable {
    @SerializedName("opens_at")
    @Expose
    private Object opensAt;
    @SerializedName("supported")
    @Expose
    private Boolean supported;
    @SerializedName("url")
    @Expose
    private Object url;

    public Object getOpensAt() {
        return opensAt;
    }

    public void setOpensAt(Object opensAt) {
        this.opensAt = opensAt;
    }

    public Boolean getSupported() {
        return supported;
    }

    public void setSupported(Boolean supported) {
        this.supported = supported;
    }

    public Object getUrl() {
        return url;
    }

    public void setUrl(Object url) {
        this.url = url;
    }
}
