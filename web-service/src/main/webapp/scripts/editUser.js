/*
 *
 *    (C) Copyright 2006-2007 hSenid Software International (Pvt) Limited.
 *    All Rights Reserved.
 *
 *    These materials are unpublished, proprietary, confidential source code of
 *    hSenid Software International (Pvt) Limited and constitute a TRADE SECRET
 *    of hSenid Software International (Pvt) Limited.
 *
 *    hSenid Software International (Pvt) Limited retains all title to and intellectual
 *    property rights in these materials.
 *
 *
 */

$(document).ready(function () {

    //getting the userId stored in local storage
    var userId = localStorage.getItem('userId');

    getUser(userId);

    //click event handler for update button in editUser form
    $('#update').submit(function (e) {
        e.preventDefault();
        updateUser(userId);
    });

    //getting the user data from db where userId is given
    function getUser(id) {
        $.ajax({
            url: "http://localhost:9999/api/employee/" + id,
            type: 'GET',
            jasonp: "callback",
            contentType: "application/json; charset=utf-8",
            headers: {
                "Content-Type": "application/json; charset=utf-8",
                "Accept": "application/json",
                'Access-Control-Allow-Origin': '*'
            },
            dataType: "json",
            success: function (result) {
                setData(result);
            },
            error: function (e) {
                alert("Error" + e);
            }
        });
    }

    //populating the editUser form with the data
    function setData(user) {
        var userId = user.id;
        var userName = user.name;
        var email = user.email;
        var tele = user.telephone;
        var address = user.address;

        $('#id').val(userId);
        $('#name').val(userName);
        $('#address').val(address);
        $('#email').val(email);
        $('#number').val(tele);
    }

    //update method to update the new values for the given employeeId
    function updateUser(id) {
        var formData = {
            name: $("#name").val(),
            address: $("#address").val(),
            telephone: $("#number").val(),
            email: $("#email").val()
        };

        $.ajax({
            url: "http://localhost:9999/api/update/" + id,
            type: "PUT",
            data: JSON.stringify(formData),
            contentType: "application/json; charset=utf-8",
            headers: {
                'Access-Control-Allow-Origin': '*'
            },
            dataType: 'json',
            success: function (result) {
                $('#confirmModalLong').modal('show');
                console.log(result);
            },
            error: function (e) {
                alert("Error!" + e);
                console.log("ERROR: ", e);
            }
        });

    }
});

//redirect function
function redirect() {
    window.location.href = "../index.html";
}
