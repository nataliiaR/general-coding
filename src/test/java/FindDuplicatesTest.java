import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class FindDuplicatesTest {

    @Test
    public void removeDuplicatesTest(){
        int [] listWithDuplicates = {1,65,1,65,34,76,65,3,1};
        Integer[] expected = {1,65,34,76,3};
        FindDuplicates finder = new FindDuplicates();
        ArrayList<Integer> actualList= finder.removeDuplicates(listWithDuplicates);
        ArrayList<Integer> expectedList = new ArrayList<Integer>(Arrays.asList(expected));

        Assert.assertEquals("duplicates are not removed",expectedList, actualList);
    }

    @Test
    public void makeASetTest (){

        int [] listWithDuplicates = {1,1,65,34,76,65,3,1};
        FindDuplicates finder = new FindDuplicates();
        Set<Integer> setwithNoDuplicates= finder.makeASet(listWithDuplicates);
        Set<Integer> expectedSet = new HashSet<Integer>();
        for (int i=0; i<listWithDuplicates.length; i++) {
            expectedSet.add(listWithDuplicates[i]);

        }

        Assert.assertEquals("duplicates are not removed",expectedSet, setwithNoDuplicates);
    }

    @Test
    public void extractUniqueTest (){

        Integer [] listWithDuplicates = {1,1,65,34,76,65,3,1};
        // provide expected array sorted
        Integer [] expected = {3,34,76};
        FindDuplicates finder = new FindDuplicates();
        ArrayList<Integer> actualUnique= finder.extractUnique(listWithDuplicates);
        Collections.sort(actualUnique);
        ArrayList<Integer> expectedUnique = new ArrayList<>(Arrays.asList(expected));

        Assert.assertEquals("unique elements are not unique ",expectedUnique, actualUnique);
    }


}
