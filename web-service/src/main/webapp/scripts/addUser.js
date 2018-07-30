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

    //Login form and register form
    $('.message a').click(function(){
        $('form').animate({height: "toggle", opacity: "toggle"}, "slow");
    });

    $('.register-form').submit(function (event) {
        event.preventDefault();
        createUser();
    });

    function createUser() {

        var formData = {
            name:$("#name").val(),
            address:$("#address").val(),
            tel:$("#number").val(),
            email:$("#email").val()
        };

        $.ajax({
            type : "POST",
            contentType:"application/json",
            url:"http://localhost:9999/api/create",
            //data : encodeURIComponent(JSON.stringify(formData)),
            data : encodeURI(JSON.stringify(formData)),
            //data:JSON.stringify(formData),
            dataType : 'jsonp',
            success : function(result) {
                alert("successful");
                console.log(result);
            },
            error : function(e) {
                alert("Error!"+JSON.stringify(e)+"\n\n"+encodeURIComponent(JSON.stringify(formData)));
                console.log("ERROR: ", e);
            }
        });

    }

});
