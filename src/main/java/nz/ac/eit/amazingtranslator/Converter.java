package nz.ac.eit.amazingtranslator;

import java.util.Hashtable;

public class Converter {

    private Hashtable<String,Hashtable<Integer,String>> translations=new Hashtable<>();

    public int intializeTranslations(){
        translations.put("german",initializeGerman());
        translations.put("french",initializeFrench());
        return translations.size();
    }

    private Hashtable<Integer,String> initializeFrench(){
        Hashtable<Integer,String> frenchTranslations=new Hashtable<>();
        frenchTranslations.put(1,"Un");
        return frenchTranslations;
    }

    private Hashtable<Integer,String> initializeGerman(){
        Hashtable<Integer,String> germanTranslations=new Hashtable<>();
        germanTranslations.put(1,"Einz");
        germanTranslations.put(18,"Achtzehn");
        germanTranslations.put(30,"Dreiβig");
        return germanTranslations;
    }


    public String convert(int number, String language){

        return translations.get(language).get(number);
    }

}
