package nivel03.ejercicio01.main.java.com.modules.cinema;


import java.util.Scanner;

public class CinemaManager {
    String remote = new String();
    Scanner sc = new Scanner(System.in);
    private boolean control;
    private Cinema cinema;

    public CinemaManager(Cinema cinema) {
        this.cinema = cinema;
    }

    public String menu() {
        control = true;
        while (control) {

            try {
                System.out.println("\nMENU" +
                        "\n1.- Show all reserved seats." +
                        "\n2.- Show seats reserved by a person." +
                        "\n3.- Reserve a seat." +
                        "\n4.- Cancel a seat reservation." +
                        "\n5.- Cancel all reservations for a person." +
                        "\n0.- Exit.");

                remote = sc.nextLine();

                if (remote.compareTo("0") >= 0 && remote.compareTo("5") <= 0) {
                    System.out.println("Executing your choise... " + remote);
                    control = false;
                } else {
                    System.out.println("Invalid option, please enter a number between 0 and 5.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        return remote;
    }



}
