public class MorseCode
{
    private MorseAlphabetConversion conversion;
    public MorseCode(MorseAlphabetConversion conversion)
    {
        this.conversion = conversion;
    }

    public String convertToMorse(String input)
    {
        StringBuilder result = new StringBuilder();
        for (int letter = 0; letter < input.length(); letter++)
        {
            String codeEquivalent = conversion.getMorse(String.valueOf(input.charAt(letter)));
            if (codeEquivalent != null)
            {
                result.append(" " + codeEquivalent);
            }
        }
        return result.toString().trim();
    }

    public String convertToABC(String input)
    {
        String[] inputList = input.split(" ");
        StringBuilder result = new StringBuilder();
        for (String morseLetter : inputList)
        {
            String letterEquivalent = conversion.getLetter(morseLetter);
            if (letterEquivalent != null)
            {
                result.append(letterEquivalent);
            }
        }
        return result.toString();
    }
}
