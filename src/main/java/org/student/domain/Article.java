package org.student.domain;

import org.apache.commons.lang3.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

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
        this.title = StringUtils.stripToNull(title);
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
        this.content = StringUtils.stripToNull(content);
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

    public String getFormattedLastUpdate() {
        return Optional.ofNullable(lastUpdate)
                .map(date -> new SimpleDateFormat("dd/MM/yyyy").format(lastUpdate))
                .orElse("Unknown date");
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

    public String getAbbreviatedContent() {
        return Optional.ofNullable(content)
                .map(content -> StringUtils.abbreviate(content, 40))
                .orElse("No content");
    }
}
