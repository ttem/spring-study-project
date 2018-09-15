package org.student.domain;

import java.util.Date;

public class Article {

    private int id;
    private String title;
    private Date lastUpdate;
    private Author author;
    private ArticleTopic articleTopic;
    private String content;

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setArticleTopic(ArticleTopic articleTopic) {
        this.articleTopic = articleTopic;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public Author getAuthor() {
        return author;
    }

    public ArticleTopic getArticleTopic() {
        return articleTopic;
    }

    public String getContent() {
        return content;
    }
}
