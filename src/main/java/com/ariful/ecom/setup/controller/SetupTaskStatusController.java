package com.ariful.ecom.setup.controller;

import com.ariful.ecom.common.model.DBData;
import com.ariful.ecom.common.model.MessageResponse;
import com.ariful.ecom.setup.entity.SetupTaskStatusEntity;
import com.ariful.ecom.setup.service.SetupTaskStatusService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
@CrossOrigin(origins = DBData.CROSS_ORIGIN)
@Slf4j
public class SetupTaskStatusController {

    @Autowired
    private SetupTaskStatusService setupTaskStatusService;

    //Done - param- {"":""}
    //Save a TaskStatus
    @PostMapping("/addTaskStatus")
    public MessageResponse addPriority(@RequestBody SetupTaskStatusEntity setupTaskStatusEntity) {
        return setupTaskStatusService.addTaskStatus(setupTaskStatusEntity);
    }

    //Done- param-
    //get All TaskStatus //Done
    @GetMapping("/getAllTaskStatus")
    public List<SetupTaskStatusEntity> findAllTaskStatus() {
        return setupTaskStatusService.getAllTaskStatusList();
    }

    //Done param-RequestBody- {"":""}
    //Update TaskStatus
    @PutMapping("/updateTaskStatus")
    public MessageResponse updateTaskStatus(@RequestBody SetupTaskStatusEntity setupTaskStatusEntity) {
        return setupTaskStatusService.updateTaskStatus(setupTaskStatusEntity);
    }

    //Done param-RequestBody- {"":""}
    //Update TaskStatus
    @PutMapping("/updateAllTaskStatus")
    public List<SetupTaskStatusEntity> updateAllTaskStatus(@RequestBody List<SetupTaskStatusEntity> setupTaskStatusEntity) {
        return setupTaskStatusService.updateAllTaskStatus(setupTaskStatusEntity);
    }

    //Done -
    //Delete Task Status  By Task Status ID
    @DeleteMapping("/deleteTaskStatusById/{id}")
    public MessageResponse deleteTaskStatus(@PathVariable Long id) {
        return setupTaskStatusService.deleteTaskStatus(id);
    }


}
