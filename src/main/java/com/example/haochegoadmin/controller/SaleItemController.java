package com.example.haochegoadmin.controller;


import com.example.haochegoadmin.service.PartnerService;
import com.example.haochegoadmin.service.SaleItemService;
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
@RequestMapping("/haochegoadmin/sale-item")
public class SaleItemController {

    @Resource
    SaleItemService saleItemService;

    @PostMapping
    public ApiResult add(){
        return ApiResult.success();
    }

    @PutMapping
    public ApiResult update(){
        return ApiResult.success();
    }

    @GetMapping
    public ApiResult find(){
        return ApiResult.success();
    }

    @DeleteMapping
    public ApiResult remove(){
        return ApiResult.success();
    }

    @GetMapping("/list/")
    public ApiResult list(){
        return ApiResult.success();
    }

}
