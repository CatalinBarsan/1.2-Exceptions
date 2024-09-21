package nivel02.ejercicio01.test;

import nivel02.ejercicio01.main.java.com.modules.incontrols.InControl;
import nivel02.ejercicio01.main.java.com.modules.incontrols.InValueError;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InValueError {
        Scanner scanner = new Scanner(System.in);
        InControl ic = new InControl();

        boolean control = true;
        while (control) {
            System.out.println("MENU");
            System.out.println("1. Insert a Byte");
            System.out.println("2. Insert a int");
            System.out.println("3. Insert a long");
            System.out.println("4. Insert a double");
            System.out.println("5. Insert a char ");
            System.out.println("6. Insert a String");
            System.out.println("7. Insert a Boolean");
            System.out.println("0. Exit program");

            String option = scanner.nextLine() ;

            switch (option) {
                case "1":
                    ic.byteRead("Insert a byte value:");
                    continue;
                case "2":
                    ic.intRead("Insert a int value:");
                    continue;
                case "3":
                    ic.floatRead("Insert a long value:");
                    continue;
                case "4":
                    ic.doubleRead("Insert a double value:");
                    continue;
                case "5":
                    try{
                        ic.charRead("Insert a char value:");
                    } catch(InValueError e){
                        System.out.println(e.getMessage());
                    }
                    continue;
                case "6":
                    ic.stringRead("Insert a String value:");
                    continue;
                case "7":
                    continue;
                default:
                    System.out.println("Invalid option");
                    System.out.println("Please choose a number from 0 to 5: ");
            }

        } scanner.close();

    }
}
