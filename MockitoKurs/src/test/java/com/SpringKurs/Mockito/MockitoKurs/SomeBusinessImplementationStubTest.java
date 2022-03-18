package com.SpringKurs.Mockito.MockitoKurs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SomeBusinessImplementationStubTest {

    @Test
    void findTheGreatestValueTEST() {
        SomeBusinessImplementation someBusinessImplementation = new SomeBusinessImplementation(new DataServiceStub());
        int result = someBusinessImplementation.findTheGreatestValue();
        assertEquals(19,result);
    }
}
class DataServiceStub implements DataService {

    @Override
    public int[] retrieveAllData() {
        return new int[] {4,7,19};
    }
}