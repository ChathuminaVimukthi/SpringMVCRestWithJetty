<!--
~
~ (C) Copyright 2006-2007 hSenid Software International (Pvt) Limited.
~ All Rights Reserved.
~
~ These materials are unpublished, proprietary, confidential source code of
~ hSenid Software International (Pvt) Limited and constitute a TRADE SECRET
~ of hSenid Software International (Pvt) Limited.
~
~ hSenid Software International (Pvt) Limited retains all title to and intellectual
~ property rights in these materials.
~
~
-->

<html>
<head>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <link rel="stylesheet" type="text/css" href="styles/loginForm.css">
    <link rel="stylesheet" type="text/css" href="styles/table.css">
    <link rel="stylesheet" type="text/css" href="styles/navigationBar.css">
    <script type="text/javascript" src="scripts/table.js"></script>
    <script type="text/javascript" src="scripts/listUsers.js"></script>
</head>
<body>
<ul>
    <li><a class="active" href="#home">Home</a></li>
    <li><a href="pages/userLogin.jsp">Create</a></li>
</ul>

<section>
    <!--for demo wrap-->
    <h1>List of Employees</h1>
    <div class="tbl-header">
        <table cellpadding="0" cellspacing="0" border="0">
            <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Address</th>
                <th>Tel</th>
                <th>Email</th>
                <th>Edit</th>
            </tr>
            </thead>
        </table>
    </div>
    <div class="tbl-content" id="tbl-content">
        <table cellpadding="0" cellspacing="0" border="0">
            <tbody class="user_info" id="user_info">

            </tbody>
        </table>
    </div>
</section>
</body>
</html>
