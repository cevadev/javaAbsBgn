package com.ceva.bgn.four.basic;

public class Hymn extends Song{
    String category;

    public Hymn(String title, String content, String category){
        super(title, content);
        this.category = category;
    }
}
