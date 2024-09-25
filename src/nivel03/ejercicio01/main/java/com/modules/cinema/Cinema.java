package nivel03.ejercicio01.main.java.com.modules.cinema;

import nivel03.ejercicio01.main.java.com.modules.seat.SeatManager;

import java.util.Scanner;

public class Cinema {
    private int totalRows;
    private int seatsPerRow;
    private SeatManager seatManager;
    private CinemaManager cinemaManager;

    public Cinema() {
        seatManager = new SeatManager();
        cinemaManager = new CinemaManager(this);
        initializeData();
    }

    public void start() {
        cinemaManager.menu();
    }

    public void initializeData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nMENU" + "\nEnter the number of rows in the cinema:");
        totalRows = scanner.nextInt();
        System.out.println("Enter the number of seats per row:");
        seatsPerRow = scanner.nextInt();
    }

    public int getTotalRows() {
        return totalRows;
    }

    public int getSeatsPerRow() {
        return seatsPerRow;
    }

    public SeatManager getSeatManager() {
        return seatManager;
    }
}
