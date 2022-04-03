import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MorseCodeFrame extends JFrame
{
    private final MorseAlphabetConversion conversion;
    private final MorseCode model;
    private final MorseCodePresenter presenter;
    private final JTextField inputEnglishField;
    private final JTextField inputMorseField;
    private final JButton EnglishToMorseButton;
    private final JLabel English;
    private final JLabel Morse;
    private final JButton MorseToEnglishButton;
    private  final JPanel verticalPanel;

    public MorseCodeFrame()
    {
        conversion = new MorseAlphabetConversion();
        model = new MorseCode(conversion);
        presenter = new MorseCodePresenter(model, this);

        setTitle("Morse - English Translator");
        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout());

        verticalPanel = new JPanel();
        verticalPanel.setLayout(new BoxLayout(verticalPanel,BoxLayout.Y_AXIS));
        add(verticalPanel);

        English = new JLabel();
        English.setText("English");
        English.setPreferredSize(new Dimension(120, 60));
        verticalPanel.add(English);

        inputEnglishField = new JTextField();
        inputEnglishField.setPreferredSize(new Dimension(120,60));
        verticalPanel.add(inputEnglishField);

        EnglishToMorseButton = new JButton("Translate English to Morse");
        EnglishToMorseButton.setPreferredSize(new Dimension(180,60));
        EnglishToMorseButton.addActionListener(this::translateToMorse);
        verticalPanel.add(EnglishToMorseButton);

        MorseToEnglishButton = new JButton("Translate Morse to English");
        MorseToEnglishButton.setPreferredSize(new Dimension(180,60));
        MorseToEnglishButton.addActionListener(this::translateToEnglish);
        verticalPanel.add(MorseToEnglishButton);

        Morse = new JLabel();
        Morse.setText("Morse");
        Morse.setPreferredSize(new Dimension(120, 60));
        verticalPanel.add(Morse);

        inputMorseField = new JTextField();
        inputMorseField.setPreferredSize(new Dimension(120,60));
        verticalPanel.add(inputMorseField);
    }

    private void translateToEnglish(ActionEvent actionEvent)
    {
        presenter.MtoE(inputMorseField.getText());
    }

    private void translateToMorse(ActionEvent actionEvent)
    {
        presenter.EtoM(inputEnglishField.getText());
    }

    public static void main(String[] args) {
        JFrame frame = new MorseCodeFrame();
        frame.setVisible(true);
    }

    public void setMorse(String morse)
    {
        inputMorseField.setText(morse);
    }

    public void setEnglish(String ABC)
    {
        inputEnglishField.setText(ABC);
    }
}
