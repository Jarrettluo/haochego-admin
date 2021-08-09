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
        return ApiResult.success();
    }

    @PutMapping
    public ApiResult update(@RequestBody Partner partner){
        return ApiResult.success();
    }

    @GetMapping
    public ApiResult find(){
        return ApiResult.success();
    }

    @DeleteMapping
    public ApiResult remove(@RequestParam Integer vehicleId){
        return ApiResult.success();
    }

    @GetMapping("/list/")
    public ApiResult list(@RequestParam Integer vehicleId){
        List<Partner> partnerList = partnerService.queryByCompanyId(vehicleId);
        return ApiResult.success(partnerList);
    }


}
