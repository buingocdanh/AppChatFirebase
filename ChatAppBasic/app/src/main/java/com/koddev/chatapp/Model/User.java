package com.koddev.chatapp.Model;

public class User {

    private String id;
    private String username;
    private String image;
    private String status;
    private String search;
    public String thumb_image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public User(String id, String username, String image, String status, String search, String thumb_image) {
        this.id = id;
        this.username = username;
        this.image = image;
        this.status = status;
        this.search = search;
        this.thumb_image=thumb_image;
    }

    public User() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }




    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }
    public String getThumb_image() {
        return thumb_image;
    }

    public void setThumb_image(String thumb_image) {
        this.thumb_image = thumb_image;
    }
}
