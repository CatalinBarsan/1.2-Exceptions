package nivel02.ejercicio01.main.java.com.modules.incontrols;

import java.util.Scanner;

import static java.lang.System.*;

public class InControl {

    static Scanner sc = new Scanner(in);

    public static byte byteRead(){
       byte reed = 0;
       out.println("Insert a byte value:");
       boolean control=true;
       while(control){
           try {
               reed = sc.nextByte();
               control=false;
           } catch (Exception e) {
               out.println("Error: Invalid input. Please enter a valid byte value.");
               out.println("Please enter a value in the range: (-128 to 127): ");
               sc.nextLine();
           }
       }
       out.println("Your inserted  byte value is: " + reed);
       return reed;
    }



}
