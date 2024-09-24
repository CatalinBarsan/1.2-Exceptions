package nivel03.ejercicio01.main.java.com.modules.cinema;

import nivel03.ejercicio01.main.java.com.modules.seat.SeatManager;

public class Cinema {
    private int numberOfRows;
    private int seatsPerRow;
    private SeatManager seatManager;
    private CinemaManager cinemaManager;

    public Cinema() {
        seatManager = new SeatManager();
        cinemaManager = new CinemaManager(this);
    }

    public String iniciar(){
        cinemaManager.menu();
        System.out.println("\nCinema Iniciada " + cinemaManager.remote); // test
        return cinemaManager.remote;
    }

}
