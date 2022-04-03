import java.io.InputStream;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class MorseAlphabetConversion
{
    HashMap<String, String> toLetterMap = new HashMap<>();
    HashMap<String, String> toCodeMap = new HashMap<>();
    public MorseAlphabetConversion()
    {
        InputStream chart = MorseAlphabetConversion.class.getResourceAsStream("MorseAlphabetChart.txt");

        Scanner readFile = new Scanner(chart);
        while (readFile.hasNextLine())
        {
            String[] entry = readFile.nextLine().split(" ");
            toCodeMap.put(entry[0], entry[1]);
            toLetterMap.put(entry[1], entry[0]);
        }
    }

    public String getLetter(String input)
    {
        return toLetterMap.get(input);
    }

    public String getMorse(String input)
    {
        return toCodeMap.get(input.toUpperCase(Locale.ROOT));
    }
}
