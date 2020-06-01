<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	 <%@page import="com.mvc.dao.IUserService"%>
<%@page import="com.mvc.dao.UserServiceImpl"%>
<%@page import="com.mvc.bean.User"%>
<%@page import="com.mvc.controller.GetIdUserServlet"%>
<%@page import="com.mvc.controller.UpdateUserServlet"%>
<%@page import="java.util.ArrayList" %>


<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %> 
<!DOCTYPE html>
<html>
<head>
<title>Perfect One || Home</title>
</head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Perfect One || Home</title>
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

<body>
	<div style="text-align: right">
	Welcome
	<%=request.getAttribute("userName")%>
	</div>

	<!--::header part start::-->
	<header class="header_area">
		<div class="sub_header">
			<div class="container">
				<div class="row align-items-center">
					<div class="col-md-4 col-xl-6">
						<div id="logo">
							<a href="Home.jsp"><img src="img/logo.jpg"></a>

						</div>
					</div>
					<div class="col-md-8 col-xl-6">
						<div class="sub_header_social_icon float-right">
							<a href="#"><i class="flaticon-phone"></i>+94 777 123 456</a>
						</div>
						<div style="text-align: right">
							<a href="<%=request.getContextPath()%>/LogoutServlet">Logout</a>
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
										href="index.jsp">Home</a></li>
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

	<!-- banner part start-->
	<section class="banner_part">
		<div class="container">
			<div class="row align-content-center">
				<div class="col-lg-7 col-xl-5">
					<div class="banner_text">
						<h1>
							<span>Let Us</span><br> Make you Relax!
						</h1>

						<a href="#" class="btn_1">learn more <span
							class="ti-angle-right"></span>
						</a>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- banner part start-->

	<!-- about part start-->
	<section class="about_part">
		<div class="container-fluid">
			<div class="row align-items-center">
				<div class="col-md-6 offset-xl-1 col-xl-4">
					<div class="about_img">
						<img src="img/about.png" alt="">
					</div>
				</div>
				<div class="col-md-6 col-xl-4">
					<div class="about_text">
						<h4>About us</h4>
						<h2>
							Welcome <br> to Perfect One
						</h2>
						<p>Perfect One is one of leading companies in Event Management
							& Promotion field in Sri Lanka. The path of the company is to
							assure the success of the customers who are willing to take the
							service from us. The dedication, motivation, & the vast
							experience in the field will ensure the guarantee of the success
							of the projects that we are handling. Innovativeness,
							Creativeness,Smartness lead us to delight our customers forever.</p>
						<a href="#" class="btn_2">read more</a>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- about part start-->




	<!-- player info part start-->
	<section class="player_info section_padding">
		<div class="container">
			<div class="row">
				<div class="player_info_item owl owl-carousel">
					<div class="player_info_iner">
						<div class="row align-items-center">
							<div class="col-md-6 col-xl-5">
								<div class="player_info_img">
									<img src="img/player_info.png" alt="">
								</div>
							</div>
							<div class="col-md-6 offset-xl-1 col-xl-5">
								<div class="player_info_text">
									<h3>Customer Reviews</h3>
									<p>I have worked with Perfect One since early 2012 and they
										have handled a variety of our activations, events and
										promotions. I have found them to be extremely reliable and
										efficient. The two co founders of the organization take a
										personal interest in every activity they undertake which is
										very crucial for me as this ensures quality of delivery in a
										timely manner. I have seen the growth they received over the
										years and I wish them all the best.</p>

								</div>
							</div>
						</div>
					</div>
					<div class="player_info_iner">
						<div class="row align-items-center">
							<div class="col-md-6 col-xl-5">
								<div class="player_info_img">
									<img src="img/player_info1.png" alt="">
								</div>
							</div>
							<div class="col-md-6 offset-xl-1 col-xl-5">
								<div class="player_info_text">
									<h3>Customer Reviews</h3>
									<p>I have worked with Perfect One since early 2012 and they
										have handled a variety of our activations, events and
										promotions. I have found them to be extremely reliable and
										efficient. The two co founders of the organization take a
										personal interest in every activity they undertake which is
										very crucial for me as this ensures quality of delivery in a
										timely manner. I have seen the growth they received over the
										years and I wish them all the best.</p>

								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- about part start-->

	<!-- gallery_part part start-->
	<section class="gallery_part">
		<div class="container-fluid">
			<div class="row justify-content-center">
				<div class="col-xl-5">
					<div class="section_tittle text-center">
						<h4>Our Gallery</h4>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-xl-12">
					<div class="gallery_part_item">
						<div class="grid">
							<div class="grid-sizer"></div>
							<a href="img/gallery/gallery_item_1.png"
								class="grid-item grid-item--height1 bg_img img-gal"
								style="background-image: url('img/gallery/gallery_item_1.png')">
								<div class="single_gallery_item">
									<div class="single_gallery_item_iner">
										<div class="gallery_item_text">
											<h3>Face is had place image</h3>
											<p>Swords Club vs Uknights Club</p>
										</div>
									</div>
								</div>
							</a> <a href="img/gallery/gallery_item_2.png"
								class="grid-item grid-item--height2 bg_img img-gal"
								style="background-image: url('img/gallery/gallery_item_2.png')">
								<div class="single_gallery_item">
									<div class="single_gallery_item_iner">
										<div class="gallery_item_text">
											<h3>Face is had place image</h3>
											<p>Swords Club vs Uknights Club</p>
										</div>
									</div>
								</div>
							</a> <a href="img/gallery/gallery_item_3.png"
								class="grid-item grid-item--width2 grid-item--height2 bg_img img-gal"
								style="background-image: url('img/gallery/gallery_item_3.png')">
								<div class="single_gallery_item">
									<div class="single_gallery_item_iner">
										<div class="gallery_item_text">
											<h3>Face is had place image</h3>
											<p>Swords Club vs Uknights Club</p>
										</div>
									</div>
								</div>
							</a> <a href="img/gallery/gallery_item_4.png"
								class="grid-item grid-item--height3 bg_img img-gal"
								style="background-image: url('img/gallery/gallery_item_4.png')">
								<div class="single_gallery_item">
									<div class="single_gallery_item_iner">
										<div class="gallery_item_text">
											<h3>Face is had place image</h3>
											<p>Swords Club vs Uknights Club</p>
										</div>
									</div>
								</div>
							</a> <a href="img/gallery/gallery_item_5.png"
								class="grid-item grid-item--height3 bg_img img-gal"
								style="background-image: url('img/gallery/gallery_item_5.png')">
								<div class="single_gallery_item">
									<div class="single_gallery_item_iner">
										<div class="gallery_item_text">
											<h3>Face is had place image</h3>
											<p>Swords Club vs Uknights Club</p>
										</div>
									</div>
								</div>
							</a> <a href="img/gallery/gallery_item_6.png"
								class="grid-item grid-item--width2 grid-item--height2 bg_img img-gal"
								style="background-image: url('img/gallery/gallery_item_6.png')">
								<div class="single_gallery_item">
									<div class="single_gallery_item_iner">
										<div class="gallery_item_text">
											<h3>Face is had place image</h3>
											<p>Swords Club vs Uknights Club</p>
										</div>
									</div>
								</div>
							</a> <a href="img/gallery/gallery_item_7.png"
								class="grid-item grid-item--height2 bg_img img-gal"
								style="background-image: url('img/gallery/gallery_item_7.png')">
								<div class="single_gallery_item">
									<div class="single_gallery_item_iner">
										<div class="gallery_item_text">
											<h3>Face is had place image</h3>
											<p>Swords Club vs Uknights Club</p>
										</div>
									</div>
								</div>
							</a> <a href="img/gallery/gallery_item_8.png"
								class="grid-item grid-item--height1 bg_img img-gal"
								style="background-image: url('img/gallery/gallery_item_8.png')">
								<div class="single_gallery_item">
									<div class="single_gallery_item_iner">
										<div class="gallery_item_text">
											<h3>Face is had place image</h3>
											<p>Swords Club vs Uknights Club</p>
										</div>
									</div>
								</div>
							</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- gallery_part part end-->

	<!-- social_connect_part part start-->
	<section class="social_connect_part">
		<div class="container-fluid">
			<div class="row justify-content-center ">
				<div class="col-xl-5">
					<div class="section_tittle text-center">
						<h4>Social Media</h4>
						<h2>Follow Us Instagram</h2>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-xl-12">
					<div class="social_connect">
						<div class="single-social_connect">
							<div class="social_connect_img">
								<img src="img/insta/instagram_1.png" class="" alt="blog">
								<div class="social_connect_overlay">
									<a href="#"><span class="ti-instagram"></span></a>
								</div>
							</div>
						</div>
						<div class="single-social_connect">
							<div class="social_connect_img">
								<img src="img/insta/instagram_2.png" class="" alt="blog">
								<div class="social_connect_overlay">
									<a href="#"><span class="ti-instagram"></span></a>
								</div>
							</div>
						</div>
						<div class="single-social_connect">
							<div class="social_connect_img">
								<img src="img/insta/instagram_3.png" class="" alt="blog">
								<div class="social_connect_overlay">
									<a href="#"><span class="ti-instagram"></span></a>
								</div>
							</div>
						</div>
						<div class="single-social_connect">
							<div class="social_connect_img">
								<img src="img/insta/instagram_4.png" class="" alt="blog">
								<div class="social_connect_overlay">
									<a href="#"><span class="ti-instagram"></span></a>
								</div>
							</div>
						</div>
						<div class="single-social_connect">
							<div class="social_connect_img">
								<img src="img/insta/instagram_5.png" class="" alt="blog">
								<div class="social_connect_overlay">
									<a href="#"><span class="ti-instagram"></span></a>
								</div>
							</div>
						</div>
						<div class="single-social_connect">
							<div class="social_connect_img">
								<img src="img/insta/instagram_6.png" class="" alt="blog">
								<div class="social_connect_overlay">
									<a href="#"><span class="ti-instagram"></span></a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- social_connect_part part end-->
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
								onblur="this.placeholder = 'Your Email Address '" type="email">
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
	<script src="js/swiper.min.js"></script>
	<!-- swiper js -->
	<script src="js/masonry.pkgd.js"></script>
	<!-- particles js -->
	<script src="js/owl.carousel.min.js"></script>
	<!-- carousel js -->
	<script src="js/swiper.min.js"></script>
	<!-- swiper js -->
	<script src="js/swiper_custom.js"></script>
	<!-- custom js -->
	<script src="js/custom.js"></script>
</body>
</html>