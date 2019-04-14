$(function() {
// when login tab is clicked
    $('#login-form-link').click(function(e) {
		$("#login-form").delay(100).fadeIn(100);
 		$("#register-form").fadeOut(100);
		$('#register-form-link').removeClass('active');
		$(this).addClass('active');
		e.preventDefault();
	});
// when register tab is clicked   
	$('#register-form-link').click(function(e) {
		$("#register-form").delay(100).fadeIn(100);
 		$("#login-form").fadeOut(100);
		$('#login-form-link').removeClass('active');
		$(this).addClass('active');
		e.preventDefault();
	});
	
//when user enters the credential and clicks login	
	$("login-submit").click(function(e){
		var userName = $("#username").val();
		var password = $("#password").val();

		var credObj = {
			"userName" : userName,
			"password" : password
		}

		var credentials = JSON.stringify(credObj);
		ajaxObj = {
			type : "POST",
			url : "/login",
			data : credentials,
			contentType : "application/json",

			error : function(jqXHR, textStatus, errorThrown){
				console.log(jqXHR.responseText);
				alert("login failed")
			},
			
			success : function(data){
				var role = data.role;
				if (role == 'admin'){
					window.location.replace("admin.html"); //if the user is the admin
				} else {
					window.location.replace("users.html"); //if the user is a normal user 
				}
			},

			complete : function(XMLHttpRequest){

			},

			dataType : "json"
		};

		return $.ajax(ajaxObj);
	});
	
	//when user clicks on register
	
});

