package com.ariful.ecom.common.service;

import com.ariful.ecom.common.model.CommonListValue;

import java.util.List;

public interface AllSelectListService {
    List<CommonListValue> getAllUserDataListRepo();
    List<CommonListValue> getAllPriorityDataListRepo();
    List<CommonListValue> getAllStatusDataListRepo();

}
