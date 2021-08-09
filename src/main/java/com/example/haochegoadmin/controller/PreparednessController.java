package com.example.haochegoadmin.controller;


import com.example.haochegoadmin.entity.Preparedness;
import com.example.haochegoadmin.service.PartnerService;
import com.example.haochegoadmin.service.PreparednessService;
import com.example.utils.ApiResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Jarrett
 * @since 2021-08-04
 */
@RestController
@RequestMapping("/haochegoadmin/preparedness")
public class PreparednessController {

    @Resource
    PreparednessService preparednessService;

    @PostMapping
    public ApiResult add(@RequestBody Preparedness preparedness){
        return ApiResult.success();
    }

    @PutMapping
    public ApiResult update(@RequestBody Preparedness preparedness){
        return preparednessService.put();
    }

    @GetMapping
    public ApiResult find(){
        return ApiResult.success();
    }

    @DeleteMapping
    public ApiResult removebyVehicleId(@RequestParam Integer id){
        return ApiResult.success();
    }

    @GetMapping("/queryListbyVehicleId/")
    public ApiResult listbyVehicleId(@RequestParam Integer vehicleId){
        return ApiResult.success();
    }

}
