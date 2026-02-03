import org.junit.*;

public class Solutiontest{
    @Test
    public void test1foradd(){
        Solution s1=new Solution();
        Assert.assertEquals(7,s1.add(2,5));
        Assert.assertEquals(125,s1.add(120,5));
        Assert.assertEquals(12,s1.add(2,10));

    }
}