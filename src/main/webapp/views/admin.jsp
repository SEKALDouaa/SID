<!DOCTYPE html>
<html>
	<head>
		<!-- font awesome cdn link  -->
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css">

		<!-- custom css file link  -->
		<link rel="stylesheet" href="/../css/profile.css">
	</head>
	<body>
		<header class="header">
   
			<section class="flex">
		 
			   <a href="home.html" class="logo">Educa.</a>
		 
			   <form action="search.html" method="post" class="search-form">
				<input type="text" name="search_box" required placeholder="Département..." maxlength="100">
				  <button type="submit" class="fas fa-search"></button>
			   </form>
		 

		
   
	  </section>
   
   </header>   
   
   <div class="side-bar">
   
	  <div id="close-btn">
		 <i class="fas fa-times"></i>
	  </div>
   
	  <div class="profile">
		 <img src="/../imgs/15_Last-Minute_Valentine_s_Day_Gifts_That_ll_Save_You_From_a_Drugstore_Stuffed_Animal-removebg-preview.png" class="image" alt="">
		 <h3 class="name">User01</h3>
		 <p class="role">status: ADMIN</p>
		 <a href="profile.html" class="btn">view profile</a>
	  </div>
   
	  <nav class="navbar">
		 <a href="home.jsp"><i class="fas fa-home"></i><span>home</span></a>
		 <a href="departements.jsp"><i class="fas fa-file"></i><span>Départements</span></a>
		 <a href="index.jsp"><i class="fas fa-right-from-bracket"></i><span>Log out</span></a>
	  </nav>
   
   </div>

  
	</body>
	<script src="/../js/profile.js"></script>
</html>