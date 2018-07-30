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

$( document ).ready(function() {

    var headers = {
        "Content-Type": "application/json; charset=utf-8",
        "Accept" : "application/json"
    };

    $('.button').click(function () {
       f();
    });

    function f() {
        $.ajax({
            url: "http://localhost:9999/api/test",
            type: 'GET',
            contentType: "application/json; charset=utf-8",
            headers: headers,
            dataType: "json",
            success: function(data) {
                alert("Success: " + JSON.stringify(data));
            },
            error: function(jqxhr, status, errorMsg) {
                alert('Failed! ' + errorMsg);
            }
        });
    }

   /* $.ajax({
        type:"POST",
        url: postUserUrl,
        data: postUserData,
        headers: headers,
        beforeSend: function(xhr){
//xhr.setRequestHeader('Access-Control-Allow-origin', 'true');
//xhr.setRequestHeader('Access-Control-Allow-Headers', 'Content-Type, Accept, X-Requested-With, Session');
//xhr.setRequestHeader('Access-Control-Request-Method', 'POST');
        },
        dataType: 'json'
    });*/

});