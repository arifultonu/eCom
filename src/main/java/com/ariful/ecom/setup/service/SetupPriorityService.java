package com.ariful.ecom.setup.service;

import com.ariful.ecom.common.model.MessageResponse;
import com.ariful.ecom.setup.entity.SetupPriorityEntity;

import java.util.List;

public interface SetupPriorityService {

    MessageResponse addPriority(SetupPriorityEntity setupPriorityEntity);
    MessageResponse updatePriority(SetupPriorityEntity setupPriorityEntity);
    List<SetupPriorityEntity> updateAllPriority(List<SetupPriorityEntity> setupPriorityEntity);
    List<SetupPriorityEntity> getAllPriorityList();
    MessageResponse deletePriority(Long id);
}
