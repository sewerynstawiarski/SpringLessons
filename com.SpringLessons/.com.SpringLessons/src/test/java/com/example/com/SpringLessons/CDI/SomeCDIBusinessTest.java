package com.example.com.SpringLessons.CDI;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)

public class SomeCDIBusinessTest {
    //inject mock
    @InjectMocks
    SomeCDIBusiness business;
    //create mock
    @Mock
    SomeCDIDAO DaoMock;

    @Test
    public void testBasicScenario() {
        Mockito.when(DaoMock.getData()).thenReturn(new int[] {2,3,4});
        //call the method on binary search
        //check if the valuse is correct
        assertEquals(4, business.findGreatest());
    }
   /* @Test
    public void testBasicScenario2() {
        Mockito.when(DaoMock.getData()).thenReturn(new int[] { });
        assertEquals(Integer.MIN_VALUE, business.findGreatest());
    }
    @Test
    public void testBasicScenario3() {
        Mockito.when(DaoMock.getData()).thenReturn(new int[] {2,2});
        assertEquals(2, business.findGreatest());
    }

    */
}