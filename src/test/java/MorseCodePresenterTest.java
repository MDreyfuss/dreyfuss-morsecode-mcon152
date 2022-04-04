import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;

class MorseCodePresenterTest {

    private MorseCodeFrame frame = Mockito.mock(MorseCodeFrame.class);
    private MorseCode model = Mockito.mock(MorseCode.class);
    private MorseCodePresenter presenter = new MorseCodePresenter(model, frame);

    @Test
    void EnglishToMorse()
    {
        //given
        String eng = "abc";
        String morse = ".- -... -.-.";
        Mockito.doReturn(morse).when(model).convertToMorse(eng);
        //when
        presenter.EnglishToMorse(eng);
        //then
        verify(model).convertToMorse(eng);
        verify(frame).setMorse(morse);
    }

    @Test
    void MorseToEnglish()
    {
        //given
        String eng = "abc";
        String morse = ".- -... -.-.";
        Mockito.doReturn(eng).when(model).convertToABC(morse);
        //when
        presenter.MorseToEnglish(morse);
        //then
        verify(model).convertToABC(morse);
        verify(frame).setEnglish(eng);
    }
}