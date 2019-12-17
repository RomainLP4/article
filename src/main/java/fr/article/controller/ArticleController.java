package fr.article.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.article.model.Article;


@RestController
@RequestMapping("/article")
public class ArticleController {

	public HashMap <Integer,Article> articleMap=null;
	
	public ArticleController() {
	Article article1= new Article (0, "Robert", "La Moto pour les nuls", "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).", "Romain", "C'est quoi une moto?");
	Article article2= new Article (1, "Robert", "L'équipement", "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).", "Sophie", "Comment bien s'équipé?");
	Article article3= new Article (2, "Romain", "Le stunt", "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).", "Sophie", "Wheeling & stoppie");
	Article article4= new Article (3, "Romain", "Les nouveauté de KTM 2020", "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).", "Robert", "390 Adventurer");
	Article article5= new Article (4, "Sophie", "Le transalp ideal pour les long trajets", "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).", "Romain", "Les long trajets");
	Article article6= new Article (5, "Sophie", "Conso moyenne de vos moto", "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).", "Alfred", "200L au 100Km !!");
	Article article7= new Article (6, "Olivier", "Html et css", "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).", "Olivier", "Je me suis trompé de site");
	Article article8= new Article (7, "Olivier", "Le permis moto", "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).", "Romain", "Le Permis A2");
	Article article9= new Article (8, "Philippe", "La moto c'est rigolo", "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).", "Robert", "Blagues de motard");
	Article article10= new Article (9, "Josselin", "Après les maths la moto", "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).", "Olivier", " P = 2 × π × r");
	
	articleMap=new HashMap <Integer, Article>();
	articleMap.put(0, article1);
	articleMap.put(1, article2);
	articleMap.put(2, article3);
	articleMap.put(3, article4);
	articleMap.put(4, article5);
	articleMap.put(5, article6);
	articleMap.put(6, article7);
	articleMap.put(7, article8);
	articleMap.put(8, article9);
	articleMap.put(9, article10);
	
	}
	@RequestMapping("/welcome")
	public String welcome() {
		return "Bienvenue sur les article de RoadBook Ride !!";
		
	}
	
	@RequestMapping("/article")
	public Article getArticle() {
		return articleMap.get(0);
		
	}
	@RequestMapping("/byid/{id}")
	public ResponseEntity<Object> getArticle(@PathVariable int id) {
		if(!articleMap.containsKey(id)) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cet id n'existe pas");}
			else return ResponseEntity.ok(articleMap.get(id));		
	}
	
	@RequestMapping("/articlelist")
	public Collection<Article> getArticles(){
		
		return articleMap.values();
		
		
		
	}	
	
	public int autoid;
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/ajouterarticle")
	public HashMap<Integer, Article> ajoutArticle(
			
			@RequestParam(value = "titreart") String titreart,
			@RequestParam(value = "auteurart") String auteurart,
			@RequestParam(value = "descrart") String descrart,
			@RequestParam(value = "contenuart") String contenuart,
			@RequestParam(value = "contribart") String contribart){
		autoid=articleMap.size();
				((Map<Integer,Article>) articleMap).put(autoid, new Article (autoid,auteurart,titreart,contenuart,contribart,descrart));
				return articleMap;
			}
}
			



