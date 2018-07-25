
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import java.util.*;


public class FindMedianaReadFile {
    public static void main (String [] args){

        FindMedianaReadFile file = new FindMedianaReadFile();
        String path = "person_data_file";
        file.medianValues(path);
    }


    public HashMap <String, Integer> medianValues (String path){
        HashMap<String, Integer> medianValuesMap = new HashMap<>();
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBuffer = new StringBuffer();
            String line;
            HashMap<String, ArrayList<String>> hash_map = new HashMap<>();

            while ((line = bufferedReader.readLine()) != null) {
                ArrayList<String> current = new ArrayList<>();

                if (hash_map.get(line.split(",")[1]) == null){

                    current.add(line.split(",")[2]);

                    hash_map.put(line.split(",")[1],current);
                    
                }
                else {
                    current = hash_map.get(line.split(",")[1]);
                    current.add(line.split(",")[2]);
                    hash_map.put(line.split(",")[1],current);
                }
            }

            fileReader.close();
            System.out.println("Contents of file:");
            Iterator it = hash_map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry pair = (Map.Entry)it.next();
                System.out.println(pair.getKey() + " = " + pair.getValue());
                System.out.println(pair.getKey() + " median = " + median((ArrayList<String>) pair.getValue()));
                it.remove();

        }


        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return medianValuesMap;
    }

    public Integer median (ArrayList<String> arraylist){
        Integer medianValue = 0;
        Collections.sort(arraylist);
        int i = (arraylist.size())%2;
        medianValue = Integer.parseInt(arraylist.get(i));
        return medianValue;

    }

    /*public HashMap<String, ArrayList<String>> writeToHashMap (String line){
        ArrayList<String> current = new ArrayList<>();
        HashMap<String, ArrayList<String>> hash_map = new HashMap<>();

        if (hash_map.get(line.split(",")[1]) == null){

            current.add(line.split(",")[2]);

            hash_map.put(line.split(",")[1],current);

            System.out.println("for this key " + line.split(",")[1] + " we have this value " + hash_map.get(line.split(",")[1]));
        }
        else {
            current = hash_map.get(line.split(",")[1]);
            current.add(line.split(",")[2]);
            hash_map.put(line.split(",")[1],current);


        }

        return hash_map;
    }*/

}
