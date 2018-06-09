package model;

import java.util.Date;

public abstract class DataModel{
    protected String userName;
    protected String text;
    protected Date datePosted;
    
    public String getUserName() {
        return userName;
    }

    public String getText() {
        return text;
    }

    public Date getDatePosted() {
        return datePosted;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setDatePosted(Date datePosted) {
        this.datePosted = datePosted;
    }
}
