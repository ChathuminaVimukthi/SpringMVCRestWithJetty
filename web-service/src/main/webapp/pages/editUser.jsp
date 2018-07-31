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

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <link rel="stylesheet" type="text/css" href="../styles/loginForm.css">
    <link rel="stylesheet" type="text/css" href="../styles/navigationBar.css">
    <link rel="stylesheet" type="text/css" href="../styles/table.css">
    <script type="text/javascript" src="../scripts/addUser.js"></script>
    <script type="text/javascript" src="../scripts/editUser.js"></script>
    <script type="text/javascript" src="../scripts/listUsers.js"></script>
</head>
<body>
<ul>
    <li><a class="active" href="../index.jsp">Home</a></li>
    <li><a href="userLogin.jsp">Create</a></li>
</ul>
<h1>Edit User</h1>
<div class="login-page">
    <div class="form">
        <form class="register-form" id="register">
            <label style="float: left"><b>ID :</b></label>
            <input type="text" id="id" readonly/>
            <label style="float: left"><b>NAME :</b></label>
            <input type="text" placeholder="name" id="name"/>
            <label style="float: left"><b>ADDRESS :</b></label>
            <input type="text" placeholder="address" id="address"/>
            <label style="float: left"><b>EMAIL :</b></label>
            <input type="email" placeholder="email address" id="email"/>
            <label style="float: left"><b>TEL :</b></label>
            <input type="text" placeholder="tel" id="number" onkeypress="return isNumber(event)" required>
            <button class="buttonUp">Update</button>
        </form>
    </div>
</div>

</body>
</html>
