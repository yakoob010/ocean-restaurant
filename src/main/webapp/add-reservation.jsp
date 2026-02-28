<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2/28/2026
  Time: 12:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>New Reservation - Ocean View</title>
    <style>
        .form-container { width: 400px; margin: 50px auto; padding: 20px; border: 1px solid #ccc; border-radius: 10px; }
        input, select { width: 100%; padding: 10px; margin: 10px 0; border: 1px solid #ddd; }
        button { width: 100%; padding: 10px; background: #28a745; color: white; border: none; cursor: pointer; }
    </style>
</head>
<body>
<div class="form-container">
    <h2>Book a Room</h2>
    <form action="add-reservation" method="post">
        <input type="text" name="guestName" placeholder="Guest Full Name" required>
        <input type="text" name="roomNumber" placeholder="Room Number (e.g. 101A)" required>
        <input type="date" name="checkIn" required>
        <input type="number" step="0.01" name="totalPrice" placeholder="Total Price ($)" required>
        <button type="submit">Confirm Reservation</button>
    </form>
    <p style="text-align: center;"><a href="dashboard">Back to Dashboard</a></p>
</div>
</body>
</html>