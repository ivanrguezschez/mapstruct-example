package com.irs.mapstructexample.model.entity;

import java.util.Date;
import java.util.Set;

public class Book {

    private Long id;
    private String title;
    private Date releaseDate;
    private Set<Author> authors;

    public Book() {
        super();
        this.id = null;
        this.title = null;
        this.releaseDate = null;
        this.authors = null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Book{id=");
        sb.append(id);
        sb.append(", title=");
        sb.append(title);
        sb.append(", releaseDate=");
        sb.append(releaseDate);
        sb.append(", authors=[");
        if (authors != null && !authors.isEmpty()) {
            authors.stream().forEach(sb::append);
        }
        sb.append("]}");

        return sb.toString();
    }
}
