package nz.ac.eit.amazingtranslator;

import java.util.Scanner;

public class InputCollector {

    public int collectNumber(String numberAsString) throws NumberNotAnIntegerException, NumberNotInAValidRangeException{

        int numberToTranslate;
        try {
            numberToTranslate = Integer.parseInt(numberAsString);
        }
        catch (NumberFormatException nfe){
            throw new NumberNotAnIntegerException(numberAsString);
        }
        if (numberToTranslate < 1 || numberToTranslate>30) {
            throw new NumberNotInAValidRangeException(numberToTranslate);
        }
        return numberToTranslate;
    }

    public SupportedLanguage collectLanguage(String languageAsString) throws LanguageNotSupportedException {
        SupportedLanguage language=null;
        try {
            language = SupportedLanguage.valueOf(languageAsString.toUpperCase());
        }
        catch (IllegalArgumentException iae){
            throw new LanguageNotSupportedException(languageAsString);
        }
        return language;
    }



}
