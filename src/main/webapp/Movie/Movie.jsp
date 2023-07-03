<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Bootstrap 4 Website Example</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" integrity="sha512-8B5iE0U0x8C1EzXfX9eWwurA8lvyPmO8hqjYDhW5zF7z+gLZw5Jt8C0B2aiqKz2g4R6VwZ9SDJZ1C2pXcUv1zQ==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" />
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
    <link rel="stylesheet" href="movie.css">
    <style>
        .thead{
            color: darkgrey;
        }
        .b{
            color: white;
        }
        .description{
            color: lightgray;
        }
        img{
            width: 80%;
        }
    </style>
</head>
<body>
<div class="container-fluid" style="margin-top:0px; background-color: black;color: lightskyblue">
    <div class="row">
        <div class="col-sm-2">
        </div>
        <div class="col-sm-8">
            <div class="row">
                <img src="https://danviet.mediacdn.vn/296231569849192448/2022/7/19/mv5bmtjimzgwztktyzzhzc00yzhhlwezzdutmgm2nte4mzq4ngfmxkeyxkfqcgdeqwpybav1-1649412049769362683029-1658210943068656623366.jpg" class="img-fluid">
            </div>
            <div class="row">
                <table>
                    <tr>
                        <td>
                            <button type="button" class="btn btn-play" style="color: black; background-color: white">Play</button>
                        </td>
                        <td>
                            <button type="button" class="btn btn-netflix" onclick="toggleWatchlist(this)">
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
                            <p class="b">Action</p>
                        </div>

                    </div>
                    <div class="row">
                        <div class="col-sm-12">
                            <p class="description">A chemistry teacher diagnosed with inoperable lung cancer turns to manufacturing and selling methamphetamine with a former student in order to secure his family's future.</p>
                        </div>
                    </div>

                </div>
                <div class="col-sm-6">
                    <div class="row">
                        <div class="col-sm-12">
                            <p class="thead">Cast: </p>
                            <p class="b">Bryan Cranston, Aaron Paul</p>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-12">
                            <p class="thead">Director: </p>
                            <p class="b">Vince Gilligan</p>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-12">
                            <p class="thead">Broadcast Date : </p>
                            <p class="b">25/9/2007</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-sm-2">
        </div>
    </div>
</div>

<div class="jumbotron text-center" style="margin-bottom:0;background-color: black">
    <p>NETFLIX</p>
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

