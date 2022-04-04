import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MorseAlphabetConversionTest {

    @Test
    void getLetter()
    {
        //given
        MorseAlphabetConversion conversion = new MorseAlphabetConversion();
        String a = "a";
        //when
        //then
        assertEquals(".-", conversion.getMorse(a));
    }

    @Test
    void getMorse()
    {
        //given
        MorseAlphabetConversion conversion = new MorseAlphabetConversion();
        String b = "-...";
        //when
        //then
        assertEquals("B", conversion.getLetter(b));
    }
}