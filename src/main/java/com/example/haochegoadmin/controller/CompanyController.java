package com.example.haochegoadmin.controller;


import com.example.haochegoadmin.entity.Company;
import com.example.haochegoadmin.service.CompanyService;
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
@RequestMapping("/haochegoadmin/company")
public class CompanyController {

    @Resource
    CompanyService companyService;

    @GetMapping
    ApiResult list(){
        return ApiResult.success();
    }

    @PostMapping
    public ApiResult add(@RequestBody Company company) {
        return ApiResult.success();
    }

    @PutMapping
    public ApiResult update(@RequestBody Company company) {
        return ApiResult.success();
    }

    @DeleteMapping
    public ApiResult remove(@RequestParam Integer id){
        return ApiResult.success();
    }
}
