package nz.ac.eit.amazingtranslator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class AppUI
{


    public static void main( String[] args )
    {

        Translator translator=new Translator();
        TranslationDictionary dictionary=new InMemoryTranslationsDictionary();
        dictionary.intializeTranslations();
        translator.setDictionary(dictionary);

        InputCollector collector=new InputCollector();

        JFrame frame=new JFrame();

        frame.setTitle("Amazing Translator");

        frame.setSize(400, 500);

        frame.setLocationRelativeTo(null);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel=new JPanel();
        frame.setContentPane(panel);
        JLabel numberLabel=new JLabel("What is the number to translate?");
        JTextField tf=new JTextField(2);
JButton translateButton=new JButton("Translate");
ButtonGroup group=new ButtonGroup();
JRadioButton german=new JRadioButton("German");
german.setSelected(true);
JRadioButton french=new JRadioButton("French");
group.add(french);
group.add(german);

JLabel translated=new JLabel();

        panel.add(numberLabel);
        panel.add(tf);
        panel.add(french);
        panel.add(german);
        panel.add(translateButton);
        panel.add(translated);

        translateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                String numberAsString=tf.getText();
                int numberToTranslate=0;
                try {
                    numberToTranslate = collector.collectNumber(numberAsString);
                }
                catch (NumberNotAnIntegerException nnaie){
                    System.out.println(nnaie.getMessage());
                    System.exit(1);
                }
                catch (NumberNotInAValidRangeException nnivre){
                    System.out.println(nnivre.getMessage());
                    System.exit(1);
                }

                SupportedLanguage language=null;



                String languageAsString=french.isSelected() ? "french" : "german";
                try {
                    language=collector.collectLanguage(languageAsString);
                }
                catch (LanguageNotSupportedException lnse){
                    System.out.println(lnse.getMessage());
                    System.exit(1);
                }

                try {
                    translated.setText(translator.translate(language, numberToTranslate));
                }
                catch (NumberNotInAValidRangeException nnivre){
                    System.out.println(nnivre.getMessage());
                    System.exit(1);
                }
            }
        });


        frame.setVisible(true);




    }
}
