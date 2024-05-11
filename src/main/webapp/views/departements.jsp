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
		 
			   <form action="search.html" method="post" id="search-form" class="search-form">
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
		 <a href="/../index.jsp"><i class="fas fa-right-from-bracket"></i><span>Log out</span></a>
	  </nav>
   
   </div>

   <!--Documents section start here-->
   <section class="courses">

	<h1 class="heading">Départements</h1>
 
	<div class="box-container">
 
	   <div class="box">
		  <div class="tutor">
			 <img src="/../imgs/Aura Background.jpg" alt="">
			 <div class="info">
				<h3>john deo</h3>
				<span>21-10-2022</span>
			 </div>
		  </div>
		  <div class="thumb">
			 <img src="/../imgs/How to Take Notes with the Cornell Note System.jpg" alt="">
			 <span>20 docs</span>
		  </div>
		  <h3 class="title">Département ressources humaines</h3>
		  <a href="documents.jsp" class="inline-btn">Voir</a>
	   </div>
 
	   <div class="box">
		  <div class="tutor">
			 <img src="/../imgs/Aura Background.jpg" alt="">
			 <div class="info">
				<h3>john deo</h3>
				<span>21-10-2022</span>
			 </div>
		  </div>
		  <div class="thumb">
			 <img src="/../imgs/How to Take Notes with the Cornell Note System.jpg" alt="">
			 <span>10 docs</span>
		  </div>
		  <h3 class="title">Département finance et comptabilité</h3>
		  <a href="documents.jsp" class="inline-btn">Voir</a>
	   </div>
 
	   <div class="box">
		  <div class="tutor">
			 <img src="/../imgs/Aura Background.jpg" alt="">
			 <div class="info">
				<h3>john deo</h3>
				<span>21-10-2022</span>
			 </div>
		  </div>
		  <div class="thumb">
			 <img src="imgs/How to Take Notes with the Cornell Note System.jpg" alt="">
			 <span>3 docs</span>
		  </div>
		  <h3 class="title">Département Services Client</h3>
		  <a href="documents.jsp" class="inline-btn">Voir</a>
	   </div>
 
	   <div class="box">
		  <div class="tutor">
			 <img src="/../imgs/Aura Background.jpg" alt="">
			 <div class="info">
				<h3>john deo</h3>
				<span>21-10-2022</span>
			 </div>
		  </div>
		  <div class="thumb">
			 <img src="/../imgs/How to Take Notes with the Cornell Note System.jpg" alt="">
			 <span>1 doc</span>
		  </div>
		  <h3 class="title">Département vente et marketing</h3>
		  <a href="documents.jsp" class="inline-btn">Voir</a>
	   </div>
 
	   <div class="box">
		  <div class="tutor">
			 <img src="/../imgs/Aura Background.jpg" alt="">
			 <div class="info">
				<h3>john deo</h3>
				<span>21-10-2022</span>
			 </div>
		  </div>
		  <div class="thumb">
			 <img src="/../imgs/How to Take Notes with the Cornell Note System.jpg" alt="">
			 <span>5 docs</span>
		  </div>
		  <h3 class="title">Département Technologie de l'information</h3>
		  <a href="documents.jsp" class="inline-btn">Voir</a>
	   </div>
 
	   <div class="box">
		  <div class="tutor">
			 <img src="/../imgs/Aura Background.jpg" alt="">
			 <div class="info">
				<h3>john deo</h3>
				<span>21-10-2022</span>
			 </div>
		  </div>
		  <div class="thumb">
			 <img src="/../imgs/How to Take Notes with the Cornell Note System.jpg" alt="">
			 <span>10 docs</span>
		  </div>
		  <h3 class="title">Département opérations/productions</h3>
		  <a href="/../documents.jsp" class="inline-btn">Voir</a>
	   </div>
 
	   
	</div>
 
 </section>
 <!--Docuùent section ends here-->
	</body>
	<script src="/../js/profile.js"></script>
	<script>
		document.getElementById('search-form').addEventListener('input', function(event) {
			var searchTerm = this.querySelector('input[name="search_box"]').value.trim().toLowerCase();
			var departments = document.querySelectorAll('.box h3.title'); // Sélectionner tous les titres de département
			departments.forEach(function(department) {
				var departmentName = department.innerText.toLowerCase();
				var box = department.parentElement; // Récupérer le parent du titre (le div.box)
				if (departmentName.includes(searchTerm)) {
					box.style.display = 'block'; // Afficher le département si le terme de recherche est présent
				} else {
					box.style.display = 'none'; // Masquer le département sinon
				}
			});
		});
	</script>
</html>