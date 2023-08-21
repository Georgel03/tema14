package org.fasttrack.tema14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\gstan\\IdeaProjects\\curs14\\src\\main\\java\\org\\fasttrack\\tema14\\quotes.txt");
        Scanner scanner = new Scanner(file);
        List<String> linesFromFile = new ArrayList<>();

        while (scanner.hasNextLine()) {
           String currentLine = scanner.nextLine();
           linesFromFile.add(currentLine);
        }

        List<Quotes> quotesList = transformLineIntoObject(linesFromFile);

        //Ex 1
        QuotesService quotesService = new QuotesService();
        quotesService.quotesList = transformLineIntoObject(linesFromFile);
        System.out.println(quotesService.getAllQuotes());
        System.out.println("---------------------------------------------");

        //Ex 2
        System.out.println(quotesService.getQuotesForAuthor("Albert Eistein"));
        System.out.println("--------------------------------------------");

        //Ex 3
        System.out.println(quotesService.getAuthors());
        System.out.println("-------------------------------------------");

        //Ex 4
        System.out.println(quotesService.quotesList);
        quotesService.setFavourite(4532);
        System.out.println(quotesService.quotesList);
        System.out.println("----------------------------------------------------");

        //Ex 5
        System.out.println(quotesService.getFavourites());
        System.out.println("-----------------------------------------------------");

        //Ex 6
        System.out.println(quotesService.getRandomQuote());

    }

    public static List<Quotes> transformLineIntoObject(List<String> linesFromFile) {

        List<Quotes> quotesList = new ArrayList<>();
        int id = 0;

        for (String currentLine : linesFromFile) {
            String[] currentQuote = currentLine.split("~");
            Random random = new Random();
            Quotes quotes = new Quotes(id, currentQuote[0], currentQuote[1], random.nextBoolean());
            id++;
            quotesList.add(quotes);
        }

        return quotesList;
    }
}