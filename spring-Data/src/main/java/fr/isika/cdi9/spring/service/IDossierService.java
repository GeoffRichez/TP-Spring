package fr.isika.cdi9.spring.service;

import fr.isika.cdi9.spring.model.Dossier;

public interface IDossierService {
// on lui donne un nom à ce service (c'est un composant)
//la couche service c'est la couche businness celle qui va être intermédiaire en l'inteface graphique et la couche dao
//on va faire ici le traitement du résultat de la bd avant de la transmettre a la vue

	public void ajouterDossier(Dossier dossierAjouter);

	public void listerDossier();

	public Dossier recupererDossierParNum(String numDossier);

}
