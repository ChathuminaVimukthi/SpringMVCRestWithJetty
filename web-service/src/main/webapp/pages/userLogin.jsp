<%--
  ~
  ~    (C) Copyright 2006-2007 hSenid Software International (Pvt) Limited.
  ~    All Rights Reserved.
  ~
  ~    These materials are unpublished, proprietary, confidential source code of
  ~    hSenid Software International (Pvt) Limited and constitute a TRADE SECRET
  ~    of hSenid Software International (Pvt) Limited.
  ~
  ~    hSenid Software International (Pvt) Limited retains all title to and intellectual
  ~    property rights in these materials.
  ~
  ~
  --%>

<html>
<head>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <link rel="stylesheet" type="text/css" href="../styles/loginForm.css">
    <script type="text/javascript" src="../scripts/addUser.js"></script>
    <script type="text/javascript" src="../scripts/listUsers.js"></script>
</head>
<body>
<h2>Hello User!</h2>

<div class="login-page">
    <div class="form">
        <form class="register-form" id="register">
            <input type="text" placeholder="name" id="name"/>
            <input type="text" placeholder="address" id="address"/>
            <input type="text" placeholder="email address" id="email"/>
            <input type="text" placeholder="tel" id="number">
            <button>create</button>
            <p class="message">Already registered? <a href="#">Sign In</a></p>
        </form>
        <form class="login-form">
            <input type="text" placeholder="username"/>
            <input type="password" placeholder="password"/>
            <button>login</button>
            <p class="message">Not registered? <a href="#">Create an account</a></p>
        </form>
    </div>
</div>

</body>
</html>