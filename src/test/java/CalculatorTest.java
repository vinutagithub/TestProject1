import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    Calculator_class obj1;

    @Test
    public void tc_add(){

        obj1= new Calculator_class();

        int val=obj1.addition(10,20);
        System.out.println("sum=" + val);
        Assert.assertEquals(val,30);

    }
}
