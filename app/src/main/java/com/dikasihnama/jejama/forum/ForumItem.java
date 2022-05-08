package com.dikasihnama.jejama.forum;

public class ForumItem {

    private String name;
    private String timePost;
    private String comments;
    private String likes;
    private String posts;
    private int images;

    public ForumItem(String name, String timePost, String comments, String likes, String posts, int images) {
        this.name = name;
        this.timePost = timePost;
        this.comments = comments;
        this.likes = likes;
        this.posts = posts;
        this.images = images;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimePost() {
        return timePost;
    }

    public void setTimePost(String timePost) {
        this.timePost = timePost;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getPosts() {
        return posts;
    }

    public void setPosts(String posts) {
        this.posts = posts;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }
}
