package com.ariful.ecom.setup.service;

import com.ariful.ecom.common.model.MessageResponse;
import com.ariful.ecom.setup.entity.SetupPriorityEntity;
import com.ariful.ecom.setup.repository.SetupPriorityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SetupPriorityServiceImpl implements SetupPriorityService{

    @Autowired
    SetupPriorityRepo setupPriorityRepo;


    @Override
    public MessageResponse addPriority(SetupPriorityEntity setupPriorityEntity) {
        MessageResponse messageResponse = new MessageResponse();
        setupPriorityRepo.save(setupPriorityEntity);
        messageResponse.setResponseCode("1");
        messageResponse.setResponseMessage("Add New Priority Successfully!");
        return messageResponse;
    }

    @Override
    public MessageResponse updatePriority(SetupPriorityEntity setupPriorityEntity) {
        MessageResponse messageResponse = new MessageResponse();
        SetupPriorityEntity existingPriority = setupPriorityRepo.findById(setupPriorityEntity.getPriorityId()).orElse(null);
        existingPriority.setPriorityName(setupPriorityEntity.getPriorityName());
        setupPriorityRepo.save(existingPriority);
        messageResponse.setResponseCode("1");
        messageResponse.setResponseMessage("Update Priority Successfully!");
        return messageResponse;
    }

    @Override
    public List<SetupPriorityEntity> updateAllPriority(List<SetupPriorityEntity> setupPriorityEntity) {
        return setupPriorityRepo.saveAll(setupPriorityEntity);
    }

    @Override
    public List<SetupPriorityEntity> getAllPriorityList() {
        return setupPriorityRepo.findAll();
    }

    @Override
    public MessageResponse deletePriority(Long id) {
        MessageResponse messageResponse = new MessageResponse();
        setupPriorityRepo.deleteById(id);
        messageResponse.setResponseCode("1");
        messageResponse.setResponseMessage("Delete Task Priority Successfully!");
        return messageResponse;
    }
}
