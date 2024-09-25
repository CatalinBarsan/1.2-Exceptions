package nivel03.ejercicio01.main.java.com.modules.seat;

import nivel03.ejercicio01.main.java.com.modules.customErrors.*;

import java.util.ArrayList;
import java.util.List;

public class SeatManager {
    private List<Seat> seats;

    public SeatManager() {
        seats = new ArrayList<>();
    }

    public void addSeat(Seat seat) throws ExcepcioSestBusy {
        if (findSeat(seat.getRowNumber(), seat.getSeatNumber()) != -1) {
            throw new ExcepcioSestBusy("Seat is already reserved.");
        }
        seats.add(seat);
    }

    public void removeSeat(int row, int seatNumber) throws ExceptionSeatEmty {
        int seatIndex = findSeat(row, seatNumber);
        if (seatIndex == -1) {
            throw new ExceptionSeatEmty("Seat is not reserved.");
        }
        seats.remove(seatIndex);
    }

    public void showAllSeats() {
        if (seats.isEmpty()) {
            System.out.println("No seats reserved.");
        } else {
            for (Seat seat : seats) {
                System.out.println(seat);
            }
        }
    }

    public void showSeatsByPerson(String person) {
        boolean found = false;
        for (Seat seat : seats) {
            if (seat.getReservedBy().equalsIgnoreCase(person)) {
                System.out.println(seat);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No seats reserved by " + person);
        }
    }

    public void removeSeatsByPerson(String person) {
        seats.removeIf(seat -> seat.getReservedBy().equalsIgnoreCase(person));
        System.out.println("Reservations for " + person + " have been removed.");
    }

    private int findSeat(int row, int seatNumber) {
        for (int i = 0; i < seats.size(); i++) {
            Seat seat = seats.get(i);
            if (seat.getRowNumber() == row && seat.getSeatNumber() == seatNumber) {
                return i;
            }
        }
        return -1;
    }
}
