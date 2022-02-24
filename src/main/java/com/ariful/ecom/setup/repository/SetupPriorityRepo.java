package com.ariful.ecom.setup.repository;

import com.ariful.ecom.setup.entity.SetupPriorityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SetupPriorityRepo extends JpaRepository<SetupPriorityEntity, Long> {

}
