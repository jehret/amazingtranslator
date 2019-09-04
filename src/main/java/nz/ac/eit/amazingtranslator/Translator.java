package nz.ac.eit.amazingtranslator;

import java.util.Hashtable;

public class Translator {

    private Hashtable<SupportedLanguage,Hashtable<Integer,String>> translations=new Hashtable<>();

    public int intializeTranslations(){
        translations.put(SupportedLanguage.FRENCH,intializeFrench());
        translations.put(SupportedLanguage.GERMAN,intializeGerman());
        return translations.size();
    }

    private Hashtable<Integer,String> intializeFrench(){
        Hashtable<Integer,String> frenchTranslations=new Hashtable<>();
        frenchTranslations.put(1,"Un");
        frenchTranslations.put(2,"Deux");
        frenchTranslations.put(3,"Trois");
        frenchTranslations.put(4,"Quatre");
        frenchTranslations.put(5,"Cinq");
        frenchTranslations.put(6,"Six");
        frenchTranslations.put(7,"Sept");
        frenchTranslations.put(8,"Huit");
        frenchTranslations.put(9,"Neuf");
        frenchTranslations.put(10,"Dix");
        frenchTranslations.put(11,"Onze");
        frenchTranslations.put(12,"Douze");
        frenchTranslations.put(13,"Treize");
        frenchTranslations.put(14,"Quatorze");
        frenchTranslations.put(15,"Quinze");
        frenchTranslations.put(16,"Seize");
        frenchTranslations.put(17,"Dix-sept");
        frenchTranslations.put(18,"Dix-Huit");
        frenchTranslations.put(19,"Dix-Neuf");
        frenchTranslations.put(20,"Vingt");
        frenchTranslations.put(21,"Vingt-et-un");
        frenchTranslations.put(22,"Vingt-deux");
        frenchTranslations.put(23,"Vingt-trois");
        frenchTranslations.put(24,"Vingt-quatre");
        frenchTranslations.put(25,"Vingt-cing");
        frenchTranslations.put(26,"Vingt-six");
        frenchTranslations.put(27,"Vingt-sept");
        frenchTranslations.put(28,"Vingt-Huit");
        frenchTranslations.put(29,"Vingt-Neuf");
        frenchTranslations.put(30,"Trente");
        return frenchTranslations;
    }

    private Hashtable<Integer,String> intializeGerman(){
        Hashtable<Integer,String> germanTranslations=new Hashtable<>();
        germanTranslations.put(1,"Einz");
        germanTranslations.put(2,"Zwei");
        germanTranslations.put(3,"Drei");
        germanTranslations.put(4,"Vier");
        germanTranslations.put(5,"Fünf");
        germanTranslations.put(6,"Sechs");
        germanTranslations.put(7,"Sieben");
        germanTranslations.put(8,"Acht");
        germanTranslations.put(9,"Neun");
        germanTranslations.put(10,"Zehn");
        germanTranslations.put(11,"Elf");
        germanTranslations.put(12,"Zwölf");
        germanTranslations.put(13,"Dreizehn");
        germanTranslations.put(14,"Vierzehn");
        germanTranslations.put(15,"Fünfzehn");
        germanTranslations.put(16,"Sechtzehn");
        germanTranslations.put(17,"Siebzehn");
        germanTranslations.put(18,"Achtzehn");
        germanTranslations.put(19,"Neunzehn");
        germanTranslations.put(20,"Zwanzig");
        germanTranslations.put(21,"Einundzwanzig");
        germanTranslations.put(22,"Zweiundzwanzig");
        germanTranslations.put(23,"Dreiundzwanzig");
        germanTranslations.put(24,"Vierundzwanzig");
        germanTranslations.put(25,"Fünfundzwanzig");
        germanTranslations.put(26,"Sechtsundzwanzig");
        germanTranslations.put(27,"Siebenundzwanzig");
        germanTranslations.put(28,"Achtundzwanzig");
        germanTranslations.put(29,"Neunundzwanzig");
        germanTranslations.put(30,"Dreiβig");
        return germanTranslations;
    }

    public String translate(SupportedLanguage language, int numberToTranslate) throws NumberNotInAValidRangeException{
        if (numberToTranslate < 1 || numberToTranslate>30) {
            throw new NumberNotInAValidRangeException(numberToTranslate);
        }
        return translations.get(language).get(numberToTranslate);
    }

}
