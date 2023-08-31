package ma.aziz.spring.springprojettp.repository;

import ma.aziz.spring.springprojettp.entité.Patient;
import ma.aziz.spring.springprojettp.entité.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RendezVousRepository extends JpaRepository<RendezVous, Long> {


}
