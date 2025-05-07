package com.example.myuniversity;

public class ListData {
    private String title;
    private String description;
    private int image;

    public ListData(String title, String description, int image) {
        this.title = title;
        this.description = description;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }
}
