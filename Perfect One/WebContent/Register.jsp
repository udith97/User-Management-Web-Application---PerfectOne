<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Perfect One || Register</title>

<link rel="icon" href="img/favicon.png">
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<!-- animate CSS -->
<link rel="stylesheet" href="css/animate.css">
<!-- owl carousel CSS -->
<link rel="stylesheet" href="css/owl.carousel.min.css">
<!-- themify CSS -->
<link rel="stylesheet" href="css/themify-icons.css">
<!-- flaticon CSS -->
<link rel="stylesheet" href="css/flaticon.css">
<!-- font awesome CSS -->
<link rel="stylesheet" href="css/magnific-popup.css">
<!-- swiper CSS -->
<link rel="stylesheet" href="css/swiper.min.css">
<!-- style CSS -->
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/registration.css">

<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>


</head>

<body>

	<!--::header part start::-->
	<header class="header_area">
		<div class="sub_header">
			<div class="container">
				<div class="row align-items-center">
					<div class="col-md-4 col-xl-6">
						<div id="logo">
							<a href="Home.jsp"><img src="img/logo.png" alt="" title="" /></a>
						</div>
					</div>
					<div class="col-md-8 col-xl-6">
						<div class="sub_header_social_icon float-right">
							<a href="#"><i class="flaticon-phone"></i>+94 777 123 456</a>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="main_menu">
			<div class="container">
				<div class="row">
					<div class="col-lg-12">
						<nav class="navbar navbar-expand-lg navbar-light">
							<button class="navbar-toggler" type="button"
								data-toggle="collapse" data-target="#navbarSupportedContent"
								aria-controls="navbarSupportedContent" aria-expanded="false"
								aria-label="Toggle navigation">
								<span class="navbar-toggler-icon"></span>
							</button>

							<div class="collapse navbar-collapse" id="navbarSupportedContent">
								<ul class="navbar-nav mr-auto">
									<li class="nav-item active"><a class="nav-link active"
										href="Home.jsp">Home</a></li>
									<li class="nav-item"><a href="gallery.jsp"
										class="nav-link">gallery</a></li>
									<li class="nav-item dropdown"><a
										class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
										role="button" data-toggle="dropdown" aria-haspopup="true"
										aria-expanded="false"> Pages </a>
										<div class="dropdown-menu" aria-labelledby="navbarDropdown">
											<a class="dropdown-item" href="elements.jsp">Elements</a>
										</div></li>
									<li class="nav-item"><a href="about.jsp" class="nav-link">About
											us</a></li>
									<li class="nav-item"><a href="Contact.jsp"
										class="nav-link">Contact</a></li>
								</ul>
								<div class="header_social_icon d-none d-lg-block">
									<ul>
										<li><a href="#"><i class="ti-facebook"></i></a></li>
										<li><a href="#"> <i class="ti-twitter"></i></a></li>
										<li><a href="#"><i class="ti-instagram"></i></a></li>
										<li><a href="#"><i class="ti-skype"></i></a></li>
									</ul>
								</div>
							</div>
						</nav>
						<div class="header_social_icon d-block d-lg-none">
							<ul>
								<li><a href="#"><i class="ti-facebook"></i></a></li>
								<li><a href="#"> <i class="ti-twitter"></i></a></li>
								<li><a href="#"><i class="ti-instagram"></i></a></li>
								<li><a href="#"><i class="ti-skype"></i></a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
	</header>
	<!-- Header part end-->


	<!--  
	<form name="form" action="RegisterServlet" method="post"
		onsubmit="return validate()">
		<table align="center">
			<tr>
				<td>Full Name</td>
				<td><input type="text" name="fullname" /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td>Username</td>
				<td><input type="text" name="username" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr>
				<td>Confirm Password</td>
				<td><input type="password" name="conpassword" /></td>
			</tr>
			<tr>
				<td><%=(request.getAttribute("errMessage") == null) ? "" : request.getAttribute("errMessage")%></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Register"></input><input
					type="reset" value="Reset"></input></td>
			</tr>
		</table>
	</form>
	<b>Have An Account Already? <a href="Login.jsp">log-in</a>
	</b>
	-->

