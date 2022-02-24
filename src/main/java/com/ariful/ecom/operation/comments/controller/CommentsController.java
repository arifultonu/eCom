package com.ariful.ecom.operation.comments.controller;

import com.ariful.ecom.ResourceNotFoundException;
import com.ariful.ecom.common.model.DBData;
import com.ariful.ecom.common.model.MessageResponse;
import com.ariful.ecom.operation.comments.entity.CommentsEntity;
import com.ariful.ecom.operation.comments.service.CommentsService;
import com.ariful.ecom.operation.task_assign.entity.TaskAssignEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
@CrossOrigin(origins = DBData.CROSS_ORIGIN)
@Slf4j
public class CommentsController {

    @Autowired
    CommentsService commentsService;

    //Save a Comments
    @PostMapping("/addComment")
    public MessageResponse addComment(@RequestBody CommentsEntity commentsEntity) {
        return commentsService.addComment(commentsEntity);
    }

    //Done- param-taskId
    //Get All Task By Task Id
    @GetMapping("/getAllCommentsByTaskId/{taskId}")
    public List<CommentsEntity> findAllCommentsByTaskId(@PathVariable String taskId) throws ResourceNotFoundException {
        return commentsService.getCommentsByTaskId(taskId);
    }



    //Done - param -id/serial- 20
    //Delete Comment By Task ID
    @DeleteMapping("/deleteCommentByTaskId/{taskId}")
    public List<CommentsEntity> deleteComment(@PathVariable String taskId) {
        return commentsService.deleteCommentByTaskId(taskId);
    }



}
