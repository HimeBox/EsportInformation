package com.example.esportinformation;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Opponent_ {
    @SerializedName("first_name")
    @Expose
    private Object firstName;
    @SerializedName("hometown")
    @Expose
    private Object hometown;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("image_url")
    @Expose
    private Object imageUrl;
    @SerializedName("last_name")
    @Expose
    private Object lastName;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("role")
    @Expose
    private Object role;
    @SerializedName("slug")
    @Expose
    private Object slug;

    public Object getFirstName() {
        return firstName;
    }

    public void setFirstName(Object firstName) {
        this.firstName = firstName;
    }

    public Object getHometown() {
        return hometown;
    }

    public void setHometown(Object hometown) {
        this.hometown = hometown;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Object getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Object imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Object getLastName() {
        return lastName;
    }

    public void setLastName(Object lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getRole() {
        return role;
    }

    public void setRole(Object role) {
        this.role = role;
    }

    public Object getSlug() {
        return slug;
    }

    public void setSlug(Object slug) {
        this.slug = slug;
    }
}
