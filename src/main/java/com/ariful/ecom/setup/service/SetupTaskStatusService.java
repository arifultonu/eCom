package com.ariful.ecom.setup.service;

import com.ariful.ecom.common.model.MessageResponse;
import com.ariful.ecom.setup.entity.SetupTaskStatusEntity;

import java.util.List;


public interface SetupTaskStatusService {
    MessageResponse addTaskStatus(SetupTaskStatusEntity setupTaskStatusEntity);
    MessageResponse updateTaskStatus(SetupTaskStatusEntity setupTaskStatusEntity);
    List<SetupTaskStatusEntity> updateAllTaskStatus(List<SetupTaskStatusEntity> setupTaskStatusEntity);
    List<SetupTaskStatusEntity> getAllTaskStatusList();
    MessageResponse deleteTaskStatus(Long id);

}
