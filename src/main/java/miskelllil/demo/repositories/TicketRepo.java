package miskelllil.demo.repositories;

import miskelllil.demo.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TicketRepo extends JpaRepository<Ticket,Long> {
}
