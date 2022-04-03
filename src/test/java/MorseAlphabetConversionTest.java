import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MorseAlphabetConversionTest {

    @Test
    void getLetter()
    {
        //given
        MorseAlphabetConversion conversion = new MorseAlphabetConversion();
        //when
        String a = "a";
        //then
        assertEquals(".-", conversion.getMorse(a));
    }

    @Test
    void getMorse()
    {
        //given
        MorseAlphabetConversion conversion = new MorseAlphabetConversion();
        //when
        String b = "-...";
        //then
        assertEquals("B", conversion.getLetter(b));
    }
}