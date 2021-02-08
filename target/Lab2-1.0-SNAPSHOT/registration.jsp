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
    <title>Registration page</title>
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
    <h3>Registration page</h3>
    <form action="registration" method="post">
        <table>
            <tr>
                <td>Surname: </td>
                <td><input type="text" name="surname" required></td>
            </tr>
            <tr>
                <td>Name: </td>
                <td><input type="text" name="name" required></td>
            </tr>
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
                <td><input type="submit" value="Registration"></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
