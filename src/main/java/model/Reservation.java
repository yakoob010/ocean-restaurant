package model;

public class Reservation {
    private int id;
    private String guestName;
    private String roomNumber;
    private String checkIn;
    private double totalPrice;
    private String status;

    // Constructors, Getters, and Setters
    public Reservation(int id, String guestName, String roomNumber, String checkIn, double totalPrice, String status) {
        this.id = id;
        this.guestName = guestName;
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.totalPrice = totalPrice;
        this.status = status;
    }
}
