# Projet Springboot API rest

* Auteur du projet: Gallard Romain

* Contexte: Parcours Développeur web et mobile / Simplon

* Date: 18/12/19

* Version: 1.0

* Etat du projet: Terminé

___


# Description non technique du projet 

Cette appli va nous permettre de voir les articles référencé, les consultés, et faire une recherche par **id** de ces derniers.
L'utilisateur peut aussi ajouter un contributeur à un article ainsi que de  créer et ajouter un article.

____
# Overview
![Overview](https://github.com/RomainLP4/article/blob/master/src/main/resources/static/image/Diagramme.png)

____
# Endpoints

**/article**

Permet d'acceder à tout les endpoints suivants liés aux articles il sera donc requis dans l' url de la requête avant d'acceder aux autres.

**/article/welcome**

Affiche le message d'acceuil.

**/article/byid/{id}**

Recherche d'article par leur **id**
Prend un Integer en paramètre qui correspond à l'id de l'article recherché.

**/article/articlelist**

Affiche la totalité des article sur la page.

**/article/ajouterarticle**

Permet d'ajouter un article à l'application.

____

### Exemple de requête ###

 `http://localhost:8080/article/byid/5`

 Cette requête recherche l'article avec l'id 5.

### Exemple de réponse ###


```{

id: 0,
auteur: "Robert",
titre: "La Moto pour les nuls",
contenu: "It'sless normal distribution of letters, as opposed to us ...",
contributeur: "Romain",
description: "C'est quoi une moto?"
}
```

___

# Imprime écran de la page d'acceuil

![Ecran_d'acceuil](https://github.com/RomainLP4/article/blob/master/src/main/resources/static/image/screen1.png)

## Ajouter un article
![Ajouter_un_article](https://github.com/RomainLP4/article/blob/master/src/main/resources/static/image/screen1.png)




