package miskelllil.demo.repositories;


import miskelllil.demo.entities.Mesa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MesaRepo extends JpaRepository<Mesa,Long> {





}
