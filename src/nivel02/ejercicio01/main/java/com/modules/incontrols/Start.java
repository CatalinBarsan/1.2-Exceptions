package nivel02.ejercicio01.main.java.com.modules.incontrols;

import java.util.Scanner;

public class Start {

    public void start() throws InValueError {
        Scanner scanner = new Scanner(System.in);
        InControl ic = new InControl();
        ShowMenu menu = new ShowMenu();

        boolean control = true;
        while (control) {

            menu.showMenu();

            String option = scanner.nextLine() ;

            switch (option) {
                case "1":
                    ic.byteRead("Insert a byte value:");
                    continue;
                case "2":
                    ic.intRead("Insert a int value:");
                    continue;
                case "3":
                    ic.floatRead("Insert a float value:");
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
                    try {
                        ic.booleanRead("Insert s for true or n for false value:");
                    } catch(InValueError e){
                        System.out.println(e.getMessage());
                    }
                    continue;
                case "0":
                    System.out.println("Goodbye");
                    control = false;
                    break;
                default:
                    System.out.println("Invalid option");
                    System.out.println("Please choose a number from 0 to 7: ");
            }

        } scanner.close();
    }

}
