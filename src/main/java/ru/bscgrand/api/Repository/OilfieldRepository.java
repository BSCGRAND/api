package ru.bscgrand.api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.bscgrand.api.Models.Oilfield;

public interface OilfieldRepository extends JpaRepository<Oilfield, Long> {
}
