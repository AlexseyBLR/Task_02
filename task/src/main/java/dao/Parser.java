package dao;

import dao.property.Properties;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Parser {

    private List<String> fileRead() throws FileNotFoundException {
        File file = new File(Properties.path);
        Scanner scanner = new Scanner(file);
        List<String> stringList = new ArrayList<String>();
        while (scanner.hasNextLine()) {
            stringList.add(scanner.nextLine());
        }
        return stringList;
    }

    private List<String> emptyStrDelete() throws FileNotFoundException {
        List<String> emptyStrDeleteList = new ArrayList<String>();
        for (int i = 0; i < fileRead().size(); i++) {
            if (fileRead().get(i).length() != 0) {
                emptyStrDeleteList.add(fileRead().get(i));
            }
        }
        return emptyStrDeleteList;
    }

    public void pr() throws FileNotFoundException {
        for(int i= 0; i<emptyStrDelete().size(); i++){
            String [] s = emptyStrDelete().get(i).split(" ");
            System.out.println(s.length);
        }
    }

    public List<String> getStrList() throws FileNotFoundException {
        return emptyStrDelete();
    }

    public String[] getWordList(String string){ //массив строк из большой строки
        String [] strings = string.split(" ");
        return strings;
    }

    public String getTypeFromFile(String[] strings){
        String type = strings[0];
        return type;
    }

    public String getQuantityFromFile(String[] strings){
        String nameAndValue = strings[2];
        String [] nameAndTypeMass = nameAndValue.split("=");
        String valueWithComma = nameAndTypeMass[1];
        String [] value =valueWithComma.split(",");
        return value[0];
    }


}
