package nz.ac.eit.amazingtranslator;

import org.junit.Test;
import static org.junit.Assert.*;

public class InputCollectorTest {

    @Test
    public void collectLanguage_withGerman_shouldReturnGERMANSupportedLanguage() throws LanguageNotSupportedException {
        InputCollector inputCollector=new InputCollector();
        SupportedLanguage language=inputCollector.collectLanguage("german");
        assertEquals(SupportedLanguage.GERMAN,language);
    }

    @Test
    public void collectLanguage_withGERMAN_shouldReturnGERMANSupportedLanguage() throws LanguageNotSupportedException {
        InputCollector inputCollector=new InputCollector();
        SupportedLanguage language=inputCollector.collectLanguage("GERMAN");
        assertEquals(SupportedLanguage.GERMAN,language);
    }

    @Test(expected = LanguageNotSupportedException.class)
    public void collectLanguage_withUnsupportedLanguage_shouldThrowException() throws LanguageNotSupportedException {
        InputCollector inputCollector=new InputCollector();
        inputCollector.collectLanguage("NotFrenchOrGerman");
    }

    @Test
    public void collectNumber_with12_shouldReturn12()  throws NumberNotInAValidRangeException,NumberNotAnIntegerException{
        InputCollector inputCollector=new InputCollector();
        int number=inputCollector.collectNumber("12");
        assertEquals(12,number);
    }

    @Test(expected = NumberNotInAValidRangeException.class)
    public void collectNumber_with31_shouldThrowException() throws NumberNotInAValidRangeException,NumberNotAnIntegerException{
        InputCollector inputCollector=new InputCollector();
        inputCollector.collectNumber("31");
    }

    @Test(expected = NumberNotInAValidRangeException.class)
    public void collectNumber_with0_shouldThrowException() throws NumberNotInAValidRangeException,NumberNotAnIntegerException{
        InputCollector inputCollector=new InputCollector();
        inputCollector.collectNumber("0");
    }

    @Test(expected = NumberNotAnIntegerException.class)
    public void collectNumber_withNotANumber_shouldThrowException() throws NumberNotInAValidRangeException,NumberNotAnIntegerException{
        InputCollector inputCollector=new InputCollector();
        inputCollector.collectNumber("NotANumber");
    }
}