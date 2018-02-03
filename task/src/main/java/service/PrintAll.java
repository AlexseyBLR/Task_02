package service;

import dao.Shop;

import java.io.FileNotFoundException;

public class PrintAll {

    Search search = new Search();
    Shop shop = new Shop();

    public void printDB() throws FileNotFoundException {
        System.out.println("All goods in the shop: ");

        for (int i = 0; i < shop.goodsListCreate().size(); i++) {
            System.out.println(shop.goodsListCreate().get(i));
        }
    }

}
