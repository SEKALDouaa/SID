const signUpButton = document.getElementById('signUp');
const signInButton = document.getElementById('signIn');
const container = document.getElementById('container');

signUpButton.addEventListener('click', () => {
	container.classList.add("right-panel-active");
});

signInButton.addEventListener('click', () => {
	container.classList.remove("right-panel-active");
});

document.getElementById("loginForm").addEventListener("submit", function(event) {
    event.preventDefault();

    var email = document.getElementById("email").value;
    var password = document.getElementById("password").value;

    var xhr = new XMLHttpRequest();
    xhr.open("PUT", "/LoginServlet", true); // Assurez-vous que l'URL correspond à celle de votre servlet
    xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");

    xhr.onreadystatechange = function() {
        if (xhr.readyState === XMLHttpRequest.DONE) {
            if (xhr.status === 200) {
                var response = JSON.parse(xhr.responseText);
                if (response === "success") {
                    window.location.href = "/home.jsp"; // Rediriger vers la page home si la connexion réussit
                } else {
                    document.getElementById("error").innerText = response; // Afficher le message d'erreur si la connexion échoue
                }
            } else {
                console.error("Une erreur s'est produite lors de la connexion.");
            }
        }
    };

    xhr.send("email=" + email + "&pwd=" + password);
});



