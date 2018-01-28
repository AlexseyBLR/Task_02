package dao;

import entity.criteria.Criteria;

import java.io.File;
import java.io.IOException;
import java.util.*;


public class FileParser {


    private File file;

    private Criteria criteria;

    public FileParser(File file, Criteria criteria) {
        this.file = file;
        this.criteria = criteria;
    }

    public Map<String, String> getApplianceMap(String appType) throws Exception {

        Map<String, String> appMap = null;


        List<String> criterians = getCriteriansList(this.criteria);

        try (Scanner reader = new Scanner(file)) {

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                if (line.startsWith(appType)) {
                    boolean checkForApp = lookingByCriterians(criterians, line);
                    if (checkForApp) {
                        String[] lineArr = getSortedLineArr(line);
                        appMap = constructMap(lineArr);
                    }
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e) {
            throw e;
        }
        return appMap;
    }

    private List<String> getCriteriansList(Criteria criteria) {

        Map<Object, Object> map = criteria.getCriteria();
        Set entitySet = map.entrySet();
        List<String> criterians = new ArrayList<String>();
        for (Object o : entitySet) {
            criterians.add(o.toString() + ",");
        }
        return criterians;
    }

    private boolean lookingByCriterians(List<String> criteriansList, String resultLine) {
        int count = 0;
        for (String buf : criteriansList) {
            String newBuf = buf.replace(',', ';');
            if (resultLine.contains(buf) || resultLine.contains(newBuf)) {
                count = count + 1;
            }
        }
        return criteriansList.size() == count;
    }

    private String[] getSortedLineArr(String line) {

        String[] lineArr = line.split(" ");
        String[] applProperiesArr = new String[lineArr.length - 2];
        System.arraycopy(lineArr, 2, applProperiesArr, 0, lineArr.length - 2);
        return applProperiesArr;
    }

    private Map<String, String> constructMap(String[] sortedList) {

        Map<String, String> map = new HashMap<String, String>();
        int lenght = sortedList.length;
        for (int i = 0; i < lenght; i++) {
            String property = sortedList[i];
            int spaceIndex = property.indexOf("=");
            String key = property.substring(0, spaceIndex);
            String value = property.substring((spaceIndex + 1), property.length() - 1);
            map.put(key, value);
        }
        return map;
    }

//
//
//
//
//
//
//
//
//        private List<String> listFileCreate() throws FileNotFoundException {
//        File fileForReading = new File(Property.path);
//        Scanner reader = new Scanner(fileForReading);
//        List<String> goodsList = new ArrayList<String>();
//        while (reader.hasNextLine()) {
//            String str = reader.nextLine();
//            String[] stringArr = str.split(" ");
//            Pattern p = Pattern.compile("[A-Za-z]*:");
//            for (int i = 0; i < stringArr.length; i++) {
//                Matcher m=p.matcher(stringArr[i]);
//                if(m.find()) {
//                    goodsList.add(stringArr[i]);
//                }
//
//            }
//        }
//        return goodsList;
//    }
//
//
//    public void mapp() throws FileNotFoundException {
//        Map<String, Integer> map = new HashMap<>();
//        for (int i = 0; i<listFileCreate().size(); i++){
//
//        }
//    }
//
//
//
//
//    public void print() throws FileNotFoundException {
//        for (int i = 0; i < checkOnEquipmentType().size(); i++) {
//            System.out.println(checkOnEquipmentType().get(i));
//        }
//    }

}
