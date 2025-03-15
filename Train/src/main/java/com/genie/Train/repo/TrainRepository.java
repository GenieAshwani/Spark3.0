package com.genie.Train.repo;

import com.genie.Train.enitity.Train;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainRepository extends JpaRepository<Train,Long> {
}
