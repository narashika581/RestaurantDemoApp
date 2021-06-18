package com.example.techteamdemoapp;

public class MyListData {
    String restaurantName, restaurantAdd, restaurantCuisine, restaurantTimings;
    int ImageID;
    float ratings;
    public MyListData() {
    }

    public MyListData(String restaurantName, String restaurantAdd, String restaurantCuisine, String restaurantTimings, int imageID, float ratings) {
        this.restaurantName = restaurantName;
        this.restaurantAdd = restaurantAdd;
        this.restaurantCuisine = restaurantCuisine;
        this.restaurantTimings = restaurantTimings;
        ImageID = imageID;
        this.ratings = ratings;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantAdd() {
        return restaurantAdd;
    }

    public void setRestaurantAdd(String restaurantAdd) {
        this.restaurantAdd = restaurantAdd;
    }

    public String getRestaurantCuisine() {
        return restaurantCuisine;
    }

    public void setRestaurantCuisine(String restaurantCuisine) {
        this.restaurantCuisine = restaurantCuisine;
    }

    public String getRestaurantTimings() {
        return restaurantTimings;
    }

    public void setRestaurantTimings(String restaurantTimings) {
        this.restaurantTimings = restaurantTimings;
    }

    public int getImageID() {
        return ImageID;
    }

    public void setImageID(int imageID) {
        ImageID = imageID;
    }

    public float getRatings() {
        return ratings;
    }

    public void setRatings(float ratings) {
        this.ratings = ratings;
    }
}
