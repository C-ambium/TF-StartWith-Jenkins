package calculator;

import org.junit.*;

public class calculatorTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testAdd() {
        int a = 1;
        int b = 2;
        int expected = 3;

        Calculator calc = new Calculator();
        int actual = calc.add(a, b);

        Assert.assertEquals(expected, actual, 0);
    }

}
