package com.ariful.ecom.operation.comments.service;

import com.ariful.ecom.common.model.MessageResponse;
import com.ariful.ecom.operation.comments.entity.CommentsEntity;
import com.ariful.ecom.operation.comments.repository.CommentsRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CommentsServiceImpl implements CommentsService {

    @Autowired
    CommentsRepo commentsRepo;

    @Override
    public MessageResponse addComment(CommentsEntity commentsEntity) {
        MessageResponse messageResponse = new MessageResponse();
        log.info("Assign User Id: "+commentsEntity.getAssignUserId());
        commentsRepo.save(commentsEntity);
        messageResponse.setResponseCode("1");
        messageResponse.setResponseMessage("Add Comment Successfully!");
        return messageResponse;
    }

    @Override
    public List<CommentsEntity> getCommentsByTaskId(String taskId) {
        return commentsRepo.findByTaskIdOrderByDateAsc(taskId);
    }

    @Override
    public List<CommentsEntity> deleteCommentByTaskId(String taskId) {
//        return commentsRepo.deleteCommentByTaskId(taskId);
        return commentsRepo.deleteCommentByTaskId(taskId);
    }
}
