package nz.ac.eit.amazingtranslator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TranslatorTest {

    private  Translator translator;

    @Before
    public void setup(){
        translator=new Translator();
        translator.intializeTranslations();
    }

    @Test
    public void translate_with18inGerman_shouldReturnAchtzehn() {

        String translated=translator.translate(SupportedLanguage.GERMAN, 18);
        assertEquals("The translation of 18 in german should be Achtzehn","Achtzehn",translated);

    }

    @Test
    public void convert_with1inGerman_shouldReturnEinz() {

        String translated=translator.translate(SupportedLanguage.GERMAN,1);
        assertEquals("The translation of 1 in german should be Einz","Einz",translated);

    }

    @Test
    public void convert_with30inGerman_shouldReturnDreiβig() {

        String translated=translator.translate(SupportedLanguage.GERMAN,30);
        assertEquals("The translation of 1 in german should be Dreiβig","Dreiβig",translated);

    }
    @Test
    public void intializeTranslations_shouldReturn2Languages(){
        int languagesNb=translator.intializeTranslations();
        assertEquals("There is not enough languages in the dictonary",2,languagesNb);

    }
}