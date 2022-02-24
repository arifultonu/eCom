package com.ariful.ecom.common.controller;


import com.ariful.ecom.common.model.DBData;
import com.ariful.ecom.common.service.AllSelectListService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RestController
@RequestMapping("/todo")
@CrossOrigin(origins = DBData.CROSS_ORIGIN)
@Slf4j
public class CommonController {

//    @GetMapping("/hello")
//    public Collection<String> sayHello() {
//        return IntStream.range(0, 10)
//                .mapToObj(i -> "Hello number " + i)
//                .collect(Collectors.toList());
//    }

@Autowired
    AllSelectListService allSelectListService;

    @GetMapping("/getAllUserSelectDataList")
    public Map<String, Object> userListDataList() {
        Map<String, Object> map = new HashMap<>();
        map.put("allUserDataList", allSelectListService.getAllUserDataListRepo());
        return map;
    }

    @GetMapping("/getAllPrioritySelectDataList")
    public Map<String, Object> priorityDataList() {
        Map<String, Object> map = new HashMap<>();
        map.put("allPriorityDataList", allSelectListService.getAllPriorityDataListRepo());
        return map;
    }

    @GetMapping("/getAllStatusSelectDataList")
    public Map<String, Object> statusDataList() {
        Map<String, Object> map = new HashMap<>();
        map.put("allStatusDataList", allSelectListService.getAllStatusDataListRepo());
        return map;
    }

}
