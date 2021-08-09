package com.example.haochegoadmin.controller;


import com.example.haochegoadmin.entity.VehicleInformation;
import com.example.haochegoadmin.service.PartnerService;
import com.example.haochegoadmin.service.VehicleInformationService;
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
@RequestMapping("/haochegoadmin/vehicle-information")
public class VehicleInformationController {

    @Resource
    VehicleInformationService vehicleInformationService;

    @PostMapping
    public ApiResult add(@RequestBody VehicleInformation vehicleInformation){
        return vehicleInformationService.add(vehicleInformation);
    }

    @PutMapping
    public ApiResult update(@RequestBody VehicleInformation vehicleInformation){
        return vehicleInformationService.put(vehicleInformation);
    }

    @GetMapping
    public ApiResult find(){
        return ApiResult.success();
    }

    @DeleteMapping
    public ApiResult remove(@RequestParam Integer id){
        return vehicleInformationService.delete(id);
    }

    @GetMapping("/list/")
    public ApiResult list(@RequestParam Integer companyId){
        return vehicleInformationService.deletebyCompanyId(companyId);
    }

}
