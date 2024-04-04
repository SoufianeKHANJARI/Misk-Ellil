package miskelllil.demo.repositories;

import miskelllil.demo.entities.LigneCommande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LigneCommandeRepo extends JpaRepository<LigneCommande,Long> {
}
