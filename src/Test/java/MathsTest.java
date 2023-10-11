package Test.java;
import org.junit.*;

public class MathsTest {
    Maths maths;

    @Before
    public void setUpInstance() {
        maths = new Maths();
    }

    @Test
    public void checkTheSumOfTwoNumbersEqualsThree() {
        Assert.assertEquals(3, maths.addTwoNumbers(1, 2));

    }
    @Test
    public void checkPrimeNumber() {
        Assert.assertTrue(maths.checkPrime(7));


    }

    }


