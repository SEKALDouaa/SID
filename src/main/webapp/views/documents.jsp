<!DOCTYPE html>
<html>
	<head>
		<!-- font awesome cdn link  -->
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css">

		<!-- custom css file link  -->
		<link rel="stylesheet" href="css/profile.css">
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
		 <img src="imgs/15_Last-Minute_Valentine_s_Day_Gifts_That_ll_Save_You_From_a_Drugstore_Stuffed_Animal-removebg-preview.png" class="image" alt="">
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

  <!--all documents start here-->

  <section class="playlist-videos">

    <h1 class="heading">playlist videos</h1>
 
    <div class="box-container">
 
       <a class="box" href="watch-video.html">
          <img src="imgs/How to Take Notes with the Cornell Note System.jpg" alt="">
          <h3>Doc01(version1)</h3>
       </a>
 
       <a class="box" href="watch-video.html">
          <img src="imgs/How to Take Notes with the Cornell Note System.jpg" alt="">
          <h3>Doc01(version2)</h3>
       </a>
 
       <a class="box" href="watch-video.html">
          <img src="imgs/How to Take Notes with the Cornell Note System.jpg" alt="">
          <h3>Doc02(version1)</h3>
       </a>
 
       <a class="box" href="watch-video.html">
          <img src="imgs/How to Take Notes with the Cornell Note System.jpg" alt="">
          <h3>Doc03(version1)</h3>
       </a>
 
       <a class="box" href="watch-video.html">
          <img src="imgs/How to Take Notes with the Cornell Note System.jpg" alt="">
          <h3>Doc01(version3)</h3>
       </a>
 
       <a class="box" href="watch-video.html">
          <img src="imgs/How to Take Notes with the Cornell Note System.jpg" alt="">
          <h3>Doc03(version2)</h3>
       </a>
 
    </div>
 
 </section>

  <!--all documents end here-->

	</body>
	<script src="js/profile.js"></script>
</html>