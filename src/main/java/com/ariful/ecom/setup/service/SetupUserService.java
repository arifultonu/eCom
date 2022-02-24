package com.ariful.ecom.setup.service;

import com.ariful.ecom.common.model.MessageResponse;
import com.ariful.ecom.setup.entity.SetupUserEntity;

import java.util.List;

public interface SetupUserService {
    MessageResponse addUser(SetupUserEntity setupUserEntity);
    MessageResponse updateUser(SetupUserEntity setupUserEntity);
    List<SetupUserEntity> updateAllUser(List<SetupUserEntity> setupUserEntity);
    List<SetupUserEntity> getAllUserList();
    MessageResponse deleteUser(Long id);
}
