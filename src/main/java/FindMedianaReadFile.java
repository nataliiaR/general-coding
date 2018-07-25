
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import java.util.*;


public class FindMedianaReadFile {

    public static void main (String [] args){

        FindMedianaReadFile file = new FindMedianaReadFile();
        String path = "person_data_file";
        HashMap<String,Integer> hash_map = file.medianValues(path);
        System.out.println("Contents of file:");
        Iterator it = hash_map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println("City " + pair.getKey() + " median age value " + pair.getValue());
            it.remove();

        }

    }

    public HashMap <String, Integer> medianValues (String path){
        HashMap<String, Integer> medianValuesMap = new HashMap<>();
        HashMap<String, ArrayList<String>> hash_map = new HashMap<>();
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

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
            Iterator it = hash_map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry pair = (Map.Entry)it.next();
                medianValuesMap.put((String) pair.getKey(),median((ArrayList<String>) pair.getValue()));
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


}
