package com.ariful.ecom.setup.controller;

import com.ariful.ecom.common.model.DBData;
import com.ariful.ecom.common.model.MessageResponse;
import com.ariful.ecom.setup.entity.SetupPriorityEntity;
import com.ariful.ecom.setup.service.SetupPriorityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
@CrossOrigin(origins = DBData.CROSS_ORIGIN)
@Slf4j
public class SetupPriorityController {

    @Autowired
    private SetupPriorityService setupPriorityService;

    //Done - param- {"":""}
    //Save a Priority
    @PostMapping("/addPriority")
    public MessageResponse addPriority(@RequestBody SetupPriorityEntity setupPriorityEntity) {
       return setupPriorityService.addPriority(setupPriorityEntity);
    }

    //Done- param-
    //get All Priority //Done
    @GetMapping("/getAllPriority")
    public List<SetupPriorityEntity> findAllPriority() {
        return setupPriorityService.getAllPriorityList();
    }

    //Done param-RequestBody- {"":""}
    //Update Priority
    @PutMapping("/updatePriority")
    public MessageResponse updatePriority(@RequestBody SetupPriorityEntity setupPriorityEntity) {
        return setupPriorityService.updatePriority(setupPriorityEntity);
    }

    //Done -
    //Delete Priority  By Priority ID
    @DeleteMapping("/deletePriorityById/{id}")
    public MessageResponse deletePriority(@PathVariable Long id)    {
        return setupPriorityService.deletePriority(id);
    }

    //Done - param- [{"":""},{"":""}]
    //update All Priority As an array - multiple rows
    @PutMapping("/updateAllPriority")
    public List<SetupPriorityEntity> updateAllPriority(@RequestBody List<SetupPriorityEntity> setupPriorityEntity) {
        return setupPriorityService.updateAllPriority(setupPriorityEntity);
    }



}
