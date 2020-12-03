package com.galikpeter11.librarion9000.data.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String title;
    private Integer releaseYear;
    private Integer numberOfPages;
    private String content;

    public Book() {
    }

    public Book(String title, Integer releaseYear, Integer numberOfPages, String content) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.numberOfPages = numberOfPages;
        this.content = content;
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

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (!id.equals(book.id)) return false;
        if (!title.equals(book.title)) return false;
        if (!Objects.equals(releaseYear, book.releaseYear)) return false;
        if (!Objects.equals(numberOfPages, book.numberOfPages))
            return false;
        return Objects.equals(content, book.content);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + title.hashCode();
        result = 31 * result + (releaseYear != null ? releaseYear.hashCode() : 0);
        result = 31 * result + (numberOfPages != null ? numberOfPages.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        return result;
    }
}
