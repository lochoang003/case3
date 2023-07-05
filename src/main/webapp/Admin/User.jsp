<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 02-Jul-23
  Time: 7:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Admin</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
    <link rel="stylesheet" href="/Admin/admin.css">
</head>
<body>
<div class="container">
    <h2>Danh sách User</h2>
    <p>Bao gồm cả Admin </p>
    <button type="button" class="custom-btn btn-5" data-toggle="modal" data-target="#myMD">
        Create
    </button>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>id</th>
            <th>Name</th>
            <th>ID</th>
            <th>Pass</th>
            <th>Date Created</th>
            <th>Status</th>
            <th>Role</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${user}" var="nv">
            <tr>
                <form action="/Update_User" method="post">
                    <input type="hidden" name="id" value="${nv.getId()}">
                    <td>${nv.getId()}</td>
                    <td><input type="text" name="name_users" placeholder="${nv.getName()}"></td>
                    <input type="hidden" name="acc" placeholder="${nv.getAcc()}">
                    <td>${nv.getAcc()}</td>
                    <td><input type="text" name="pass" placeholder="${nv.getPass()}"></td>
                    <td><input type="text" name="date_created" placeholder="${nv.getDate_created()}"></td>
                    <td><c:if test="${nv.getStatus()==1}">
                        Active
                    </c:if>
                        <c:if test="${nv.getStatus()==0}">
                            Lock
                        </c:if></td>
                    <td>${nv.getRole()}</td>
                    <td>
                        <button type="submit" class="custom-btn btn-3">Edit</button>
                </form>
                </td>
                <td>
                    <form action="/Delete_User" method="post">
                        <input type="hidden" name="id" value="${nv.getId()}">
                        <button type="submit" class="custom-btn btn-4">Delete</button>
                    </form>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<form action="/Add_User" method="post">
    <div class="modal" id="myMD">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header" style="text-align: center">
                    <h4 class="modal-title" style="text-align: center">Form Create User</h4>
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                </div>
                <div class="modal-body">
                    <input placeholder="name" name="name_users"><br>
                    <input placeholder="user" name="acc"><br>
                    <input placeholder="pass" name="pass"><br>
                    <input placeholder="date_created" name="date_created"><br>
                    <input type="radio" id="admin" name="role" value="Admin">
                    <label for="admin">Admin</label><br>
                    <input type="radio" id="client" name="role" value="Client">
                    <label for="client">Client</label><br>
                </div>
                <div class="modal-footer">
                    <button type="submit" class="custom-btn btn-6">Create</button>
                    <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
                </div>
            </div>
        </div>
    </div>
</form>
</body>
</html>
