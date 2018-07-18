
import java.util.*;

public class FindDuplicates {


    public static void main (String [] args ){

        int [] listWithDuplicates = {1,1,65,34,76,65,3,1};
        FindDuplicates finder = new FindDuplicates();
        ArrayList<Integer> listwithNoduplicates= finder.removeDuplicates(listWithDuplicates);
        Set<Integer> setwithNoDuplicates= finder.makeASet(listWithDuplicates);

        for (Integer integer :listwithNoduplicates){
            System.out.println ("list with no duplicates per element  " + integer);

        }
        for(Integer integer:setwithNoDuplicates){
           System.out.println ("set with no duplicates per element  " + integer);
        }

    }



    public Set<Integer> makeASet (int [] listWithDuplicates){
         Set<Integer> setwithNoduplicates = new HashSet<Integer>();
         for (int i= 0; i<listWithDuplicates.length; i++){
             setwithNoduplicates.add(listWithDuplicates[i]);
         }

         return setwithNoduplicates;
    }


    public ArrayList<Integer> removeDuplicates (int [] listWithDuplicates){

            ArrayList<Integer> listWithNoDuplicates = new ArrayList<Integer>();
            for (int i = 0; i< listWithDuplicates.length; i++){
            boolean exist = false;
            for (int integer: listWithNoDuplicates){
                if (listWithDuplicates[i]==integer){
                    exist = true;
                    System.out.println("value of exist when we check a list  "+ exist);
                    break;
                }

            }
            if (!exist){
                System.out.println("value of exist when we add to the list  "+ exist);
                listWithNoDuplicates.add(listWithDuplicates[i]);
            }
        }



        return  listWithNoDuplicates;
    }


}
