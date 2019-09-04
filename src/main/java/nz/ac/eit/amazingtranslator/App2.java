package nz.ac.eit.amazingtranslator;

import java.util.Hashtable;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App2
{


    public static void main( String[] args )
    {

        Translator translator=new Translator();
        translator.intializeTranslations();

        InputCollector collector=new InputCollector();


        Scanner scan=new Scanner(System.in);
        System.out.println( "Please enter a number to translate" );

        String numberAsString=scan.nextLine();
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
        System.out.println( "Please enter the language (french/german)" );
        String languageAsString=scan.nextLine().toUpperCase();
        try {
            language=collector.collectLanguage(languageAsString);
        }
        catch (LanguageNotSupportedException lnse){
            System.out.println(lnse.getMessage());
            System.exit(1);
        }
        try {
            String translated = translator.translate(language, numberToTranslate);
            System.out.println("The translation is " + translated);
        }
        catch (NumberNotInAValidRangeException nnivre){
            System.out.println(nnivre.getMessage());
            System.exit(1);
        }
        System.out.println( "Hit a key to exit" );
        scan.nextLine();
    }
}
