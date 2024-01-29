package pl.programujodpodstaw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class SpiedClassTest {
    @Test
    public void mockTest() {
        SpiedClass mock = mock(SpiedClass.class);

        when(mock.method1()).thenReturn("MOCKOWY STRING");

        assertEquals("MOCKOWY STRING", mock.method1());
    }

    @Test
    public void spyTest() {
        SpiedClass spy = spy(SpiedClass.class);

        when(spy.method2()).thenReturn("Inny String");

        assertEquals("String 1", spy.method1());
        assertEquals("Inny String", spy.method2());
        assertEquals("String 3", spy.method3());
    }
}
