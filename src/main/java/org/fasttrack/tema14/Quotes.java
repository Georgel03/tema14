package org.fasttrack.tema14;

public class Quotes {

    private int id;

    private String author;

    private String quote;

    private boolean favourite;

    public Quotes(int id, String author, String quote, boolean favourite) {
        this.id = id;
        this.author = author;
        this.quote = quote;
        this.favourite = favourite;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getQuote() {
        return this.quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public boolean getFavourite() {
        return this.favourite;
    }

    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
    }

    public String toString() {
        return id + " | " + author + " | " + quote + " | " + favourite;
    }


}
