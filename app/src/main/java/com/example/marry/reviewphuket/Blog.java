package com.example.marry.reviewphuket;

/**
 * Created by merry on 12/10/2017.
 */

public class Blog {
    private  String title;
    private  String desc;
    private  String image;

    public Blog(){

    }

    public Blog(String title,String desc, String image){
        this.title = title;
        this.desc = desc;
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
