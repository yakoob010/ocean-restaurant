package DAO;

import model.Reservation;

import java.util.List;

public interface ReservationDAO {
    List<Reservation> getAllReservations();
    boolean addReservation(Reservation res);
}
