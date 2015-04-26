package com.example.maxx.navtab;

/**
 * Created by maxx on 24/4/15.
 * This is for getter setter methods for our Navigation drawer item
 */
public class navDrawerItem {
    private String title;
    private int icon;
    private String count = "0";

    public navDrawerItem(){}

    public navDrawerItem(String title, int icon){
        this.title = title;
        this.icon = icon;
    }

    public navDrawerItem(String title, int icon, String count){
        this.title = title;
        this.icon = icon;
        this.count = count;
    }

    //Getter Methods

    public String getTitle(){
        return this.title;
    }

    public int getIcon(){
        return this.icon;
    }



    //Setter Methods

    public void setTitle(String title){
        this.title = title;
    }

    public void setIcon(int icon){
        this.icon = icon;
    }



}
