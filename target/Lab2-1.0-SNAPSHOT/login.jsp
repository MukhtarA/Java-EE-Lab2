<%--
  Created by IntelliJ IDEA.
  User: mukhtar
  Date: 08.02.2021
  Time: 09:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <style>
        body{
            background-color: #e9abbb;
        }
        a{
            text-decoration: none;
        }
    </style>
</head>
<body>
<div align="center">
    <h3>Login page</h3>
    <form action="login" method="post">
        <table>
            <tr>
                <td>Username: </td>
                <td><input type="text" name="username" required></td>
            </tr>
            <tr>
                <td>Password: </td>
                <td><input type="password" name="password" required></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Login"></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
