package com.irs.mapstructexample.model.entity;

import java.util.Date;
import java.util.Set;

public class Author {

    private Long id;
    private String name;
    private String surname;
    private Date birthDate;
    private Set<Book> books;

    public Author() {
        super();
        this.id = null;
        this.name = null;
        this.surname = null;
        this.birthDate = null;
        this.books = null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Author{id=");
        sb.append(id);
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
