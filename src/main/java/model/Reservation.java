package model;

public class Reservation {
    private int id;
    private String guestName;
    private String roomNumber;
    private String checkIn;
    private double totalPrice;
    private String status;

    // 1. Constructor for Fetching from DB (with ID)
    public Reservation(int id, String guestName, String roomNumber, String checkIn, double totalPrice, String status) {
        this.id = id;
        this.guestName = guestName;
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.totalPrice = totalPrice;
        this.status = status;
    }

    // 2. Constructor for Creating New (without ID, ID is Auto-increment)
    public Reservation(String guestName, String roomNumber, String checkIn, double totalPrice, String status) {
        this.guestName = guestName;
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.totalPrice = totalPrice;
        this.status = status;
    }

    // 3. Getters (Required for JSP and DAO)
    public int getId() { return id; }
    public String getGuestName() { return guestName; }
    public String getRoomNumber() { return roomNumber; }
    public String getCheckIn() { return checkIn; }
    public double getTotalPrice() { return totalPrice; }
    public String getStatus() { return status; }

    // 4. Setters (Required if you want to modify values later)
    public void setId(int id) { this.id = id; }
    public void setGuestName(String guestName) { this.guestName = guestName; }
    public void setRoomNumber(String roomNumber) { this.roomNumber = roomNumber; }
    public void setCheckIn(String checkIn) { this.checkIn = checkIn; }
    public void setTotalPrice(double totalPrice) { this.totalPrice = totalPrice; }
    public void setStatus(String status) { this.status = status; }
}