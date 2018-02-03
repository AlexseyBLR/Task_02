package dao;



import dao.property.Properties;

import java.io.FileNotFoundException;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;


public class Parser {

    private List<String> fileRead() throws FileNotFoundException {
        Scanner scanner = null;
        try {
            scanner = new Scanner(String.valueOf(Properties.file()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        List<String> stringList = new ArrayList<String>();
        while (scanner.hasNextLine()) {
            stringList.add(scanner.nextLine());
        }
        return stringList;
    }

    private List<String> emptyStringDelete() throws FileNotFoundException {
        List<String> emptyStrDeleteList = new ArrayList<String>();
        for (int i = 0; i < fileRead().size(); i++) {
            if (fileRead().get(i).length() != 0) {
                emptyStrDeleteList.add(fileRead().get(i));
            }
        }
        return emptyStrDeleteList;
    }

    private String getGoodsType(String string) {
        String[] strings = string.split(" ");
        return strings[0];
    }

    private String commaDelete(String string) {
        String[] mass = string.split(",");
        return mass[0];
    }

    private Map<String, String> getParameterAndValueMap(String string) {
        Map<String, String> parameterAndValueMap = new HashMap<String, String>();
        String[] strings = string.split(" ");
        for (int i = 2; i < strings.length; i++) {
            String[] parameterAndValueMass = strings[i].split("=");
            String parameter = parameterAndValueMass[0];
            String value = commaDelete(parameterAndValueMass[1]);
            parameterAndValueMap.put(parameter, value);
        }
        return parameterAndValueMap;
    }




    public Map<String, Map<String, String>> fillGoodsMap() throws FileNotFoundException {
        Map<String, Map<String, String>> goodsMap = new HashMap<String, Map<String, String>>();
        for (int i = 0; i < emptyStringDelete().size(); i++) {

            goodsMap.put(getGoodsType(emptyStringDelete().get(i)), getParameterAndValueMap(emptyStringDelete().get(i)));
        }
        return goodsMap;
    }



}