<form class="form" role="form" method="POST" action="RegisterServlet" autocomplete="off" onsubmit="return validate()">
<div class="container register-form">
            <div class="form">
                <div class="note">
                    <p style="color:white;font-size:25pt;">Register</p>
                </div>

                <div class="form-content">
                    <div class="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <input type="text" class="form-control" name="fullname"  placeholder="Your Full Name" required >
                            </div>
                            <div class="form-group">
                                <input type="email" class="form-control" name="email"  placeholder="Your Email *" required>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <input type="text" class="form-control" name="username"  placeholder="Your Username *" required>
                            </div>
                            <div class="form-group">
                                <input type="password" class="form-control" name="password" id="txtPassword" placeholder="Your Password *" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 6 or more characters" required>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group">
                                <input type="password" class="form-control" name="conpassword" id="txtConfirmPassword" placeholder="Confirm Your Password *" required>
                            </div>
                            
                            <div class="form-group">
                                <%=(request.getAttribute("errMessage") == null) ? "" : request.getAttribute("errMessage")%>
                            </div>
                        </div>
                        <div class="col-md-6">
                        	<div class="form-group">
                           		<label for="Usertype">Register As</label>
								<select type="text" class="form-control" name="role" required*>
								  <option value="User">User</option>
								  <option disabled value="Admin">Admin</option>
								  <option disabled value="Editor">Editor</option>
								  <option disabled value="Finance">Finance</option>
								</select>
                            </div>
                        </div>

                    </div>
                    <button type="submit" class="btnSubmit" value="Register" onclick="return Validate()">Sign Up</button>  <button type="reset" class="btnSubmit" value="Reset">Reset</button>
                    <br><br><br>
                    <a href="Login.jsp">Already a member? Sign In</a>
                </div>
            </div>
        </div>
</form>

<script type="text/javascript">
    function Validate() {
        var password = document.getElementById("txtPassword").value;
        var confirmPassword = document.getElementById("txtConfirmPassword").value;
        if (password != confirmPassword) {
            alert("Passwords and Confirm Password do not match.");
            return false;
        }
        return true;
    }
</script>


	<footer class="copyright_part">
		<div class="container">
			<div class="row align-items-center">
				<p class="footer-text m-0 col-lg-8 col-md-12">
					Copyright &copy;
					<script>
						document.write(new Date().getFullYear());
					</script>
					All rights reserved | Perfectone.lk
				</p>
				<div
					class="col-lg-4 col-md-12 text-center text-lg-right footer-social">
					<a href="#"><i class="ti-facebook"></i></a> <a href="#"> <i
						class="ti-twitter"></i>
					</a> <a href="#"><i class="ti-instagram"></i></a> <a href="#"><i
						class="ti-skype"></i></a>
				</div>
			</div>
		</div>
	</footer>
	<!-- footer part end-->

	<!-- jquery plugins here-->
	<!-- jquery -->
	<script src="js/jquery-1.12.1.min.js"></script>
	<!-- popper js -->
	<script src="js/popper.min.js"></script>
	<!-- bootstrap js -->
	<script src="js/bootstrap.min.js"></script>
	<!-- aos js -->
	<script src="js/aos.js"></script>
	<!-- easing js -->
	<script src="js/jquery.magnific-popup.js"></script>
	<!-- swiper js -->
	<script src="js/masonry.pkgd.js"></script>
	<!-- particles js -->
	<script src="js/owl.carousel.min.js"></script>
	<!-- carousel js -->
	<script src="js/swiper.min.js"></script>
	<!-- custom js -->
	<script src="js/custom.js"></script>

</body>
</html>