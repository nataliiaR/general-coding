
import java.util.HashMap;


public class IncludeWordViaMap {


    public String isIncludedIn(Character[] word1, Character [] word2) {
        String status = "is Included";
        HashMap<Character, Integer> arrayTomap = writeArrayToMap(word1);

        for (int j = 0; j < word2.length; j++) {
            if (arrayTomap.get(word2[j]) == null || arrayTomap.get(word2[j]) == 0) {
                System.out.println(" key + " + word2[j] + " value in map + "+ arrayTomap.get(word2[j]));
                status = "Not Included";
                break;

            }
            if (arrayTomap.get(word2[j]) > 0)

            {

               arrayTomap.put(word2[j], arrayTomap.get(word2[j])-1);


            }

            }


            return status;

        }



    //write char [] to the map
    public HashMap <Character,Integer> writeArrayToMap (Character [] array){

        HashMap<Character, Integer> arrayTomap = new HashMap<Character, Integer>();

        for (int i=0; i<array.length; i++){
            if (arrayTomap.get(array[i]) == null){
                arrayTomap.put(array[i],1);
            }
            else {
                arrayTomap.put(array[i], arrayTomap.get(array[i])+1);
            }
            System.out.println(" key + " + array[i] + " value in map + "+ arrayTomap.get(array[i]));
        }

      return arrayTomap;

    }
}