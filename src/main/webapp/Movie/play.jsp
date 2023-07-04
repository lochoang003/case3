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
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
    <link rel="stylesheet" href="/Movie/movie.css">
    <link rel="stylesheet" href="/HOME/home.css">
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
            <a id="logo1" href="#home"><img
                    src="https://github.com/carlosavilae/Netflix-Clone/blob/master/img/logo.PNG?raw=true"
                    alt="Logo Image"></a>
        </nav>

    </div>
    <div class="col-sm-12"></div>

    <div class="container-fluid " style="margin-top:0px; background-color: black;color: lightskyblue">
        <div class="row">
            <div class="col-sm-2">
            </div>
            <div class="col-sm-8">
                <div style="text-align: center">
                    <iframe width="560" height="315" src="${movie.video}" title="YouTube video player" frameborder="0"
                            allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share"
                            allowfullscreen></iframe>

                </div>
                <%--                <div class="row">--%>
                <%--                    <table>--%>
                <%--                        <tr>--%>
                <%--                            <td>--%>
                <%--                            </td>--%>
                <%--                            <td>--%>
                <%--                                <button type="button" class="btn btn-netflix" onclick="toggleWatchlist(this)">--%>
                <%--                                    <i class="fas fa-plus"></i>--%>
                <%--                                    Add to List--%>
                <%--                                </button>--%>
                <%--                            </td>--%>
                <%--                        </tr>--%>
                <%--                    </table>--%>
                <%--                </div>--%>
                <%--                <div class="row">--%>
                <%--                    <div class="col-sm-6">--%>
                <%--                        <div class="row">--%>
                <%--                            <div class="col-sm-12">--%>
                <%--                                <p class="thead">Genres: </p>--%>
                <%--                                <p class="b"></p>--%>
                <%--                            </div>--%>

                <%--                        </div>--%>
                <%--                        <div class="row">--%>
                <%--                            <div class="col-sm-12">--%>
                <%--                                <p class="description">${movie.summary}</p>--%>
                <%--                            </div>--%>
                <%--                        </div>--%>

                <%--                    </div>--%>
                <%--                    <div class="col-sm-6">--%>
                <%--                        <div class="row">--%>
                <%--                            <div class="col-sm-12">--%>
                <%--                                <p class="thead">Cast: </p>--%>
                <%--                                <p class="b">${actor_Name}</p>--%>
                <%--                            </div>--%>
                <%--                        </div>--%>
                <%--                        <div class="row">--%>
                <%--                            <div class="col-sm-12">--%>
                <%--                                <p class="thead">Director: </p>--%>
                <%--                                <p class="b">${movie.director}</p>--%>
                <%--                            </div>--%>
                <%--                        </div>--%>
                <%--                        <div class="row">--%>
                <%--                            <div class="col-sm-12">--%>
                <%--                                <p class="thead">Broadcast Date : </p>--%>
                <%--                                <p class="b">${movie.broadCast}</p>--%>
                <%--                            </div>--%>
                <%--                        </div>--%>
                <%--                        <div class="row">--%>
                <%--                            <div class="col-sm-12">--%>
                <%--                                <p class="thead">Nation : </p>--%>
                <%--                                <p class="b">${movie.nation}</p>--%>
                <%--                            </div>--%>
                <%--                        </div>--%>
                <%--                    </div>--%>

                <%--                </div>--%>
                <%--            </div>--%>
                <div class="col-sm-2">
                </div>
            </div>
        </div>
        <div class="sub-links">
            <ul>
                <li><a href="#">Audio and Subtitles</a></li>
                <li><a href="#">Audio Description</a></li>
                <li><a href="#">Help Center</a></li>
                <li><a href="#">Gift Cards</a></li>
                <li><a href="#">Media Center</a></li>
                <li><a href="#">Investor Relations</a></li>
                <li><a href="#">Jobs</a></li>
                <li><a href="#">Terms of Use</a></li>
                <li><a href="#">Privacy</a></li>
                <li><a href="#">Legal Notices</a></li>
                <li><a href="#">Corporate Information</a></li>
                <li><a href="#">Contact Us</a></li>
            </ul>
        </div>


        <footer>
            <p>&copy 1997-2023 Netflix, Inc.</p>
            <p>Carlos Avila &copy 2018</p>
        </footer>
    </div>
</div>
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
