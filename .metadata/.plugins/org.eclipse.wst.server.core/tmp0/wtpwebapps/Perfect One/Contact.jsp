<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Perfect One || Contact</title>
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
							<%
								if (session.getAttribute("nic") == null) {
							%>
							<a href="register.jsp" class="register_icon"><i
								class="ti-arrow-right"></i>REGISTER</a>
							<%
								} else {
							%>
							<a href="editCustomer.jsp">My Account <%
								}
							%>
							</a>

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
									<li class="nav-item"><a href="contact.jsp"
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

	<!-- ================  breadcrumb part start ================  -->
	<section class="breadcrumb breadcrumb_bg">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="breadcrumb_iner">
						<div class="breadcrumb_iner_item">
							<h1>Contact us</h1>
							<p>
								Home<span>/</span>Cantact Us
							</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- ================ breadcrumb part start ================ -->

	<!-- ================ contact section start ================= -->
	<section class="contact-section section_padding">
		<div class="container">
			<div class="d-none d-sm-block mb-5 pb-4">
				<div id="map" style="height: 480px;"></div>
				<script>
					function initMap() {
						var uluru = {
							lat : -25.363,
							lng : 131.044
						};
						var grayStyles = [ {
							featureType : "all",
							stylers : [ {
								saturation : -90
							}, {
								lightness : 50
							} ]
						}, {
							elementType : 'labels.text.fill',
							stylers : [ {
								color : '#ccdee9'
							} ]
						} ];
						var map = new google.maps.Map(document
								.getElementById('map'), {
							center : {
								lat : -31.197,
								lng : 150.744
							},
							zoom : 9,
							styles : grayStyles,
							scrollwheel : false
						});
					}
				</script>
				<iframe
					src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d1833.3678674938092!2d79.92421079856658!3d6.974613953216648!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x219df08c56bd5754!2sPerfect%20One%20(Pvt)%20Ltd.!5e0!3m2!1sen!2slk!4v1583572865525!5m2!1sen!2slk"
					width="600" height="450" frameborder="0" style="border: 0;"
					allowfullscreen=""></iframe>
			</div>


			<div class="row">
				<div class="col-12">
					<h2 class="contact-title">Get in Touch</h2>
				</div>
				<div class="col-lg-8">
					<form class="form-contact contact_form"
						action="contact_process.php" method="post" id="contactForm"
						novalidate="novalidate">
						<div class="row">
							<div class="col-12">
								<div class="form-group">

									<textarea class="form-control w-100" name="message"
										id="message" cols="30" rows="9"
										onfocus="this.placeholder = ''"
										onblur="this.placeholder = 'Enter Message'"
										placeholder='Enter Message'></textarea>
								</div>
							</div>
							<div class="col-sm-6">
								<div class="form-group">
									<input class="form-control" name="name" id="name" type="text"
										onfocus="this.placeholder = ''"
										onblur="this.placeholder = 'Enter your name'"
										placeholder='Enter your name'>
								</div>
							</div>
							<div class="col-sm-6">
								<div class="form-group">
									<input class="form-control" name="email" id="email"
										type="email" onfocus="this.placeholder = ''"
										onblur="this.placeholder = 'Enter email address'"
										placeholder='Enter email address'>
								</div>
							</div>
							<div class="col-12">
								<div class="form-group">
									<input class="form-control" name="subject" id="subject"
										type="text" onfocus="this.placeholder = ''"
										onblur="this.placeholder = 'Enter Subject'"
										placeholder='Enter Subject'>
								</div>
							</div>
						</div>
						<div class="form-group mt-3">
							<button type="submit" class="button button-contactForm">Send
								Message</button>
						</div>
					</form>
				</div>
				<div class="col-lg-4">
					<div class="media contact-info">
						<span class="contact-info__icon"><i class="ti-home"></i></span>
						<div class="media-body">
							<h3>#283/5 Flower Terrace</h3>
							<p>Kiribathgoda</p>
						</div>
					</div>
					<div class="media contact-info">
						<span class="contact-info__icon"><i class="ti-tablet"></i></span>
						<div class="media-body">
							<h3>+94 76 531 1313</h3>
							<p>Mon to Sun 9am to 6pm</p>
						</div>
					</div>
					<div class="media contact-info">
						<span class="contact-info__icon"><i class="ti-email"></i></span>
						<div class="media-body">
							<h3>info@perfectone.lk</h3>
							<p>Send us your query anytime!</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- ================ contact section end ================= -->

	<!-- footer part start-->
	<section class="footer-area section_padding">
		<div class="container">
			<div class="row">
				<div class="col-xl-4 col-sm-8 mb-4 mb-xl-0 single-footer-widget">
					<h4>Newsletter</h4>
					<p>You can trust us. we only send promo offers,</p>
					<div class="form-wrap" id="mc_embed_signup">
						<form target="_blank"
							action="https://spondonit.us12.list-manage.com/subscribe/post?u=1462626880ade1ac87bd9c93a&amp;id=92a4423d01"
							method="get" class="form-inline">
							<input class="form-control" name="EMAIL"
								placeholder="Your Email Address" onfocus="this.placeholder = ''"
								onblur="this.placeholder = 'Your Email Address '" required=""
								type="email">
							<button class="click-btn btn btn-default text-uppercase">subscribe</button>
							<div style="position: absolute; left: -5000px;">
								<input name="b_36c4fd991d266f23781ded980_aefe40901a"
									tabindex="-1" value="" type="text">
							</div>

							<div class="info"></div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</section>
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
	<!-- particles js -->
	<script src="js/contact.js"></script>
	<!-- ajaxchimp js -->
	<script src="js/jquery.ajaxchimp.min.js"></script>
	<!-- validate js -->
	<script src="js/jquery.validate.min.js"></script>
	<!-- form js -->
	<script src="js/jquery.form.js"></script>
	<!-- easing js -->
	<script src="js/jquery.magnific-popup.js"></script>
	<!-- swiper js -->
	<script src="js/swiper.min.js"></script>
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