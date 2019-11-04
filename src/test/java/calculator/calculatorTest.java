package calculator;

import org.junit.*;
/**
 * Class calculator test
 * @author Colin Cerveaux
 *
 */
public class calculatorTest {
/**
 * Before Class
 * @throws Exception
 */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }
/**
 * After Class
 * @throws Exception
 */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }
/**
 * Before
 * @throws Exception
 */
    @Before
    public void setUp() throws Exception {
    }
/**
 * After
 * @throws Exception
 */
    @After
    public void tearDown() throws Exception {
    }
/**
 * Test Add method / class calculator
 */
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
