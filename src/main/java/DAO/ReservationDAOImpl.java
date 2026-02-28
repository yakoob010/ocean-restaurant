package DAO;

import model.Reservation;
import util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ReservationDAOImpl implements ReservationDAO {
    private Connection conn = DBConnection.getConnection();

    @Override
    public List<Reservation> getAllReservations() {
        List<Reservation> list = new ArrayList<>();
        String sql = "SELECT * FROM reservations";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Reservation(
                        rs.getInt("id"),
                        rs.getString("guest_name"),
                        rs.getString("room_number"),
                        rs.getString("check_in"),
                        rs.getDouble("total_price"),
                        rs.getString("status")
                ));
            }
        } catch (SQLException e) { e.printStackTrace(); }
        return list;
    }

    // ADD THIS METHOD BELOW
    @Override
    public boolean addReservation(Reservation res) {
        String sql = "INSERT INTO reservations (guest_name, room_number, check_in, total_price, status) VALUES (?, ?, ?, ?, ?)";
        // Get a fresh connection from your DBConnection utility
        try (Connection connection = util.DBConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setString(1, res.getGuestName());
            ps.setString(2, res.getRoomNumber());
            ps.setString(3, res.getCheckIn());
            ps.setDouble(4, res.getTotalPrice());
            ps.setString(5, res.getStatus());

            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}