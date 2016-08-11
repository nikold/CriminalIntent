package com.example.nikol.criminalintent;

import java.util.UUID;

public class Crime {
    public UUID getId() {
        return mId;
    }

    private UUID mId;

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    private String mTitle;

    public Crime() {
        mId = UUID.randomUUID();
    }

}

