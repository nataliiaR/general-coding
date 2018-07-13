import org.junit.Assert;
import org.junit.Test;

public class IncludeWordTest {


    @Test
    public void isIncludedTest (){
        IncludeWord words = new IncludeWord();
        String [] word2 = {"m","o","t","o","f"};
        String [] word1 = {"f","t"};
        Assert.assertEquals("The word is included", words.isIncluded(word1, word2));
    }

    @Test
    public void isNotIncluded (){
        IncludeWord words = new IncludeWord();
        String [] word2 = {"m","o","t","o","f"};
        String [] word1 = {"f","t","a"};
        Assert.assertEquals("The word is NOT included", words.isIncluded(word1, word2));
    }


}
