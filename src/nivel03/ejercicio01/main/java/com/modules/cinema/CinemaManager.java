package nivel03.ejercicio01.main.java.com.modules.cinema;
import nivel03.ejercicio01.main.java.com.modules.customErrors.*;
import nivel03.ejercicio01.main.java.com.modules.seat.Seat;

import java.util.InputMismatchException;
import java.util.Scanner;


public class CinemaManager {
    private Cinema cinema;

    public CinemaManager(Cinema cinema) {
        this.cinema = cinema;
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int option = -1;

        do {
            try {
                System.out.println("1.- Show all reserved seats.");
                System.out.println("2.- Show reserved seats by a person.");
                System.out.println("3.- Reserve a seat.");
                System.out.println("4.- Cancel a seat reservation.");
                System.out.println("5.- Cancel all reservations for a person.");
                System.out.println("0.- Exit.");
                System.out.print("Choose an option: ");

                option = scanner.nextInt(); // Expect an integer

                switch (option) {
                    case 1:
                        showSeats();
                        break;
                    case 2:
                        showSeatsByPerson();
                        break;
                    case 3:
                        reserveSeat();
                        break;
                    case 4:
                        cancelReservation();
                        break;
                    case 5:
                        cancelReservationsByPerson();
                        break;
                    case 0:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        } while (option != 0);
    }

    private void showSeats() {
        cinema.getSeatManager().showAllSeats();
    }

    private void showSeatsByPerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the person:");
        String person = scanner.nextLine();
        cinema.getSeatManager().showSeatsByPerson(person);
    }

    private void reserveSeat() {
        try {
            int row = getRow();
            int seat = getSeat();
            String person = getPersonName();
            cinema.getSeatManager().addSeat(new Seat(row, seat, person));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void cancelReservation() {
        try {
            int row = getRow();
            int seat = getSeat();
            cinema.getSeatManager().removeSeat(row, seat);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void cancelReservationsByPerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the person:");
        String person = scanner.nextLine();
        cinema.getSeatManager().removeSeatsByPerson(person);
    }

    private int getRow() throws ExcepcionIncorrectRow {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the row number:");
        int row = scanner.nextInt();
        if (row < 1 || row > cinema.getTotalRows()) {
            throw new ExcepcionIncorrectRow("Invalid row number.");
        }
        return row;
    }

    private int getSeat() throws ExcepcionIncorrectSeat {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the seat number:");
        int seat = scanner.nextInt();
        if (seat < 1 || seat > cinema.getSeatsPerRow()) {
            throw new ExcepcionIncorrectSeat("Invalid seat number.");
        }
        return seat;
    }

    private String getPersonName() throws ExcepcionIncorrectPerson {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the person's name:");
        String name = scanner.nextLine();
        if (name.matches(".*\\d.*")) {
            throw new ExcepcionIncorrectPerson("Name cannot contain numbers.");
        }
        return name;
    }
}

