package fr.isika.cdi9.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.isika.cdi9.spring.dao.IDossierDao;
import fr.isika.cdi9.spring.model.Dossier;

@Service("dossierService")
public class DossierService implements IDossierService {

	@Autowired
	private IDossierDao dossierDao;

	@Override
	public void ajouterDossier(Dossier dossierAjouter) {

		boolean isPresent = dossierDao.existsByNumeroDossier(dossierAjouter.getNumeroDossier());

		if (isPresent) {
			System.out.println("Dossier déjà enregistrée...");
		} else {
			dossierDao.save(dossierAjouter);
		}

	}

	@Override
	public void listerDossier() {
		// TODO Auto-generated method stub
		for (Dossier doss : dossierDao.findAll()) {
			System.out.println(doss.getNumeroDossier() + " " + doss.getResponsable());
		}

	}

	@Override
	public Dossier recupererDossierParNum(String numDossier) {
		return dossierDao.findByNumeroDossier(numDossier);
	}

}
