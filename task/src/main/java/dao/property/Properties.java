package dao.property;

import dao.FileLoader;

import java.io.File;
import java.io.IOException;

public class Properties {

    public static final StringBuilder file() throws IOException {
        FileLoader loader = new FileLoader("goods_DB.txt");
        StringBuilder stringBuilder = loader.getLoadedText();
        return stringBuilder;
    }

}
