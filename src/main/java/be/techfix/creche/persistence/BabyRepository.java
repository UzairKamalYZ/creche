package be.techfix.creche.persistence;

import java.util.UUID;

import be.techfix.creche.model.Baby;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BabyRepository extends JpaRepository<Baby, UUID> {
}
