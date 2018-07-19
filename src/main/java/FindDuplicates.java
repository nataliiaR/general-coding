
import java.lang.reflect.Array;
import java.util.*;

public class FindDuplicates {


    // find the elements that are duplicates using the map data structure
    public Set<Integer> makeASet(int[] listWithDuplicates) {
        Set<Integer> setwithNoduplicates = new HashSet<>();
        for (int i = 0; i < listWithDuplicates.length; i++) {
            setwithNoduplicates.add(listWithDuplicates[i]);
        }

        return setwithNoduplicates;
    }

    // find the elements that are duplicates using ArrayList data structure
    public ArrayList<Integer> removeDuplicates(int[] listWithDuplicates) {

        ArrayList<Integer> listWithNoDuplicates = new ArrayList<>();
        for (int i = 0; i < listWithDuplicates.length; i++) {
            boolean exist = false;
            for (int integer : listWithNoDuplicates) {
                if (listWithDuplicates[i] == integer) {
                    exist = true;
                    break;
                }

            }
            if (exist == false) {

                listWithNoDuplicates.add(listWithDuplicates[i]);
            }
        }


        return listWithNoDuplicates;
    }

    //find elements that appears only once in the list - using map to store key/value and then list to write down needed values

    public ArrayList<Integer> extractUnique(Integer[] array) {
        ArrayList <Integer> unique = new ArrayList<>();
        //write a map
        HashMap<Integer, Integer> extractedUniqueElements = new HashMap<>();
        for (int i = 0; i < array.length; i++) {

            if (extractedUniqueElements.get(array[i]) == null) {
                extractedUniqueElements.put(array[i], 1);

            } else {

                extractedUniqueElements.put(array[i], extractedUniqueElements.get(array[i]) + 1);

            }
        }

        Iterator it = extractedUniqueElements.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry pair = (Map.Entry)it.next();

                if(new Integer(pair.getValue().toString())==1){
                    unique.add(new Integer(pair.getKey().toString()));

                }
            }

        return unique;


    }

}

