package nz.ac.eit.amazingtranslator;

import java.util.Hashtable;

public class Translator {

    private TranslationDictionary dictionary;

    public void setDictionary(TranslationDictionary dictionary) {
        this.dictionary = dictionary;
    }

    public String translate(SupportedLanguage language, int numberToTranslate) throws NumberNotInAValidRangeException{
        if (numberToTranslate < 1 || numberToTranslate>30) {
            throw new NumberNotInAValidRangeException(numberToTranslate);
        }
        return dictionary.getTranslations().get(language).get(numberToTranslate);
    }

}
