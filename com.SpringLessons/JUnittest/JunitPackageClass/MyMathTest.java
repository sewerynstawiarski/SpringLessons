package JunitPackageClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {
    MyMath myMath = new MyMath();
    @Test
    void sumWith3Numbers() {
        //absence of failure is success
        assertEquals(6, myMath.sum(new int[] {1,2,3}));
    }
    @Test
    void sumWith4Numbers() {
        assertEquals(10, myMath.sum(new int[] {1,2,3,4}));
    }
}