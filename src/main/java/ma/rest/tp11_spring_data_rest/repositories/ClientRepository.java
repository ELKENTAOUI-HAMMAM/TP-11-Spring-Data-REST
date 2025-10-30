package ma.rest.tp11_spring_data_rest.repositories;

import ma.rest.tp11_spring_data_rest.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
