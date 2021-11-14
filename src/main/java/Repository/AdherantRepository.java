package Repository;

import Model.Adherant;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AdherantRepository extends JpaRepository<Adherant, Long> {
}
