package com.example.esportinformation;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Winner implements Serializable {
    @SerializedName("id")
    @Expose
    private Object id;
    @SerializedName("type")
    @Expose
    private Object type;

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public Object getType() {
        return type;
    }

    public void setType(Object type) {
        this.type = type;
    }
}
