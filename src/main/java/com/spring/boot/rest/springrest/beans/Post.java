package com.spring.boot.rest.springrest.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Post {
    @Id
    private int id;
    private String postdate;
    @ManyToOne //Many Post to One User
    private User user;
    private String details;

    public  Post(){

    }

    public Post(int id, String postdate, User user, String details) {
        this.id = id;
        this.postdate = postdate;
        this.user = user;
        this.details = details;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPostdate() {
        return postdate;
    }

    public void setPostdate(String postdate) {
        this.postdate = postdate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", postdate='" + postdate + '\'' +
                ", user=" + user +
                ", details='" + details + '\'' +
                '}';
    }
}
