package com.descomplica.Frameblog.models;
import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "Post")

public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long postId;
    private String  title;
    private String  content;
    private Date  date;

    @ManyToOne
    private User userId;

    public Post(final postId, final String title, final String content, final Date date, final User userId) {
        this.postId = postId;
        this.title = title;
        this.content = content;
        this.date = date;
        this.userId = userId;
    }


    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }
}
