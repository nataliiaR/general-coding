// word 1 is included in word 2


import java.util.ArrayList;
import java.util.Arrays;

public class IncludeWord {

    public static void main (String args []){
        String [] word2 = {"m","o","t","o","f"};
        String [] word1 = {"f","t","o"};
        IncludeWord wordVer = new IncludeWord();

        System.out.print(wordVer.isIncluded(word1, word2));
    }

    public String isIncluded(String [] word1, String [] word2) {
        String status = "The word is NOT included";
        ArrayList<String> word1arr = new ArrayList<String>(Arrays.asList(word1));
        ArrayList<String> word2arr = new ArrayList<String>(Arrays.asList(word2));
       // System.out.print(word1arr.size());
        //System.out.print(word2arr.size());
            for (int i = 0; i <= word2arr.size()-1; i++) {
                for (int j = 0; j < word1arr.size(); j++) {
                    if (word2arr.get(i) == word1arr.get(j) &&  (word1arr.size() >= 0) ){
                    word1arr.remove(word1arr.get(j));
                   // System.out.println(word1arr.size());
                }
                    if (word1arr.size() == 0){
                        status = "The word is included";
                        break;
                    }


            }

            }

        return status;
    }
}