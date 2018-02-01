package main;

import dao.Parser;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //Shop shop = new Shop();
        Parser parser = new Parser();
        parser.print();
    }
}
