package com.example.haochegoadmin.controller;


import com.example.haochegoadmin.entity.Partner;
import com.example.haochegoadmin.service.PartnerService;
import com.example.utils.ApiResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Jarrett
 * @since 2021-08-04
 */
@RestController
@RequestMapping("/haochegoadmin/partner")
public class PartnerController {

    @Resource
    PartnerService partnerService;

    @PostMapping
    public ApiResult add(@RequestBody Partner partner){
        // return partnerService.s
        return ApiResult.success();
    }

    @PutMapping
    public ApiResult update(@RequestBody Partner partner){
        return partnerService.put(partner);
    }

    @GetMapping
    public ApiResult find(){
        return ApiResult.success();
    }

    @DeleteMapping
    public ApiResult removebyVehicleId(@RequestParam Integer vehicleId){
        return partnerService.deletebyVehicleId(vehicleId);
    }

    @GetMapping("/queryListbyVehicleId/")
    public ApiResult listbyVehicleId(@RequestParam Integer vehicleId){
        return partnerService.getAllbyVehicleId(vehicleId);
    }

}
