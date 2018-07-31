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

    var headers = {
        "Content-Type": "application/json; charset=utf-8",
        "Accept": "application/json"
    };

    getUserList();

    function getUserList() {
        $.ajax({
            url: "http://localhost:9999/api/test",
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
                        $('<td>').innerHTML = '<button class="btn-delete" onclick="deleteUser(' + id + ')">Delete</button>',
                        $('<td>').innerHTML = '<button class="btn-edit" onclick="getUser(' + id + ')">Edit</button>');
                    $('.tbl-content .user_info').append($tr);
                });

            },
            error: function (errorMsg) {
                alert('Failed! ' + errorMsg);
            }
        });
    }

});

function deleteUser(id) {
    $.ajax({
        url: "http://localhost:9999/api/delete/" + id,
        type: 'DELETE',
        success: function () {
            window.location.href = "http://localhost:8080"

        },
        error: function (e) {
            alert("Error" + e);
        }
    });
}

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
            getId(result);
            window.location.href = "http://localhost:8080/pages/editUser.jsp";
        },
        error: function (e) {
            alert("Error" + e);
        }
    });
}

function getId(user) {
    var id = user.id;
    localStorage.setItem('userId', id);
}