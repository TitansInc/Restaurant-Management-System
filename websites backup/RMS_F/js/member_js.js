// RMS Defined Functions
function setPlaceholders(formId) {
    $("#" + formId + " input").each(function() {
        p = $(this).parent().parent().find("td").text();
        $(this).attr("placeholder", p);
    });
}
function isNumber(textBox, seperator) {
    var txt = textBox.val().replace(seperator, "");
    var res = !isNaN(Math.floor(txt)) && txt.indexOf(".") == -1;
    if (res == false) {
        textBox.after("<span id=\"invalidDatatypeError\">" + textBox.parent().parent().find("td").text() + " must be a number</span>");

        $("span#invalidDatatypeError").fadeTo(1000, "0.9").animate({top: "-500px"}, 1500);
        setTimeout(function() {
            $("span#invalidDatatypeError").fadeTo(500, "0.0", function() {
                $("span").remove();
            });
        }, 1000);
    }
    return res;
}


function validToSubmit(formId) {
    var tort = true;
    if ($("[name=\"email\"]").val().indexOf("@") != -1 && $("[name=\"email\"]").val().indexOf(".") != -1) {
        if ($("[name=\"dob\"]").val().length >= 8) {
            tort = filledForm(formId) && isNumber($("[name=\"cardnumber\"]"), "~") && isNumber($("[name=\"mobile\"]"), "~") && isNumber($("[name=\"home\"]"), "-") && isNumber($("[name=\"pincode\"]"), "~") && isNumber($("[name=\"dob\"]"), "-") && ($("[name=\"password_confirm\"]").val() == $("[name=\"password\"]").val());
        } else {
            $("[name=\"dob\"]").val("yyyyMMdd");
            tort = false;
        }
    } else {
        $("[name=\"email\"]").val("userid@example.com");
        tort = false;
    }
    return tort;
}


function filledForm(formId) {
    var notEmpty = true;
    $("#" + formId).find("input[maxlength]").each(function() {
        if ($(this).val().length == 0) {
            notEmpty = false;
            $(this).after("<span id=\"unfilledError\" hidden>" + $(this).parent().parent().find("td").text() + " can't be empty</span>");
        }

    });
    $("span").fadeTo(1000, "0.9").animate({letterSpacing: "10px"}, 1000).animate({top: "-500px"}, 1500);
    setTimeout(function() {
        $("span#unfilledError").fadeTo(500, "0.0", function() {
            $("span#unfilledError").remove();
        });
    }, 1000);
    return notEmpty;
}

// Checking passwords match!
$("[name=\"password_confirm\"]").keyup(function() {
    $("#pwdmatchError").remove();
    if ($("[name=\"password_confirm\"]").val() != $("[name=\"password\"]").val()) {
        $(this).after("<span id=\"pwdmatchError\" style=\"position:absolute;\">Passwords not matching</span>")
    } else {
        $("#pwdmatchError").remove();
    }
});

//	Predict Usernames
$("[name=\"username\"]").keyup(function() {
    var uname = $("[name=\"username\"]").val();
    $.post("predictusername.php", {tosearch: uname}, function(returnedData) {
        $("#indicator").remove();
        $("[name=\"username\"]").after(returnedData);
    });


});
//style
$(document).ready(function() {
	
	
    setPlaceholders("login_form");
    setPlaceholders("registration_form");

    $("[name=dob]").attr("placeholder", "yyyyMMdd");
    //$("form").show();


});


//$("caption").click(function(){	$("form table tr").slideDown(100);});
$("input[name='login']").click(function() {
    var luser = $("input[name='login_username']").val();
    var lpwd = $("input[name='login_password']").val();
    if (luser.length != 0 && lpwd.length != 0) {

        //alert(luser+"="+lpwd);
        $.post("login.php", {lusername: luser, lpassword: lpwd}, function(status) {
            if (status == "success") {
            					var date1=new Date();
															date1.setTime(date1.getTime()-1);
            					document.cookie="Items=; expires="+date1.toGMTString();
															document.cookie="Quantities=; expires="+date1.toGMTString();
															document.cookie="Ratings=; expires="+date1.toGMTString();
															document.cookie="username=; expires="+date1.toGMTString();
                alert("sueccessfuly logged in");
                $("#plate").load("testAB.html");
            } else {
                alert("Invalid username/password!");
            }
        });
    } else {
        alert("fill first!");
    }
});

//
function hideA() {
    $("#registration_form").slideUp(1000);
    $("#login_form").slideUp(1000);
	$("#accounter").text("Login/Register");

}
$("#accounter").toggle(function(e) {
    acx = document.getElementById("accounter").offsetLeft;
    ach = parseInt($("#accounter").css("height"), 10) + 6;
    acy = document.getElementById("accounter").offsetTop;
    $("#registration_form").slideUp(1000, "linear", function() {
        $("#login_form").css("position", "absolute").css("top", acy + ach + "px").css("left", acx + "px").slideDown(1000);
		$("#accounter").text("Register Now");

    });
}, function(e) {
		

    $("#login_form").slideUp(1000, "linear", function() {
        $("#registration_form").css("position", "absolute").css({top: acy + ach + "px", left: acx + "px"}).slideDown(1000);
		$("#accounter").text("Login");
    });
}
);
/*
 $("#accounter").toggle(function(e){
 acx=document.getElementById("accounter").offsetLeft;
 ach=parseInt($("#accounter").css("height"),10)+6;
 acy=document.getElementById("accounter").offsetTop;
 $("#registration_form").slideUp(1000).animate({top:acy+"px",left:(-1*acx)+"px"},1000);
 
 $("#login_form").animate({top:acy+ach+"px",left:acx+"px"},1000).slideDown(1000);
 
 },function(e){
 //alert(acx+"-"+acy+"-"+ach);;
 $("#login_form").animate({top:acy+ach+"px",left:"-300px"},1000);
 $("#registration_form").animate({top:acy+ach+"px",left:acx+"px"},0).slideDown(1000);
 }
 );
 */