package pl.teslachorzow.Apierwszyprogram1;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

public class Main03 {
    public static void main(String[] args) {
        ChuckNorrisQuotes jokes = new ChuckNorrisQuotes();
        for (int i = 0; i < 3; i++ ) {
            System.out.println(jokes.getRandomQuote());
            System.out.println("----------");
        }
    }
}
