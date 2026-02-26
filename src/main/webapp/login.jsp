<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ocean View Resort - Login</title>
    <style>
        body { font-family: sans-serif; display: flex; justify-content: center; align-items: center; height: 100vh; background: #f0f2f5; }
        .login-card { background: white; padding: 2rem; border-radius: 8px; box-shadow: 0 4px 12px rgba(0,0,0,0.1); }
        input { display: block; width: 100%; margin-bottom: 1rem; padding: 0.5rem; }
        button { width: 100%; padding: 0.5rem; background: #007bff; color: white; border: none; cursor: pointer; }
    </style>
</head>
<body>
<div class="login-card">
    <h2>Ocean View Resort</h2>
    <p style="color: red">${error}</p>
    <form action="login" method="post">
        <input type="text" name="username" placeholder="Username" required>
        <input type="password" name="password" placeholder="Password" required>
        <button type="submit">Login</button>
    </form>
</div>
</body>
</html>