$(document).ready(function () {

    $("#reg-password").on("keyup", function () {
        console.log("Handler for .keyup() called for password key");

        let password = $(this).val();
        //let token = document.getElementsByName("_csrf")[0].value;

        let payload = {password: password};

        $.ajax({
            method: "POST",
            contentType: "application/json",
            url: "/validation",
            data: JSON.stringify(payload),
            //headers: {"_csrf": token},
        }).done(function (data) {
            alert(JSON.stringify(data))
        }).fail(function (error) {
            alert(error.responseText)
        })
    });

});