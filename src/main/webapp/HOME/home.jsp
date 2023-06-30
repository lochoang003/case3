<html>
<head>
    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Netflix</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script defer src="https://use.fontawesome.com/releases/v5.1.0/js/all.js"
            integrity="sha384-3LK/3kTpDE/Pkp8gTNp2gR/2gOiwQ6QaO7Td0zV76UFJVhqLl4Vl3KL1We6q6wR9"
            crossorigin="anonymous"></script>

    <script src="main.js"></script>
    <link rel="stylesheet" href="home.css">
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
<div class="wrapper">

    <!-- HEADER -->
    <!--    LOGO VÀ THANH TÌM KIẾM-->
    <header>
        <div class="netflixLogo">
            <a id="logo" href="#home"><img
                    src="https://github.com/carlosavilae/Netflix-Clone/blob/master/img/logo.PNG?raw=true"
                    alt="Logo Image"></a>
        </div>
        <nav class="main-nav">
            <ul class="nav navbar-nav navbar-right">
                <!--            trang chủ-->
                <li><a href="#home">Home</a></li>
                <!--            thể loại-->
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">Genres
                        <span class="caret"></span></a>
                    <ul class="dropdown-menu">
<%--                        <c:forEach items="${}">--%>

<%--                        </c:forEach>--%>
                        <li class="list-group-item"><a href="#"> 18+ </a></li>
                        <li class="list-group-item"><a href="#">Horror</a></li>
                        <li class="list-group-item"><a href="#">Romance</a></li>
                        <li class="list-group-item"><a href="#">Anime</a></li>
                        <li class="list-group-item"><a href="#">Action</a></li>
                        <li class="list-group-item"><a href="#">Documentary</a></li>
                    </ul>
                </li>
                <!--            quốc gia-->
                <li><a href="#movies">Country</a></li>
                <!--            phim đã lưu-->
            </ul>
        </nav>
        <nav class="sub-nav">
            <!--            tìm kiếm-->
            <a href="#"><i class="fas fa-search sub-nav-logo"></i></a>
            <!--            thông báo-->
            <a href="#"><i class="fas fa-bell sub-nav-logo"></i></a>
            <!--            tài khoản-->


            <div class="dropdown">
                <a class="dropdown-toggle" data-toggle="dropdown" href="#">Account
                    <span class="caret"></span></a>
                <ul class="dropdown-menu">
                    <li class="list-group-item"><a href="/login">Log out</a></li>
                    <li class="list-group-item"><a href="#">My List</a></li>
                </ul>
            </div>


