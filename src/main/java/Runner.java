// word 1 is included in word 2
//word 1 = to and word 2 = motor


import java.util.ArrayList;
import java.util.Arrays;

public class Runner {

    public static void main (String args []){
        String [] word2 = {"m","o","t","o","f"};
        String [] word1 = {"f","t"};
        IncludeWord wordVer = new IncludeWord();
        //ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(word1));
       // for (String el:arrayList){
         //   System.out.print(el);
        //}
        System.out.print(wordVer.isIncluded(word1, word2));

    }
}

