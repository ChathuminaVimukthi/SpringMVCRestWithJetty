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

    var userId = localStorage.getItem('userId');

    getUser(userId);

    $('.buttonUp').click(function (e) {
        e.preventDefault();
        phoneNumberValidation();
    });

    function getUser(id) {
        $.ajax({
            url: "http://localhost:9999/api/employee/" + id,
            type: 'GET',
            jasonp: "callback",
            contentType: "application/json; charset=utf-8",
            headers: {
                "Content-Type": "application/json; charset=utf-8",
                "Accept": "application/json"
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
            dataType: 'json',
            success: function (result) {
                alert("Update Successful");
                console.log(result);
            },
            error: function (e) {
                alert("Error!" + e);
                console.log("ERROR: ", e);
            }
        });

    }

    function phoneNumberValidation() {
        var number = $('#number').val();
        if (number.length !== 10) {
            alert('Phone number must be 10 digits.');
            $('#number').val('');
        } else {
            updateUser(userId);
        }
    }

    function resetData() {
        $("#name").val("");
        $("#address").val("");
        $("#number").val("");
        $("#email").val("");
    }

});

