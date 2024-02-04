package com.irs.mapstructexample.model.dto;

import java.util.Date;
import java.util.Set;

public class BookDTO {
    private Long idBook;
    private String title;
    private Date releaseDate;
    private Set<AuthorDTO> authors;

    public BookDTO() {
        super();
        this.idBook = null;
        this.title = null;
        this.releaseDate = null;
        this.authors = null;
    }

    public Long getIdBook() {
        return idBook;
    }

    public void setIdBook(Long idBook) {
        this.idBook = idBook;
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

    public Set<AuthorDTO> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<AuthorDTO> authors) {
        this.authors = authors;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("BookDTO{idBook=");
        sb.append(idBook);
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
