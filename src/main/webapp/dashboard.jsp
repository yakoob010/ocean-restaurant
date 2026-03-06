<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ocean View Resort - Dashboard</title>
    <style>
        table { width: 80%; margin: 20px auto; border-collapse: collapse; }
        th, td { border: 1px solid #ddd; padding: 12px; text-align: left; }
        th { background-color: #007bff; color: white; }
        .header { display: flex; justify-content: space-around; background: #333; color: white; padding: 10px; }
    </style>
</head>
<body>
<div class="header">
    <h1>Ocean View Dashboard</h1>
    <p>Welcome, ${user.username} | <a href="logout" style="color:white">Logout</a></p>
</div>

<div style="text-align: center; margin-top: 20px;">
    <button onclick="location.href='add-reservation.jsp'">+ New Reservation</button>
    <button onclick="location.href='manage-admins.jsp'">Manage Admins</button>
</div>

<table>
    <tr>
        <th>ID</th>
        <th>Guest</th>
        <th>Room</th>
        <th>Check-in</th>
        <th>Price</th>
        <th>Status</th>
        <th>Actions</th>
    </tr>
    <c:forEach var="res" items="${reservations}">
        <tr>
            <td>${res.id}</td>
            <td>${res.guestName}</td>
            <td>${res.roomNumber}</td>
            <td>${res.checkIn}</td>
            <td>$${res.totalPrice}</td>
            <td>${res.status}</td>
            <td>
                <a href="create-bill?id=${res.id}">Generate Bill</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>