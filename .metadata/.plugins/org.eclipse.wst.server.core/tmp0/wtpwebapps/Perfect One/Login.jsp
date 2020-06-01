<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Perfect One || Login</title>

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

<form class="form" role="form" method="POST" action="LoginServlet" autocomplete="off" >
	<div class="container register-form">
            <div class="form">
                <div class="note">
                    <p style="color:white;font-size:25pt;">Login</p>
                </div>

                <div class="form-content">
                    <div class="row">
                        <div class="col-md-6">
                            <div class="form-group">
                                <input type="text" class="form-control" name="username" placeholder="Your User Name *" required>
                            </div>
                            <div class="form-group">
                                <input type="password" class="form-control" name="password"  placeholder="Your Password *" required>
                            </div>
                            <div>
                            	<span style="color: red"><%=(request.getAttribute("errMessage") == null) ? "" : request.getAttribute("errMessage")%></span>
                            </div>
                        </div>
                        
                    </div>
                    <button type="submit" class="btnSubmit" value="Login">Sign In</button>  <button type="reset" class="btnSubmit" value="Reset">Reset</button>
                    <br><br><br>
                    <a href="Register.jsp">Not a member? Sign Up</a>
                </div>
            </div>
        </div>

<!--		
	<form name="form" action="LoginServlet" method="post" onsubmit="return validate()">
		
		<table align="center">
			<tr>
				<td>Username</td>
				<td><input type="text" name="username" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr>
				
				<td><span style="color: red"><%=(request.getAttribute("errMessage") == null) ? "" : request.getAttribute("errMessage")%></span></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Login"></input>
				<input type="reset" value="Reset"></input></td>
			</tr>
		</table>
	</form>
	</form>
-->	
	
	<footer class="copyright_part">
		<div class="container">
			<div class="row align-items-center">
				<p class="footer-text m-0 col-lg-8 col-md-12">
					Copyright &copy;
					<script>
						document.write(new Date().getFullYear());
					</script>
					All rights reserved | Perfectone.lk</a>
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