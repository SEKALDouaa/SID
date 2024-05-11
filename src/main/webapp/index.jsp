<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/header.css">
        <link rel="stylesheet" href="css/loginStyle.css">
    </head>
    <body>
        <header class="header">
            <div class="header-1">
                <div class="title">
                <img class="logoIcon" src="icons/book-opened-svgrepo-com.svg">
                <a href="#" class="logo">E-Book</a>
                </div>
                <form action="register" class="search-form">
                    <input type="search" name="" placeholder="search here..." id="search-box">
                    <label for="search-box"><img class="search" src="icons/search.svg"></label>
                </form>

                <div class="icons">
                    <div id="search-btn"><img class="icon" src="icons/search.svg"></div>
                    <a href="#"><img class="icon" src="icons/heart-svgrepo-com.svg"></a>
                    <a href="#"><img class="icon" src="icons/shopping-cart-svgrepo-com.svg"></a>
                    <a href="#"><img class="icon" src="icons/profile-round-1342-svgrepo-com.svg"></a>
                </div>
            </div>
            
            <div class="header-2">
                <nav class="navbar">
                    <a href="#home">Home</a>
                    <a href="#featured">Featured</a>
                    <a href="#arrivals">Arrivals</a>
                    <a href="#reviews">Reviews</a>
                    <a href="#contact">Contact</a>
                    <a href="#archive">Archive</a>
                </nav>
            </div>
            
        </header>
        <c:if test="${not empty sessionScope.success}">
	        <p style="color:green;">${sessionScope.success}</p>
	        <c:remove var="success" scope="session"/>
	    </c:if>
	    <c:if test="${not empty sessionScope.failed}">
	        <p style="color:red;">${sessionScope.failed}</p>
	        <c:remove var="failed" scope="session"/>
	    </c:if>
        <div class="container" id="container">
            <div class="form-container sign-up-container">
                <form action="register.do" method="post">
                    <h1>Create Account</h1>
                    
                    <div class="social-container">
                        <a href="#" class="social">
                            <img class="social-icon" src="icons/facebook-svgrepo-com.svg">
                        </a>
                        <a href="#" class="social">
                            <img class="social-icon" src="icons/instagram-svgrepo-com.svg">
                            </a>
                        <a href="#" class="social">
                            <img class="social-icon" src="icons/linkedin-161-svgrepo-com.svg">
                        </a>
                    </div>
                    <span>or use your email for registration</span>
                    <input type="text" placeholder="Name" required="required" name="name" />
                    <input type="email" placeholder="Email" required="required" name="emailu"/>
                    <input type="password" placeholder="Password" required="required" name="pwdu" />
                    <button type="submit" class="BtnForm">Sign Up</button>
                </form>
            </div>
            <div class="form-container sign-in-container">
                <form action="login.do" method="post">
                    <h1>Sign in</h1>
                    <c:if test="${not empty sessionScope.error}">
				        <p style="color:red;">${sessionScope.error}</p>
				        <c:remove var="error" scope="session"/>
				    </c:if>
                    <div class="social-container">
                        <a href="#" class="social">
                            <img class="social-icon" src="icons/facebook-svgrepo-com.svg">
                        </a>
                        <a href="#" class="social">
                            <img class="social-icon" src="icons/instagram-svgrepo-com.svg">
                            </a>
                        <a href="#" class="social">
                            <img class="social-icon" src="icons/linkedin-161-svgrepo-com.svg">
                        </a>
                    </div>
                    <span>or use your account</span>
                    <input type="email" placeholder="Email" required="required" name="email"/>
                    <input type="password" placeholder="Password" required="required" name="pwd"/>
                    <label>Forgot your password? Click <span><a href="" class="pwdF">here</a></span></label>
                    <button type="submit" class="BtnForm">Sign In</button>
                </form>
            </div>
            <div class="overlay-container">
                <div class="overlay">
                    <div class="overlay-panel overlay-left">
                        <h1>Welcome Back!</h1>
                        <p>To keep connected with us please login with your personal info</p>
                        <button class="ghost" id="signIn">Sign In</button>
                    </div>
                    <div class="overlay-panel overlay-right">
                        <h1>Hello, Friend!</h1>
                        <p>Enter your personal details and start journey with us</p>
                        <button class="ghost" id="signUp">Sign Up</button>
                    </div>
                </div>
            </div>
        </div>
        
        <nav class="bottom-navbar">
            <a href="#home"><img class="iconHome" src="icons/home-svgrepo-com.svg"></a>
            <a href="#featured"><img class="icon" src="icons/list-ul-alt-svgrepo-com.svg"></a>
            <a href="#arrivals"><img class="icon" src="icons/tags-svgrepo-com.svg"></a>
            <a href="#reviews"><img class="icon" src="icons/comments-svgrepo-com.svg"></a>
            <a href="#contact"><img class="icon" src="icons/message-communication-contact-svgrepo-com.svg"></a>
            <a href="#archive"><img class="icon" src="icons/archive-svgrepo-com.svg"></a>
        </nav>
	</body>
	<script src="js/header.js"></script>
    <script src="js/LoginJS.js"></script>
    
</html>

   