<%--            <a href="#">Account</a>--%>
        </nav>
    </header>
    <!-- END OF HEADER -->

    <!-- MAIN CONTAINER -->


    <section class="main-container">
        <!--        phim cơ bản-->
        <div class="location" id="home">
            <h1 id="home1">Popular on Netflix</h1>
            <div class="box">
                <a href=""><img src="https://github.com/carlosavilae/Netflix-Clone/blob/master/img/p1.PNG?raw=true"
                                alt=""></a>
                <a href=""><img src="https://github.com/carlosavilae/Netflix-Clone/blob/master/img/p2.PNG?raw=true"
                                alt=""></a>
                <a href=""><img src="https://github.com/carlosavilae/Netflix-Clone/blob/master/img/p3.PNG?raw=true"
                                alt=""></a>
                <a href=""><img src="https://github.com/carlosavilae/Netflix-Clone/blob/master/img/p4.PNG?raw=true"
                                alt=""></a>
                <a href=""><img src="https://github.com/carlosavilae/Netflix-Clone/blob/master/img/p5.PNG?raw=true"
                                alt=""></a>
                <a href=""><img src="https://github.com/carlosavilae/Netflix-Clone/blob/master/img/p6.PNG?raw=true"
                                alt=""></a>

                <a href=""><img src="https://github.com/carlosavilae/Netflix-Clone/blob/master/img/p7.PNG?raw=true"
                                alt=""></a>
                <a href=""><img src="https://github.com/carlosavilae/Netflix-Clone/blob/master/img/p8.PNG?raw=true"
                                alt=""></a>
                <a href=""><img src="https://github.com/carlosavilae/Netflix-Clone/blob/master/img/p9.PNG?raw=true"
                                alt=""></a>
                <a href=""><img src="https://github.com/carlosavilae/Netflix-Clone/blob/master/img/p10.PNG?raw=true"
                                alt=""></a>
                <a href=""><img src="https://github.com/carlosavilae/Netflix-Clone/blob/master/img/p11.PNG?raw=true"
                                alt=""></a>
                <a href=""><img src="https://github.com/carlosavilae/Netflix-Clone/blob/master/img/p12.PNG?raw=true"
                                alt=""></a>
            </div>
        </div>
        <!--        trend-->

        <h1 id="myList">Trending Now</h1>
        <div class="box">
            <a href=""><img src="https://github.com/carlosavilae/Netflix-Clone/blob/master/img/t1.PNG?raw=true" alt=""></a>
            <a href=""><img src="https://github.com/carlosavilae/Netflix-Clone/blob/master/img/t2.PNG?raw=true" alt=""></a>
            <a href=""><img src="https://github.com/carlosavilae/Netflix-Clone/blob/master/img/t3.PNG?raw=true" alt=""></a>
            <a href=""><img src="https://github.com/carlosavilae/Netflix-Clone/blob/master/img/t4.PNG?raw=true" alt=""></a>
            <a href=""><img src="https://github.com/carlosavilae/Netflix-Clone/blob/master/img/t5.PNG?raw=true" alt=""></a>
            <a href=""><img src="https://github.com/carlosavilae/Netflix-Clone/blob/master/img/t6.PNG?raw=true" alt=""></a>
        </div>

        <h1 id="tvShows">TV Shows</h1>
        <div class="box">
            <a href=""><img src="https://github.com/carlosavilae/Netflix-Clone/blob/master/img/tv1.PNG?raw=true" alt=""></a>
            <a href=""><img src="https://github.com/carlosavilae/Netflix-Clone/blob/master/img/tv2.PNG?raw=true" alt=""></a>
            <a href=""><img src="https://github.com/carlosavilae/Netflix-Clone/blob/master/img/tv3.PNG?raw=true" alt=""></a>
            <a href=""><img src="https://github.com/carlosavilae/Netflix-Clone/blob/master/img/tv4.PNG?raw=true" alt=""></a>
            <a href=""><img src="https://github.com/carlosavilae/Netflix-Clone/blob/master/img/tv5.PNG?raw=true" alt=""></a>
            <a href=""><img src="https://github.com/carlosavilae/Netflix-Clone/blob/master/img/tv6.PNG?raw=true" alt=""></a>

            <a href=""><img src="https://github.com/carlosavilae/Netflix-Clone/blob/master/img/tv7.PNG?raw=true" alt=""></a>
            <a href=""><img src="https://github.com/carlosavilae/Netflix-Clone/blob/master/img/tv8.PNG?raw=true" alt=""></a>
            <a href=""><img src="https://github.com/carlosavilae/Netflix-Clone/blob/master/img/tv9.PNG?raw=true" alt=""></a>
            <a href=""><img src="https://github.com/carlosavilae/Netflix-Clone/blob/master/img/tv10.PNG?raw=true"
                            alt=""></a>
            <a href=""><img src="https://github.com/carlosavilae/Netflix-Clone/blob/master/img/tv11.PNG?raw=true"
                            alt=""></a>
            <a href=""><img src="https://github.com/carlosavilae/Netflix-Clone/blob/master/img/tv12.PNG?raw=true"
                            alt=""></a>
        </div>

        <!--thể loại hành động và phiêu lưu-->
        <h1 id="movies">Blockbuster Action & Adventure</h1>
        <div class="box">
            <a href=""><img src="https://github.com/carlosavilae/Netflix-Clone/blob/master/img/m1.PNG?raw=true" alt=""></a>
            <a href=""><img src="https://github.com/carlosavilae/Netflix-Clone/blob/master/img/m2.PNG?raw=true" alt=""></a>
            <a href=""><img src="https://github.com/carlosavilae/Netflix-Clone/blob/master/img/m3.PNG?raw=true" alt=""></a>
            <a href=""><img src="https://github.com/carlosavilae/Netflix-Clone/blob/master/img/m4.PNG?raw=true" alt=""></a>
            <a href=""><img src="https://github.com/carlosavilae/Netflix-Clone/blob/master/img/m5.PNG?raw=true" alt=""></a>
            <a href=""><img src="https://github.com/carlosavilae/Netflix-Clone/blob/master/img/m6.PNG?raw=true" alt=""></a>
        </div>

        <h1 id="originals">Netflix Originals</h1>
        <div class="box">
            <a href=""><img src="https://github.com/carlosavilae/Netflix-Clone/blob/master/img/o1.PNG?raw=true" alt=""></a>
            <a href=""><img src="https://github.com/carlosavilae/Netflix-Clone/blob/master/img/o2.PNG?raw=true" alt=""></a>
            <a href=""><img src="https://github.com/carlosavilae/Netflix-Clone/blob/master/img/o3.PNG?raw=true" alt=""></a>
            <a href=""><img src="https://github.com/carlosavilae/Netflix-Clone/blob/master/img/o4.PNG?raw=true" alt=""></a>
            <a href=""><img src="https://github.com/carlosavilae/Netflix-Clone/blob/master/img/o5.PNG?raw=true" alt=""></a>
            <a href=""><img src="https://github.com/carlosavilae/Netflix-Clone/blob/master/img/o6.PNG?raw=true" alt=""></a>
        </div>

        <!-- END OF MAIN CONTAINER -->

        <!-- LINKS -->
        <section class="link">
            <div class="logos">
                <a href="#"><i class="fab fa-facebook-square fa-2x logo"></i></a>
                <a href="#"><i class="fab fa-instagram fa-2x logo"></i></a>
                <a href="#"><i class="fab fa-twitter fa-2x logo"></i></a>
                <a href="#"><i class="fab fa-youtube fa-2x logo"></i></a>
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
        </section>
        <!-- END OF LINKS -->

        <!-- FOOTER -->
        <footer>
            <p>&copy 1997-2023 Netflix, Inc.</p>
            <p>Carlos Avila &copy 2018</p>
        </footer>
    </section>
</div>
</body>
</html>