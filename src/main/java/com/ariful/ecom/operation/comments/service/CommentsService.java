package com.ariful.ecom.operation.comments.service;

import com.ariful.ecom.common.model.MessageResponse;
import com.ariful.ecom.operation.comments.entity.CommentsEntity;

import java.util.List;


public interface CommentsService {
    MessageResponse addComment(CommentsEntity commentsEntity);
    List<CommentsEntity> getCommentsByTaskId(String taskId);
    List<CommentsEntity> deleteCommentByTaskId(String taskId);
}
