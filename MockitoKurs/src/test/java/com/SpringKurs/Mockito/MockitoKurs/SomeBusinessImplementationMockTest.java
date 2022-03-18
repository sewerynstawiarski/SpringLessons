package com.SpringKurs.Mockito.MockitoKurs;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class SomeBusinessImplementationMockTest {

    @Test
    void findTheGreatestValueTEST() {
        DataService dataServiceMock = Mockito.mock(DataService.class);
        //dataServiceMock.retrieveAllData() => new int[]{13,67,19};
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {13,15,19});

        SomeBusinessImplementation someBusinessImplementation = new SomeBusinessImplementation(dataServiceMock);
        int result = someBusinessImplementation.findTheGreatestValue();
        assertEquals(19,result);
    }
    @Test
    void findTheGreatestValueTESTForOne() {
        DataService dataServiceMock = Mockito.mock(DataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {13});

        SomeBusinessImplementation someBusinessImplementation = new SomeBusinessImplementation(dataServiceMock);
        int result = someBusinessImplementation.findTheGreatestValue();
        assertEquals(13,result);
    }
}
