package main;

import dao.Parser;
import service.Shop;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Shop shop = new Shop();
        shop.mapPrint();
    }
}
