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
    private final JButton englishToMorseButton;
    private final JLabel english;
    private final JLabel morse;
    private final JButton morseToEnglishButton;
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

        english = new JLabel();
        english.setText("English");
        english.setPreferredSize(new Dimension(120, 60));
        verticalPanel.add(english);

        inputEnglishField = new JTextField();
        inputEnglishField.setPreferredSize(new Dimension(120,60));
        verticalPanel.add(inputEnglishField);

        englishToMorseButton = new JButton("Translate English to Morse");
        englishToMorseButton.setPreferredSize(new Dimension(180,60));
        englishToMorseButton.addActionListener(this::translateToMorse);
        verticalPanel.add(englishToMorseButton);

        morseToEnglishButton = new JButton("Translate Morse to English");
        morseToEnglishButton.setPreferredSize(new Dimension(180,60));
        morseToEnglishButton.addActionListener(this::translateToEnglish);
        verticalPanel.add(morseToEnglishButton);

        morse = new JLabel();
        morse.setText("Morse");
        morse.setPreferredSize(new Dimension(120, 60));
        verticalPanel.add(morse);

        inputMorseField = new JTextField();
        inputMorseField.setPreferredSize(new Dimension(120,60));
        verticalPanel.add(inputMorseField);
    }

    private void translateToEnglish(ActionEvent actionEvent)
    {
        presenter.MorseToEnglish(inputMorseField.getText());
    }

    private void translateToMorse(ActionEvent actionEvent)
    {
        presenter.EnglishToMorse(inputEnglishField.getText());
    }

    public static void main(String[] args) {
        JFrame frame = new MorseCodeFrame();
        frame.setVisible(true);
    }

    public void setMorse(String morse)
    {
        inputMorseField.setText(morse);
    }

    public void setEnglish(String english)
    {
        inputEnglishField.setText(english);
    }
}
