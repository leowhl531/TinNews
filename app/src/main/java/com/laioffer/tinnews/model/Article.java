package com.laioffer.tinnews.model;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;
import java.util.Objects;

@Entity
public class Article implements Serializable {

    public String author;
    public String title;
    public String description;

    @NonNull
    @PrimaryKey
    public String url;
    public String urlToImage;
    public String publishedAt;
    public String content;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Article)) return false;
        Article article = (Article) o;
        return Objects.equals(author, article.author) &&
                Objects.equals(title, article.title) &&
                Objects.equals(description, article.description) &&
                url.equals(article.url) &&
                Objects.equals(urlToImage, article.urlToImage) &&
                Objects.equals(publishedAt, article.publishedAt) &&
                Objects.equals(content, article.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title, description, url, urlToImage, publishedAt, content);
    }
}
