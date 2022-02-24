package com.ariful.ecom.setup.service;

import com.ariful.ecom.common.model.MessageResponse;
import com.ariful.ecom.setup.entity.SetupTaskStatusEntity;
import com.ariful.ecom.setup.repository.SetupTaskStatusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SetupTaskStatusServiceImpl implements SetupTaskStatusService{
    @Autowired
    SetupTaskStatusRepo setupTaskStatusRepo;


    @Override
    public MessageResponse addTaskStatus(SetupTaskStatusEntity setupTaskStatusEntity) {
        MessageResponse messageResponse = new MessageResponse();
        setupTaskStatusRepo.save(setupTaskStatusEntity);
        messageResponse.setResponseCode("1");
        messageResponse.setResponseMessage("Add New Task Status Successfully!");
        return messageResponse;
    }

    @Override
    public MessageResponse updateTaskStatus(SetupTaskStatusEntity setupTaskStatusEntity) {
        MessageResponse messageResponse = new MessageResponse();
        SetupTaskStatusEntity existingTaskStatus = setupTaskStatusRepo.findById(setupTaskStatusEntity.getTaskStatusId()).orElse(null);
        existingTaskStatus.setTaskStatusName(setupTaskStatusEntity.getTaskStatusName());
        setupTaskStatusRepo.save(existingTaskStatus);
        messageResponse.setResponseCode("1");
//        messageResponse.setResponseMessage("Update Task Status Successfully- ID: " + setupTaskStatusEntity.getTaskStatusId());
        messageResponse.setResponseMessage("Update Task Status Successfully!");
        return messageResponse;
    }

    @Override
    public List<SetupTaskStatusEntity> updateAllTaskStatus(List<SetupTaskStatusEntity> setupTaskStatusEntity) {
         return setupTaskStatusRepo.saveAll(setupTaskStatusEntity);
    }

    @Override
    public List<SetupTaskStatusEntity> getAllTaskStatusList() {
        return setupTaskStatusRepo.findAll();
    }

    @Override
    public MessageResponse deleteTaskStatus(Long id) {
        MessageResponse messageResponse = new MessageResponse();
        setupTaskStatusRepo.deleteById(id);
        messageResponse.setResponseCode("1");
        messageResponse.setResponseMessage("Delete Task Status Successfully!");
        return messageResponse;
    }
}


