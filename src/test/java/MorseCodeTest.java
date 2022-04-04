import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class MorseCodeTest {

    MorseAlphabetConversion conversion = Mockito.mock(MorseAlphabetConversion.class);
    MorseCode morseCode= new MorseCode(conversion);

    @Test
    void convertToMorse()
    {
        //given
        Mockito.doReturn("....").when(conversion).getMorse("h");
        Mockito.doReturn(".").when(conversion).getMorse("e");
        Mockito.doReturn(".-..").when(conversion).getMorse("l");
        Mockito.doReturn("---").when(conversion).getMorse("o");
        Mockito.doReturn(".-").when(conversion).getMorse("a");
        String input = "hello, all";
        String code = ".... . .-.. .-.. --- .- .-.. .-..";
        //when
        //then
        assertEquals(code, morseCode.convertToMorse(input));
    }

    @Test
    void convertToABC() {
        Mockito.doReturn("H").when(conversion).getLetter("....");
        Mockito.doReturn("E").when(conversion).getLetter(".");
        Mockito.doReturn("L").when(conversion).getLetter(".-..");
        Mockito.doReturn("O").when(conversion).getLetter("---");
        Mockito.doReturn("A").when(conversion).getLetter(".-");
        String input = ".... . .-.. .-.. --- .- .-.. .-..";
        String result = "HELLOALL";
        //when
        //then
        assertEquals(result, morseCode.convertToABC(input));
    }
}