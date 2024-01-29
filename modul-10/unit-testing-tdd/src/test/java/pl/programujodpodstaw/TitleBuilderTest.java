package pl.programujodpodstaw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TitleBuilderTest {
    /*

    0, 10 - wyświetleń
    1 - wyświetlenie
    11, 31, 41, 101 - wyświetleń
    2, 22, 23, 24, 32, 102 - wyświetlenia
    12, 13, 14 - wyświetleń

     */
    @Test
    public void testTitle() {
        assertEquals("Ten film ma 0 wyświetleń", new TitleBuilder(0).build());
        assertEquals("Ten film ma 1 wyświetlenie", new TitleBuilder(1).build());
        assertEquals("Ten film ma 2 wyświetlenia", new TitleBuilder(2).build());
        assertEquals("Ten film ma 12 wyświetleń", new TitleBuilder(12).build());
        assertEquals("Ten film ma 13 wyświetleń", new TitleBuilder(13).build());
        assertEquals("Ten film ma 14 wyświetleń", new TitleBuilder(14).build());
        assertEquals("Ten film ma 21 wyświetleń", new TitleBuilder(21).build());
        assertEquals("Ten film ma 22 wyświetlenia", new TitleBuilder(22).build());
        assertEquals("Ten film ma 24 wyświetlenia", new TitleBuilder(24).build());
        assertEquals("Ten film ma 30 wyświetleń", new TitleBuilder(30).build());
        assertEquals("Ten film ma 31 wyświetleń", new TitleBuilder(31).build());
        assertEquals("Ten film ma 100 wyświetleń", new TitleBuilder(100).build());
        assertEquals("Ten film ma 101 wyświetleń", new TitleBuilder(101).build());
        assertEquals("Ten film ma 112 wyświetleń", new TitleBuilder(112).build());
        assertEquals("Ten film ma 122 wyświetlenia", new TitleBuilder(122).build());
        assertEquals("Ten film ma 1001 wyświetleń", new TitleBuilder(1001).build());
    }
}
