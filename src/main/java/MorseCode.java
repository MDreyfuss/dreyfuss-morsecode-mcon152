public class MorseCode
{
    MorseAlphabetConversion conversion;
    public MorseCode(MorseAlphabetConversion conversion)
    {
        this.conversion = conversion;
    }

    public String convertToMorse(String input)
    {
        String result = "";
        for (int letter = 0; letter < input.length(); letter++)
        {
            String codeEquivalent = conversion.getMorse(String.valueOf(input.charAt(letter)));
            if (codeEquivalent != null)
            {
                result += (" " + codeEquivalent);
            }
        }
        return result.trim();
    }

    public String convertToABC(String input)
    {
        String[] inputList = input.split(" ");
        String result = "";
        for (String morseLetter : inputList)
        {
            String letterEquivalent = conversion.getLetter(morseLetter);
            if (letterEquivalent != null)
            {
                result += letterEquivalent;
            }
        }
        return result;
    }
}
