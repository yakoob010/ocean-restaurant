package model;

public class Bill {
    private int id;
    private int reservationId;
    private double amount;
    private double tax;
    private double total;

    public Bill(int reservationId, double amount) {
        this.reservationId = reservationId;
        this.amount = amount;
        this.tax = amount * 0.15; // 15% Ocean View Luxury Tax
        this.total = this.amount + this.tax;
    }
    // Add Getters and Setters here
}