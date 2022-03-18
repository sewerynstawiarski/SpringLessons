package com.SpringKurs.Mockito.MockitoKurs;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {

    @Test
    public void Test() {
        List listMock = mock(List.class);

        when(listMock.size()).thenReturn(10);
        assertEquals(10, listMock.size());
    }
    @Test
    public void TestForTwo() {
        List listMock = mock(List.class);

        when(listMock.size()).thenReturn(10).thenReturn(20);
        assertEquals(10, listMock.size());
        assertEquals(20,listMock.size());
    }
    @Test
    public void TestGet() {
        List listMock = mock(List.class);

        when(listMock.get(0)).thenReturn("Some String");
        assertEquals("Some String", listMock.get(0));
        assertEquals(null,listMock.get(1));
    }
    @Test
    public void TestAnyGet() {
        List listMock = mock(List.class);

        when(listMock.get(Mockito.anyInt())).thenReturn("Some String");
        assertEquals("Some String", listMock.get(0));
        assertEquals("Some String",listMock.get(1));
    }
}
