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

    //declaring the header values
    var headers = {
        "Content-Type": "application/json; charset=utf-8",
        "Accept": "application/json"
    };

    getUserList();

    //method to get the Employee list
    function getUserList() {
        $.ajax({
            url: "http://localhost:8081/api/test",
            type: 'GET',
            jasonp: "callback",
            contentType: "application/json; charset=utf-8",
            headers: headers,
            dataType: "json",
            success: function (result) {
                $.each(result, function (i, user) {
                    var id = user.id;
                    var $tr = $('<tr>').append(
                        $('<td>').text(user.id),
                        $('<td>').text(user.name),
                        $('<td>').text(user.address),
                        $('<td>').text(user.telephone),
                        $('<td>').text(user.email),
                        $('<td>').innerHTML = '<button class="btn-delete" data-toggle="modal" data-target="#exampleModalLong" onclick="setUserIdDelete(' + id + ')">Delete</button>',
                        $('<td>').innerHTML = '<button class="btn-edit" data-toggle="modal" data-target="#editModalLong" onclick="setUserIdEdit(' + id + ')">Edit</button>');
                    $('.tbl-content .user_info').append($tr);
                });

            },
            error: function (errorMsg) {
                alert('Failed! ' + errorMsg);
            }
        });
    }

});

//calling the delete method
function setUserIdDelete(userId) {
    var userId = userId;
    $('#deleteConfirm').click(function () {
        deleteUser(userId);
    });
}

//calling the edit Method
function setUserIdEdit(userId) {
    var userId = userId;
    $('#confirmBtn').click(function () {
        getUser(userId);
    });
}

//method to delete an employee
function deleteUser(id) {
    $.ajax({
        url: "http://localhost:8081/api/delete/" + id,
        type: 'DELETE',
        success: function () {
            window.location.href = "http://localhost:8080"

        },
        error: function (e) {
            alert("Error" + e);
        }
    });
}

//get employee details when employee id is given
function getUser(id) {
    $.ajax({
        url: "http://localhost:8081/api/employee/" + id,
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
            getId(result);
            window.location.href = "../pages/editUser.html";
        },
        error: function (e) {
            alert("Error" + e);
        }
    });
}

//method to store the employeeId in local storage
function getId(user) {
    var id = user.id;
    localStorage.setItem('userId', id);
}