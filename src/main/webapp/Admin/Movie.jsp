<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 03-Jul-23
  Time: 9:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Admin</title>
    <link rel="stylesheet" href="/Admin/admin.css">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body style="background-color: #03c8a8">
<div class="container">
    <h2>Danh sách User</h2>
    <p>Bao gồm cả Admin </p>
    <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myMD">
        Create
    </button>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>Namee</th>
            <th>Time</th>
            <th>broadcast_date</th>
            <th>Manufacture</th>
            <th>Summary</th>
            <th>Image</th>
            <th>Video</th>
            <th>Director</th>
            <th>Nation</th>
            <th>Action</th>
            <th>Action</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${movie}" var="nv">
            <tr>
                <form action="/Update_Movie" method="post">
                    <input type="hidden" name="id" value="${nv.getId()}">
                    <td>${nv.getId()}</td>
                    <td><input type="text" name="name" value="${nv.getName()}"></td>
                    <td><input type="text" name="time" value="${nv.getTime()}"></td>
                    <td><input type="text" name="broadcast" value="${nv.getBroadCast()}"></td>
                    <td><input type="text" name="Manufacture" value="${nv.getManufacture()}"></td>
                    <td><input type="text" name="Summary" value="${nv.getSummary()}"></td>
                    <td><input type="text" name="Img" value="${nv.getImg()}"></td>
                    <td><input type="text" name="Video" value="${nv.getVideo()}"></td>
                    <td><input type="text" name="Director" value="${nv.getDirector()}"></td>
                    <td><input type="text" name="Nation" value="${nv.getNation()}"></td>
                    <td>
                        <button type="submit" class="custom-btn btn-9">Edit</button>
                    </td>
                </form>
                </td>
                <td>
                    <form action="/Delete_Movie" method="post">
                        <input type="hidden" name="id" value="${nv.getId()}">
                        <button type="submit" class="custom-btn btn-3">Delete</button>
                    </form>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<form action="/Add_Movie" method="post">
    <div class="modal" id="myMD">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header" style="text-align: center">
                    <h4 class="modal-title" style="text-align: center">Form Create Movie</h4>
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                </div>
                <div class="modal-body">
                    <label for="1">Name Movie : </label>
                    <input class="a" id="1" placeholder="name" name="name">
                    <br>
                    <label for="2">Time :</label>
                    <input class="a" id="2" placeholder="time(Number)" name="time">
                    <br>
                    <label for="3">Broadcast :</label>
                    <input class="a" id="3" placeholder="broadcast" name="broadcast">
                    <br>
                    <label for="4">Manufacture : </label>
                    <input class="a" id="4" placeholder="Manufacture" name="Manufacture">
                    <br>
                    <label for="5">Summary : </label>
                    <input class="a" id="5" placeholder="Summary" name="Summary">
                    <br>
                    <label for="6">Img :</label>
                    <input class="a" id="6" placeholder="Img" name="Img">
                    <br>
                    <label for="7">Video :</label>
                    <input class="a" id="7" placeholder="Video" name="Video">
                    <br>
                    <label for="8">Director :</label>
                    <input class="a" id="8" placeholder="Director(Number)" name="Director">
                    <br>
                    <label for="9">Nation :</label>
                    <input class="a" id="9" placeholder="Nation(Number)" name="Nation">
                    <br>
                </div>
                <div class="modal-footer">
                    <button type="submit" class="custom-btn btn-7">Create</button>
                    <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
                </div>
            </div>
        </div>
    </div>
</form>
</body>
</html>

