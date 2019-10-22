package nz.ac.eit.amazingtranslator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TranslatorTest {

    private  Translator translator;

    @Before
    public void setup(){
        translator=new Translator();
        TranslationDictionary stubDictionary=new InMemoryTranslationsDictionary();
        stubDictionary.intializeTranslations();
        translator.setDictionary(stubDictionary);
    }

    @Test
    public void translate_with18inGerman_shouldReturnAchtzehn() throws NumberNotInAValidRangeException{

        String translated=translator.translate(SupportedLanguage.GERMAN, 18);
        assertEquals("The translation of 18 in german should be Achtzehn","Achtzehn",translated);

    }

    @Test
    public void translate_with1inGerman_shouldReturnEinz() throws NumberNotInAValidRangeException{

        String translated=translator.translate(SupportedLanguage.GERMAN,1);
        assertEquals("The translation of 1 in german should be Einz","Einz",translated);

    }

    @Test
    public void translate_with30inGerman_shouldReturnDreiβig() throws NumberNotInAValidRangeException {

        String translated=translator.translate(SupportedLanguage.GERMAN,30);
        assertEquals("The translation of 1 in german should be Dreiβig","Dreiβig",translated);

    }

    @Test(expected = NumberNotInAValidRangeException.class)
    public void translate_with31inGerman_shouldThrowException() throws NumberNotInAValidRangeException{
        translator.translate(SupportedLanguage.GERMAN,31);
    }

    @Test(expected = NumberNotInAValidRangeException.class)
    public void translate_with0German_shouldThrowException() throws NumberNotInAValidRangeException{
        translator.translate(SupportedLanguage.GERMAN,0);
    }

}