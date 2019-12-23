package ru.bscgrand.api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.bscgrand.api.Models.Master;

public interface MasterRepository extends JpaRepository<Master, Long> {
}
