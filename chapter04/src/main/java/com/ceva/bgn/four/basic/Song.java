package com.ceva.bgn.four.basic;

public abstract class Song {
    String key;
    String title;
    String content;
    String timeSignature;
    float timeDuration;

    public  Song(String title, String content){
        this.title = title;
        this.content = content;
    }

    public Song(String key, String title, String content){
        this(title, content);
        this.content = content;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTimeSignature() {
        return timeSignature;
    }

    public void setTimeSignature(String timeSignature) {
        this.timeSignature = timeSignature;
    }

    public float getTimeDuration() {
        return timeDuration;
    }

    public void setTimeDuration(float timeDuration) {
        this.timeDuration = timeDuration;
    }
}
