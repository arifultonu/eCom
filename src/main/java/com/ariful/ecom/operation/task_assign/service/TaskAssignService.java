package com.ariful.ecom.operation.task_assign.service;

import com.ariful.ecom.common.model.MessageResponse;
import com.ariful.ecom.operation.task_assign.entity.TaskAssignEntity;

import java.util.List;


public interface TaskAssignService {

     List<TaskAssignEntity> saveAllTaskAssign(List<TaskAssignEntity> taskAssignEntityList);
     List<TaskAssignEntity> getTaskAssignList();
     TaskAssignEntity getTaskAssignById(Long id);
     List<TaskAssignEntity> getTaskAssignByAdminUserId(String adminUserId);
     List<TaskAssignEntity> getTaskAssignByAssignUserId(String assignUserId);
     MessageResponse saveTaskAssign(TaskAssignEntity taskAssignEntity);
     MessageResponse deleteTaskAssign(Long id);
     MessageResponse updateTaskAssign(TaskAssignEntity taskAssignEntity);
     TaskAssignEntity updateTaskAssign2(TaskAssignEntity taskAssignEntity);

}


