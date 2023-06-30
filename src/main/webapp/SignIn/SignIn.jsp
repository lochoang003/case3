<!DOCTYPE html>
<html lang="en">
<head>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.14.0/css/all.min.css" integrity="sha512-1PKOgIY59xJ8Co8+NE6FZ+LOAZKjy+KY8iq0G4B3CyeY6wYHN3yt9PW0XpSriVlkMXe40PTKnXrLnZ9+fkDaog==" crossorigin="anonymous" />
  <link rel="stylesheet" href="/SignIn/style.css">
  <title>Netflix - Watch TV Shows Online, Watch Movies Online</title>
  <link rel="stylesheet" href="/SignIn/SignIn.css">
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

</head>
<body>
<header class="showcase">


  <div class="logo">
    <img src="https://i.ibb.co/r5krrdz/logo.png">
  </div>

  <div class="showcase-content">
    <div class="formm">
      <form action="/login" method="post">
<!--      form đăng nhập-->
        <h1>Sign In</h1>
        <div class="info">
          <input name="user" class="email" type="text" placeholder="Email or phone number"> <br>
          <input name="pass" class="email" type="password" placeholder="Password">
        </div>
<!--        nút đăng nhập-->
        <div class="btn">
          <button class="btn-primary" type="submit">Sign In</button>
        </div>
          <% String error = (String) request.getAttribute("err"); %>
          <% if (error != null) { %>
          <div style="color: red;"><%= error %>
          </div>
          <% } %>
        <div class="help">
          <div>
            <input value="true" type="checkbox"><label>Remember me</label>
          </div>

          <a href="https://www.netflix.com/dz-en/LoginHelp">Need Help ?</a>

        </div>

      </form>

    </div>

<!--    <div class="fcbk">-->
<!--      <a href="https://facebook.com">-->
<!--        <img src="https://i.ibb.co/LrVMXNR/social-fb.png" alt="Facebook">-->
<!--      </a>-->
<!--      <p>Login with Facebook</p>-->
<!--    </div>-->
<!--    đăng ký-->
    <div class="signup">
      <p>New to Netflix ?</p>
      <a href="/signUp">Sign up now</a>
    </div>
    <div class="more">
      <p>
        This page is protected by Google reCAPTCHA to ensure you're not a bot. <a href="#">Learn more.</a>
      </p>
    </div>


  </div>


  <footer>

    <div class="ftr-content">
      <div class="contact">
        <a href="#">Quesions? Contact us.</a>
      </div>
      <div class="ftr">
        <a href="#">Gift Card Terms</a>
        <a href="#">Terms of Use</a>
        <a href="#">Privacy Statement</a>
      </div>
      <div class="select">
        <select>
          <option>English</option>
          <option>日本語</option>
          <option>Français</option>

        </select>
      </div>
    </div>

  </footer>

</header>


</body>
</html>


