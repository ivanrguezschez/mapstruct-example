package com.irs.mapstructexample.model.dto;

import java.util.Date;
import java.util.Set;

public class AuthorDTO {

    private Long idAuthor;
    private String name;
    private String surname;
    private Date birthDate;
    private Set<BookDTO> books;

    public AuthorDTO() {
        super();
        this.idAuthor = null;
        this.name = null;
        this.surname = null;
        this.birthDate = null;
        this.books = null;
    }

    public Long getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(Long idAuthor) {
        this.idAuthor = idAuthor;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Set<BookDTO> getBooks() {
        return books;
    }

    public void setBooks(Set<BookDTO> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("AuthorDTO{idAuthor=");
        sb.append(idAuthor);
        sb.append(", name=");
        sb.append(name);
        sb.append(", surname=");
        sb.append(surname);
        sb.append(", birthDate=");
        sb.append(birthDate);
        sb.append(", books=[");
        if (books != null && !books.isEmpty()) {
            books.stream().forEach(sb::append);
        }
        sb.append("]}");

        return sb.toString();
    }
}
