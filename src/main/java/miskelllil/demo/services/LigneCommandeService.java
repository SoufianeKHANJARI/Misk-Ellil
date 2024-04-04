package miskelllil.demo.services;


import io.swagger.v3.oas.annotations.servers.Server;
import miskelllil.demo.entities.LigneCommande;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LigneCommandeService {

    LigneCommande save(LigneCommande ligneCommande);
    String deleteById(Long id);
    LigneCommande updateById(Long id,LigneCommande ligneCommande);


}
