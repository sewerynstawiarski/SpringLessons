package JunitPackageClass;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class AssertTest {
    //@BeforeAll // must be static
    //@BeforeEach // mustn't be static
    //@AfterAll // must be static
    @AfterEach // mustn't be static
    public void before() {
        //System.out.println("Before");
        System.out.println("After");
    }
    @Test
   public void test() {
        System.out.println("Test1");
        assertEquals(1,1);
    }
    @Test
    public void testT() {
        System.out.println("Test2");
        int number = 8;
        assertTrue(number>0? true: false);
    }
    @Test
    public void testF() {
        System.out.println("Test3");
        int number = -8;
        assertFalse(number>0? true: false);
    }
    @Test
    public void testArrays() {
        System.out.println("Test4");
       assertArrayEquals(new int[] {1,2,3}, new int[] {1,2,3});
    }
}
