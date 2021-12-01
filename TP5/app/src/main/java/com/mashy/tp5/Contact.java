package com.mashy.tp5;

public class Contact {
    private String lastName,firstName,imageUrl;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Contact(String lastName, String firstName, String imageUrl) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.imageUrl = imageUrl;
    }

    public Contact(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
