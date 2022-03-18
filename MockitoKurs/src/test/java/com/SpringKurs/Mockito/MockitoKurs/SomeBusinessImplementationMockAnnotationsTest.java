package com.SpringKurs.Mockito.MockitoKurs;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)

class SomeBusinessImplementationMockAnnotationsTest {

    @Mock
    DataService dataServiceMock;

    @InjectMocks
    SomeBusinessImplementation someBusinessImplementation;


    @Test
    void findTheGreatestValueTEST() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {13,15,19});
        int result = someBusinessImplementation.findTheGreatestValue();
        assertEquals(19,result);
    }
    @Test
    void findTheGreatestValueTESTForOne() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {13});
        int result = someBusinessImplementation.findTheGreatestValue();
        assertEquals(13,result);
    }
    @Test
    void findTheGreatestValueTESTWithNone() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});
        int result = someBusinessImplementation.findTheGreatestValue();
        assertEquals(Integer.MIN_VALUE,result);
    }
}
