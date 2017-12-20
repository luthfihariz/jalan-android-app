
package com.luthfihariz.jalan.model.dao;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Attraction implements Serializable {

    @SerializedName("coordinate")

    private Coordinate coordinate;
    @SerializedName("rating")

    private String rating;
    @SerializedName("ta_id")

    private String tripAdvisorId;
    @SerializedName("title")

    private String title;
    @SerializedName("photos")

    private List<String> photos = new ArrayList<String>();
    @SerializedName("review_url")

    private String reviewUrl;
    @SerializedName("image_url")

    private String imageUrl;
    @SerializedName("description")

    private String description;
    @SerializedName("popularity")

    private String popularity;
    @SerializedName("review_tags")

    private List<String> reviewTags = new ArrayList<String>();
    @SerializedName("contact")

    private Contact contact;
    @SerializedName("reviews")

    private Object reviews;

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public String getRating() {
        return rating;
    }

    public String getTripAdvisorId() {
        return tripAdvisorId;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getPhotos() {
        return photos;
    }

    public String getSelectedPhoto() {
        /*if (photos != null && !photos.isEmpty()) {
            return photos.get(0);
        } else {
            return imageUrl;
        }*/
        return imageUrl.replace("photo-l", "photo-w");
    }

    public String getReviewUrl() {
        return reviewUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public String getPopularity() {
        return popularity;
    }

    public List<String> getReviewTags() {
        return reviewTags;
    }

    public Contact getContact() {
        return contact;
    }

    public Object getReviews() {
        return reviews;
    }
}
