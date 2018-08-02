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

    //click event handler method on submit button in createUser form
    $('#register').submit(function (e) {
        e.preventDefault();
        createUser();
    });

    $('.cancel').click(function (e) {
        e.preventDefault();
        window.location.href = "../index.html"
    });

    //ajax method to create a user in db using the details passed from the createUser form
    function createUser() {
        var usrl
        var formData = {
            name: $("#name").val(),
            address: $("#address").val(),
            telephone: $("#number").val(),
            email: $("#email").val()
        };

        $.ajax({
            type: "POST",
            url: "http://localhost:8081/api/create",
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

        resetData();

    }

    //method to reset data after the form submitted
    function resetData() {
        $("#name").val("");
        $("#address").val("");
        $("#number").val("");
        $("#email").val("");
    }
});

//validate the input for phone number to be a numeric value
function isNumber(evt) {
    evt = (evt) ? evt : window.event;
    var charCode = (evt.which) ? evt.which : evt.keyCode;
    if (charCode > 31 && (charCode < 48 || charCode > 57)) {
        return false;
    }
    return true;
}
