package service;

import dao.Parser;
import entity.Criteria.CriteriaType;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

public class Shop {

    public Map<Integer, CriteriaType.Goods> allGoodsMapCreator() throws FileNotFoundException {
        Parser parser = new Parser();
        Map<Integer, CriteriaType.Goods> goods = new HashMap<Integer, CriteriaType.Goods>();
        for (int i = 0; i < parser.getStrList().size(); i++) {
            String type = parser.getTypeFromFile(parser.getWordList(parser.getStrList().get(i)));
            if (type.equals("Bike")) {
                int value = Integer.parseInt(parser.getQuantityFromFile(parser.getWordList(parser.getStrList().get(i))));
                goods.put(value, CriteriaType.Goods.BIKE);
            } else {
                if (type.equals("Scateboard")) {
                    int value = Integer.parseInt(parser.getQuantityFromFile(parser.getWordList(parser.getStrList().get(i))));
                    goods.put(value, CriteriaType.Goods.SCATEBOARD);
                }
            }
        }
        return goods;
    }

    public void mapPrint() throws FileNotFoundException {
        for(Map.Entry<Integer, CriteriaType.Goods> mapPrint : allGoodsMapCreator().entrySet())
        {
            System.out.println("Type= "+mapPrint.getValue()+ ", quantity= "+mapPrint.getKey());
        }
    }

}
