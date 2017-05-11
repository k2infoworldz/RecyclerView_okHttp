package com.k2infosoft.model;

import android.graphics.Bitmap;

import java.io.Serializable;

/**
 * Created by admin 54 on 5/6/2017.
 */

public class DocumentDetail implements Serializable {

    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String mobile;
    private String profilepic;
    private String bio;
    private Bitmap image;

    public DocumentDetail() {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.profilepic = profilepic;
        this.bio = bio;
        this.image = image;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProfilepic() {
        return profilepic;
    }

    public void setProfilepic(String profilepic) {
        this.profilepic = profilepic;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }
}
