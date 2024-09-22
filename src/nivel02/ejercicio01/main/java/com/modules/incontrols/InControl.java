package nivel02.ejercicio01.main.java.com.modules.incontrols;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.*;

public class InControl {

    private static Scanner sc = new Scanner(in);

    public static byte byteRead(String message){
       byte reed = 0;
       out.println(message);
       boolean control=true;
       while(control){
           try {
               reed = sc.nextByte();
               control=false;
           } catch (InputMismatchException e) {
               out.println("Error: Invalid input. Please enter a valid byte value.");
               sc.nextLine();
           }
       }
       out.println("Your inserted value is: " + reed);
       return reed;
    }

    public static int intRead(String message){
        int reed = 0;
        out.println(message);
        boolean control=true;
        while(control){
            try {
                reed = sc.nextInt();
                control=false;
            } catch (InputMismatchException e) {
                out.println("Error: Invalid input. Please enter a valid int value.");
                sc.nextLine();
            }

        }
        out.println("Your inserted value is: " + reed);
        return reed;
    }

    public static float floatRead(String message){
        float reed = 0;
        out.println(message);
        boolean control=true;
        while(control){
            try {
                reed = sc.nextFloat();
                control=false;
            } catch (InputMismatchException e) {
                out.println("Error: Invalid input. Please enter a valid long value.");
                sc.nextLine();
            }

        }
        out.println("Your inserted value is: " + reed);
        return reed;
    }

    public static double doubleRead(String message){
        double reed = 0;
        out.println(message);
        boolean control=true;
        while(control){
            try {
                reed = sc.nextDouble();
                control=false;
            } catch (InputMismatchException e) {
                out.println("Error: Invalid input. Please enter a valid double value.");
                sc.nextLine();
            }
        }
        out.println("Your inserted value is: " + reed);
        return reed;
    }

    public static char charRead(String message) throws InValueError{
        char reed = ' ';
        out.println(message);
        String validate = sc.nextLine();
        boolean control=true;
        while(control){
            if (validate.length() == 1){
                reed = validate.charAt(0);
                control=false;
            } else {
                throw new InValueError("Inser only one character.");
            }
        }
        out.println("Your inserted value is: " + reed);
        return reed;
    }


    public static String stringRead(String message) throws InValueError{
        out.println(message);
        String value = sc.nextLine();
        if(value.isEmpty()){
            throw new InValueError("Insert a string value.");
        }
        out.println("Your inserted value is: " + value);
        return value;

    }



}
