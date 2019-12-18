ajouterArticle();
chercherunarticle();

$.ajax({
    url: "http://localhost:8080/article/welcome"
}).then(function (data) {
    document.getElementById("sous-titre").innerText = data;
});



$.ajax({
    url: "http://localhost:8080/article/articlelist"
}).then(function (data) {
    liste = data;
    chargertab();
});



function chargertab() {
    liste.forEach(function (item) {

        let articleligne = document.createElement("ul");
        articleligne.className = "list-group list-group-horizontal";
        document.getElementById("liste").appendChild(articleligne);


        let artitre = document.createElement("li");
        artitre.className = "list-group-item col-3";
        artitre.type = "button";
        artitre.textContent = item.titre
        articleligne.appendChild(artitre);

        let articledesc = document.createElement("li");
        articledesc.className = "list-group-item col-3";
        articledesc.textContent = item.description;
        articleligne.appendChild(articledesc);
        artitre.addEventListener("click", function (event) {
            afficherCard(item);
        });
    }

    )
};

function afficherCard(item) {
    console.log(item);
    let auteur = document.getElementById("auteur");
    let ecrivain = item["auteur"];
    auteur.textContent = "Auteur : " + ecrivain;

    let titre = document.getElementById("titre");
    titre.textContent = item["titre"];

    let contenu = document.getElementById("content");
    contenu.textContent = item["contenu"];

    let contrib = document.getElementById("contributeur");
    contrib.textContent = item["contributeur"];

}
function error() {
    document.location.href = "404error.html"
    // console.log("KO");
}

let btncontrib = document.getElementById("btnaddcontrib")
let addcontrib = document.getElementById("inputcontributeur")

btncontrib.addEventListener("click", function (event) {
    let newcontrib = document.getElementById("inputcontributeur").value;
    let oldcontrib = document.getElementById("contributeur").textContent;
    let final = oldcontrib + ", " + newcontrib;
    document.getElementById("contributeur").textContent = final;//ne reste pas 
});



function ajouterArticle() {
    let add = document.getElementById("submit");
    add.addEventListener("click", function (event) {
        
        $.post("http://localhost:8080/article/ajouterarticle", {
            auteurart: document.getElementById("formGroupauteur").value,
            titreart: document.getElementById("formGrouptitre").value,
            contenuart: document.getElementById("formGroupcontenu").value,
            contribart: document.getElementById("formGroupcontributeur").value,
            descrart: document.getElementById("formGroupdescription").value

        });
        document.location.reload(true);
    });
}

function chercherunarticle() {
    document.getElementById("searchbutton").addEventListener("click", function (e) {
        
        id = document.getElementById("inputsearch").value;
        $.ajax({
            url: "http://localhost:8080/article/byid/" + id,
            success: (afficherCard),
            error: (error)
        })
    })
};












