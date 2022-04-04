public class MorseCodePresenter
{
    MorseCode model;
    MorseCodeFrame frame;
    public MorseCodePresenter(MorseCode model, MorseCodeFrame frame)
    {
        this.model = model;
        this.frame = frame;
    }
    public void EnglishToMorse(String english)
    {
        frame.setMorse(model.convertToMorse(english));
    }

    public void MorseToEnglish(String morse)
    {
        frame.setEnglish(model.convertToABC(morse));
    }

}
