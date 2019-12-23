package ru.bscgrand.api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.bscgrand.api.Models.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
