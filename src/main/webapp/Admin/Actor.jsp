<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 03-Jul-23
  Time: 3:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<<html>
<head>
    <title>Actor</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class="container">
    <h2>Danh sách Actor</h2>
    <p>Bao gồm cả Admin </p>
    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myMD">
        Create
    </button>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Age</th>
            <th>Image</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${actor}" var="temp">
            <tr>
                <form action="/Update_Actor" method="post">
                    <input type="hidden" name="id" value="${temp.getId_Actor()}">
                    <td>${temp.getId_Actor()}</td>
                    <td><input type="text" name="name_users" placeholder="${temp.getName_Actor()}"></td>
                    <td><input type="text" name="acc" placeholder="${temp.getAge()}"></td>
                    <td><input type="text" name="pass" placeholder="${temp.getImage_Actor()}"></td>
                    <td><button type="submit" class="btn btn-warning">Edit</button></td>
                </form>

                <td>
                    <form action="/Delete_Actor" method="post">
                        <input type="hidden" name="id" value="${temp.getId_Actor()}">
                        <button type="submit" class="btn btn-danger">Delete</button>
                    </form>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<form action="/Add_Actor" method="post">
    <div class="modal" id="myMD">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header" style="text-align: center">
                    <h4 class="modal-title" style="text-align: center">Form Create User</h4>
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                </div>
                <div class="modal-body">
                    <input placeholder="name" name="name_Actor"><br>
                    <input placeholder="user" name="age"><br>
                    <input placeholder="pass" name="image_Actor"><br>
                </div>
                <div class="modal-footer">
                    <button type="submit" class="btn btn-success">Create</button>
                    <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
                </div>
            </div>
        </div>
    </div>
</form>
</body>
</html>

