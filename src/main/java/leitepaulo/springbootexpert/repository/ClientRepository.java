package leitepaulo.springbootexpert.repository;

import leitepaulo.springbootexpert.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}