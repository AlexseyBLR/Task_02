package dao;

import dao.property.Properties;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Parser {

    private Map<String, Map<String, String>> goodsMap = new HashMap<String, Map<String, String>>();

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


    private String getGoodsType(String string) {
        String[] strings = string.split(" ");
        return strings[0];
    }

    private String[] getStringMass(String string) {
        String[] strings = string.split(" ");
        return strings;
    }

    private String getGoodsParameter(String string, int position) {
        String[] parameterAndValue = string.split(" ");
        String[] parameter = parameterAndValue[position].split("=");
        return parameter[0];
    }

    private String getGoodsParameterValue(String string, int position) {
        String[] parameterAndValue = string.split(" ");
        String[] parameter = parameterAndValue[position].split("=");
        return parameter[1];
    }


    private String charDelete(String string) {
        String[] mass = string.split(",");
        return mass[0];
    }


    private Map<String, String> getParameterAndValueMap(String string) {
        Map<String, String> parameterAndValueMap = new HashMap<String, String>();
        String[] strings = string.split(" ");
        for (int i = 2; i < strings.length; i++) {
            String[] parameterAndValueMass = strings[i].split("=");
            String parameter = parameterAndValueMass[0];
            String value = charDelete(parameterAndValueMass[1]);
            parameterAndValueMap.put(parameter, value);
        }

        return parameterAndValueMap;
    }


    private Map<String, Map<String, String>> fillMap() throws FileNotFoundException {
        for (int i = 0; i < emptyStrDelete().size(); i++) {

            goodsMap.put(getGoodsType(emptyStrDelete().get(i)), getParameterAndValueMap(emptyStrDelete().get(i)));
        }
        return goodsMap;
    }

    public void print() throws FileNotFoundException {
        System.out.println(fillMap());
    }



}
