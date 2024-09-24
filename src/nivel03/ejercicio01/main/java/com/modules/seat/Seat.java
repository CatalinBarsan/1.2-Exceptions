package nivel03.ejercicio01.main.java.com.modules.seat;

import javax.sound.sampled.Line;


public class Seat {

    private int rowNumber;
    private int seatNumber;
    private String personReservingSeat;

    public Seat(int rowNumber, int seatNumber, String personReservingSeat) {
        this.rowNumber = rowNumber;
        this.seatNumber = seatNumber;
        this.personReservingSeat = personReservingSeat;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public String getPersonReservingSeat() {
        return personReservingSeat;
    }

    public boolean Equals(Object newSeat) {
        if (this == newSeat) {
            return true;
        }
        if (newSeat == null || getClass() != newSeat.getClass()) {
            return false;
        }
        Seat otherSeat = (Seat) newSeat;
        return rowNumber == otherSeat.rowNumber && seatNumber == otherSeat.seatNumber;
    }
    public String ToString() {
        return "Row: " + rowNumber + ", Seat: " + seatNumber + ", Person: " + personReservingSeat + ".";
    }

}
