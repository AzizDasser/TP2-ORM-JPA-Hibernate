package ma.aziz.spring.springprojettp.repository;

import ma.aziz.spring.springprojettp.entité.Consultation;
import ma.aziz.spring.springprojettp.entité.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConsultationRepository extends JpaRepository<Consultation, Long> {


}
