import org.junit.Assert;
import org.junit.Test;

public class ClusteredParenthesisTest {
    @Test
    public void notClustered1(){
        ClusteredParenthesis object = new ClusteredParenthesis();
        String parenthesis = "{{()}";
        boolean statusExpected = false;
        boolean statusAcual = object.checkIfClusteredProperly(parenthesis);
        Assert.assertEquals(statusExpected, statusAcual);
    }
    @Test
    public void notClustered2(){
        ClusteredParenthesis object = new ClusteredParenthesis();
        String parenthesis = "{{()[][][}";
        boolean statusExpected = false;
        boolean statusAcual = object.checkIfClusteredProperly(parenthesis);
        Assert.assertEquals(statusExpected, statusAcual);
    }
    @Test
    public void notClustered3(){
        ClusteredParenthesis object = new ClusteredParenthesis();
        String parenthesis = "{]";
        boolean statusExpected = false;
        boolean statusAcual = object.checkIfClusteredProperly(parenthesis);
        Assert.assertEquals(statusExpected, statusAcual);
    }
    @Test
    public void isClustered1(){
        ClusteredParenthesis object = new ClusteredParenthesis();
        String parenthesis = "{{()}}{}[[]]";
        boolean statusExpected = true;
        boolean statusAcual = object.checkIfClusteredProperly(parenthesis);
        Assert.assertEquals(statusExpected, statusAcual);
    }
    @Test
    public void isClustered2(){
        ClusteredParenthesis object = new ClusteredParenthesis();
        String parenthesis = "{[()]}";
        boolean statusExpected = true;
        boolean statusAcual = object.checkIfClusteredProperly(parenthesis);
        Assert.assertEquals(statusExpected, statusAcual);
    }
    @Test
    public void isClustered3(){
        ClusteredParenthesis object = new ClusteredParenthesis();
        String parenthesis = "{}[](){[]}()()(())[[[]]]{{}(){}}";
        boolean statusExpected = true;
        boolean statusAcual = object.checkIfClusteredProperly(parenthesis);
        Assert.assertEquals(statusExpected, statusAcual);
    }
}
