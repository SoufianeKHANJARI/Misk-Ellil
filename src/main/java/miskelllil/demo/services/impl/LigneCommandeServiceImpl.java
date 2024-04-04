package miskelllil.demo.services.impl;

import miskelllil.demo.entities.LigneCommande;
import miskelllil.demo.repositories.LigneCommandeRepo;
import miskelllil.demo.services.LigneCommandeService;

public class LigneCommandeServiceImpl implements LigneCommandeService {

    private final LigneCommandeRepo ligneCommandeRepo;

    public LigneCommandeServiceImpl(LigneCommandeRepo ligneCommandeRepo) {
        this.ligneCommandeRepo = ligneCommandeRepo;
    }

    @Override
    public LigneCommande save(LigneCommande ligneCommande) {
        return ligneCommandeRepo.save(ligneCommande);
    }

    @Override
    public String deleteById(Long id) {
        if (ligneCommandeRepo.existsById(id)) {
            ligneCommandeRepo.deleteById(id);
            return "Delete successfully";
        } else {
            return "Product not exist";
        }

    }

    @Override
    public LigneCommande updateById(Long id, LigneCommande ligneCommande) {
        if (ligneCommandeRepo.existsById(id)) {
            return ligneCommandeRepo.save(ligneCommande);
        } else {
            return null;
        }
    }
}
