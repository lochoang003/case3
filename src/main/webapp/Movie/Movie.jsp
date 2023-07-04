<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Bootstrap 4 Website Example</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"
          integrity="sha512-8B5iE0U0x8C1EzXfX9eWwurA8lvyPmO8hqjYDhW5zF7z+gLZw5Jt8C0B2aiqKz2g4R6VwZ9SDJZ1C2pXcUv1zQ=="
          crossorigin="anonymous" referrerpolicy="no-referrer"/>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <script defer src="https://use.fontawesome.com/releases/v5.1.0/js/all.js"
            integrity="sha384-3LK/3kTpDE/Pkp8gTNp2gR/2gOiwQ6QaO7Td0zV76UFJVhqLl4Vl3KL1We6q6wR9"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
    <link rel="stylesheet" href="/Movie/movie.css">
    <style>
        .thead {
            color: darkgrey;
        }

        .b {
            color: white;
        }

        .description {
            color: lightgray;
        }

        img {
            width: 80%;
        }
    </style>
</head>
<body style="background-color: black">
<div class="row">
    <div class="col-sm-12">
        <nav class="navbar navbar-expand-lg" style="background-color: black">
            <a id="logo" href="#home"><img
                    src="https://github.com/carlosavilae/Netflix-Clone/blob/master/img/logo.PNG?raw=true"
                    alt="Logo Image"></a>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="nav navbar-nav navbar-right" >
                    <li class="nav-item active" >
                        <a href="/home" style="color: lightgrey">Home</a>
                    </li>
                    <li class="nav-item">
                        <a href="#movies" style="color: lightgrey">Country</a>
                    </li>
                    <li class="nav-item">
                        <a href="#" style="color: lightgrey">My List</a>
                    </li>
                </ul>
            </div>
        </nav>

    </div>
</div>
<%--<div class="row" style="margin-top:0px; background-color: black;color: lightgrey; width: 100%">--%>
    <div class="wrapper">
        <section class="main-container row">
            <div class="container-fluid" >
                <div class="col-sm-2">
                </div>
                <div class="col-sm-8" style=" display: flex;justify-content: center">

                    <div >
                        <div style="text-align: center">
                            <div class="row">
                                <img src="${movie.img}" class="img-fluid">
                            </div>
                            <div class="row">
                                <table>
                                    <tr>
                                        <td>
                                            <form action="/play" method="post">
                                                <button type="submit" class="btn btn-play"
                                                        style="color: black; background-color: white">Play
                                                </button>
                                                <input name="id_Movie" type="hidden" value="${movie.id}">
                                            </form>
                                        </td>
                                        <td>
                                            <button type="button" class="btn btn-netflix"
                                                    onclick="toggleWatchlist(this)">
                                                <i class="fas fa-plus"></i>
                                                Add to List
                                            </button>
                                        </td>
                                    </tr>
                                </table>
                            </div>
                            <div class="row">
                                <div class="col-sm-6">
                                    <div class="row">
                                        <div class="col-sm-12">
                                            <p class="thead">Genres: </p>
                                            <p class="b"></p>
                                        </div>

                                    </div>
                                    <div class="row">
                                        <div class="col-sm-12">
                                            <p class="description">${movie.summary}</p>
                                        </div>
                                    </div>

                                </div>
                                <div class="col-sm-6">
                                    <div class="row">
                                        <div class="col-sm-12">
                                            <p class="thead">Cast: </p>
                                            <p class="b">${actor_Name}</p>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-sm-12">
                                            <p class="thead">Director: </p>
                                            <p class="b">${movie.director}</p>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-sm-12">
                                            <p class="thead">Broadcast Date : </p>
                                            <p class="b">${movie.broadCast}</p>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-sm-12">
                                            <p class="thead">Nation : </p>
                                            <p class="b">${movie.nation}</p>
                                        </div>
                                    </div>
                                </div>

                            </div>
                        </div>
                    </div>

                </div>
            </div>
            <div class="col-sm-2">
            </div>

            <div class="jumbotron text-center" style="margin-bottom:0;background-color: black">
                <p>NETFLIX</p>
            </div>
        </section>
    </div>
</div>
<%--</div>--%>
</body>
</html>
<script>
    function toggleWatchlist(button) {
        if (button.innerHTML === "<i class=\"fas fa-plus\"></i> Add to List") {
            button.innerHTML = "<i class=\"fas fa-check\"></i> ";
        } else {
            button.innerHTML = "<i class=\"fas fa-plus\"></i> Add to List";
        }
    }
</script>
