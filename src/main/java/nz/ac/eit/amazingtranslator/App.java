package nz.ac.eit.amazingtranslator;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Please enter a number to translate" );
        Scanner scan=new Scanner(System.in);
        String numberAsString=scan.nextLine();
        int numberToTranslate=Integer.parseInt(numberAsString);
        System.out.println("Collected number" +numberToTranslate);
    }
}
