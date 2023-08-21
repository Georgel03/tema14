package org.fasttrack.tema14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuotesService {

    protected List<Quotes> quotesList;

    public QuotesService() {
        this.quotesList = new ArrayList<>();
    }

    public List<String> getAllQuotes() {

        List<String> allQuotes = new ArrayList<>();

        if (quotesList != null) {
            for (Quotes quote : quotesList) {
                allQuotes.add(quote.getQuote());
            }
        }
        else {
            System.out.println("Lista este goala!");
            return new ArrayList<>();
        }

        return allQuotes;
    }

    public List<Quotes> getQuotesForAuthor(String author) {

        List<Quotes> myList = new ArrayList<>();
        boolean found = false;

        for (Quotes quote : quotesList) {
            if (quote.getAuthor().equals(author)) {
                found = true;
                myList.add(quote);
            }
        }

        if (found == false) {
            System.out.println("Autor negasit!");
            return null;
        }

        return myList;
    }

    public List<String> getAuthors() {

        List<String> authorsList = new ArrayList<>();

        if (quotesList != null) {
            for (Quotes quote : quotesList) {
                authorsList.add(quote.getAuthor());
            }
        }
        else {
            System.out.println("Lista este goala!");
            return new ArrayList<>();
        }

        return authorsList;
    }

    public void setFavourite(int id) {

        if (quotesList != null) {
            for (Quotes quote : quotesList) {
                if (quote.getId() == id) {
                    quote.setFavourite(true);
                    break;
                }
            }
        }
        else {
            System.out.println("Lista este goala!");
        }

    }

    public List<Quotes> getFavourites() {

        boolean found = false;
        List<Quotes> myList = new ArrayList<>();

        for (Quotes quotes : quotesList) {
            if (quotes.getFavourite() == true) {
                found = true;
                myList.add(quotes);
            }
        }
        if (found == false) {
            System.out.println("Nu avem nici un citat favorit");
            return new ArrayList<>();
        }

        return myList;
    }

    public String getRandomQuote() {

        Random random = new Random(System.currentTimeMillis());
        boolean found = false;
        String phrase = new String();

        for (Quotes quote : quotesList) {
            if (quote.getId() == random.nextInt(5420 - 0 + 1) + 0) {
                found = true;
                phrase = quote.getQuote();
            }
        }
        if (found == false) {

            return "Fraza invalida!";
        }

        return phrase;
    }
}
