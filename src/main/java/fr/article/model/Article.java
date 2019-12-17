package fr.article.model;

public class Article {

	private int id;
	private String auteur;
	private String titre;
	private String contenu;
	private String contributeur;
	private String description;
	
	public Article() {
	
	}
	
	public Article(int id, String auteur, String titre, String contenu, String contributeur, String description) {

		this.id = id;
		this.auteur = auteur;
		this.titre = titre;
		this.contenu = contenu;
		this.contributeur = contributeur;
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	public void setContributeur(String contributeur) {
		this.contributeur = contributeur;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTitre() {
		return titre;
	}
	public String getContenu() {
		return contenu;
	}
	public String getContributeur() {
		return contributeur;
	}
	public String getDescription() {
		return description;
	}
	
}
