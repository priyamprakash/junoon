package com.mitm.junoon.Extra;

import androidx.annotation.Keep;

@Keep
public class Post {
    String title;
    String description;
    String author;
//Primary constructor hai
    public Post() {
    }
//convert to string
    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
//getter and seter for all three strings
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


}
