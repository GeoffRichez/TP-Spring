package fr.isika.cdi9.spring.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.isika.cdi9.spring.model.Dossier;

@Repository
public interface IDossierDao extends CrudRepository<Dossier, Long> {

//les methodes crud classique sont déjà implementés

	Dossier findByNumeroDossier(String numDossier);
	// pas besoin de l'implémenter, on doit juste declarer notre methode créé

	boolean existsByNumeroDossier(String numeroDossier);

}
