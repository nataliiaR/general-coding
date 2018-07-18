import org.junit.Assert;
import org.junit.Test;

public class IncludeWordViaMapTest {
    @Test
    public void isIncludedInTestNegative (){
            Character [] word1 = {'m','o','t'};
            Character [] word2 = {'t','o','o'};
            IncludeWordViaMap check = new IncludeWordViaMap();
            String status = "Not Included";
            Assert.assertEquals("should be not included",status, check.isIncludedIn(word1,word2));

        }


        @Test
    public void isIncludedInTesPositive(){
            Character [] word1 = {'m','o','t'};
            Character [] word2 = {'t','o','m'};
            IncludeWordViaMap check = new IncludeWordViaMap();
            String status = "is Included";
            Assert.assertEquals("should be included",status, check.isIncludedIn(word1,word2));


        }
    }

