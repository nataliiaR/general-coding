
import java.util.ArrayList;


public class IncludeWordEasy {
    public static void main (String args []){
        String [] word2 = {"m","o","t","o","f"};
        String [] word1 = {"f","t","o"};
        IncludeWordEasy check = new IncludeWordEasy();
        System.out.print(check.isIncludedIn(word1,word2));
    }

    public String isIncludedIn(String[] word1, String [] word2) {
        String status = "isNotIncluded";
        ArrayList<String> equalword = new ArrayList<String>();
        int i = 0;
        int j= -1;
        if (j == word2.length-1){
            i=i+1;
        }

        j=j+1;

        for(;j < word2.length && i< word1.length;) {

            if (word1[i] == word2[j]) {
                equalword.add(word2[j]);

            }

        }


        System.out.println("word 2 " + word2.length);
        System.out.println("equalword " + equalword.size());
        if (equalword.size() == word2.length) {

            status = "The word is included";

        }
            return status;

        }

}