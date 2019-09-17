package nz.ac.eit.amazingtranslator;

import java.util.Hashtable;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    private static Hashtable<Integer,String> frenchTranslations=new Hashtable<>();
    private static Hashtable<Integer,String> germanTranslations=new Hashtable<>();

    private static void intializeTranslations(){
        frenchTranslations.put(1,"Un");
        germanTranslations.put(1,"ggggg");
    }

    public static void main( String[] args )
    {

        intializeTranslations();

        System.out.println( "Please enter a number to translate" );
        Scanner scan=new Scanner(System.in);
        String numberAsString=scan.nextLine();
        int numberToTranslate=Integer.parseInt(numberAsString);
        System.out.println( "Please enter the language (french/german)" );
        String language=scan.nextLine();
        String translated=null;
        if (language.equals("french")){
            translated=frenchTranslations.get(numberToTranslate);
        }
        else if (language.equals("german")){
            translated=germanTranslations.get(numberToTranslate);
        }
        System.out.println("The translation is "+translated);
    }
}
