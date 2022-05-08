package com.dikasihnama.jejama.home;

import android.content.Intent;

import androidx.annotation.NonNull;

public class ModelItem {

    private String title;
    private int icon;
    private String desc;
    private boolean expand;
    private String textbutton;

    public ModelItem(String title, int icon, String desc, String textbutton) {
        this.title = title;
        this.icon = icon;
        this.desc = desc;
        this.textbutton = textbutton;
        this.expand = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTextbutton() {
        return textbutton;
    }

    public void setTextbutton(String textbutton) {
        this.textbutton = textbutton;
    }


    public boolean isExpand() {
        return expand;
    }

    public void setExpand(boolean expand) {
        this.expand = expand;
    }

    @NonNull
    @Override
    public String toString() {
        return "title {"+
                ", icon='"+icon+'\''+
                ", desc='"+desc+'\''+
                ", textbutton='"+textbutton+'\''+
                ", expnad="+expand+'}';
    }
}
