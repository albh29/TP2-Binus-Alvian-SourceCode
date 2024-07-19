package com.example.catalogmakanan;

import java.io.Serializable;

public class Item implements Serializable {
    private String title;
    private String description;
    private int imageResource;
    private String detailInfo;

    public Item(String title, String description, int imageResource, String detailInfo) {
        this.title = title;
        this.description = description;
        this.imageResource = imageResource;
        this.detailInfo = detailInfo;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getDetailInfo() {
        return detailInfo;
    }
}

