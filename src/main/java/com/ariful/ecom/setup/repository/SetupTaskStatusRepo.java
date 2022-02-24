package com.ariful.ecom.setup.repository;

import com.ariful.ecom.setup.entity.SetupTaskStatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SetupTaskStatusRepo extends JpaRepository<SetupTaskStatusEntity, Long> {

}
