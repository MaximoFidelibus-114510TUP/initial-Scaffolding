package ar.edu.utn.frc.tup.lc.iii.Spring3HS.repositories;

import ar.edu.utn.frc.tup.lc.iii.Spring3HS.entities.DummyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DummyRepository extends JpaRepository<DummyEntity, Long> {
}
