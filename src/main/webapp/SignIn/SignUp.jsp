<!DOCTYPE html>
<html lang="en">
<head>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.14.0/css/all.min.css" integrity="sha512-1PKOgIY59xJ8Co8+NE6FZ+LOAZKjy+KY8iq0G4B3CyeY6wYHN3yt9PW0XpSriVlkMXe40PTKnXrLnZ9+fkDaog==" crossorigin="anonymous" />
  <link rel="stylesheet" href="style.css">
  <title>Netflix - Watch TV Shows Online, Watch Movies Online</title>
  <link rel="stylesheet" href="SignIn.css">
</head>
<body>
<header class="showcase">


  <div class="logo">
    <img src="https://i.ibb.co/r5krrdz/logo.png">
  </div>

  <div class="showcase-content">
    <div class="formm">
      <form action="/signUp" method="post">
        <!--      form đăng nhập-->
        <h1>Sign In</h1>
        <div class="info">
          <input name="name_users" class="email" type="text" placeholder="Full name">
          <input name="acc" class="email" type="text" placeholder="Email or phone number"> <br>
          <input name="pass" class="email" type="password" placeholder="Password">

        </div>
        <!--        nút đăng nhập-->
        <div class="btn">
          <button class="btn-primary" type="submit">Register</button>
          <% String error = (String) request.getAttribute("error"); %>
          <% if (error != null) { %>
          <div style="color: red;"><%= error %>
          </div>
          <% } %>
        </div>
        <div class="help">

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


