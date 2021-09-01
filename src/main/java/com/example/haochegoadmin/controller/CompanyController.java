package com.example.haochegoadmin.controller;


import com.example.haochegoadmin.entity.Company;
import com.example.haochegoadmin.service.CompanyService;
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
@RequestMapping("/haochegoadmin/company")
public class CompanyController {

    @Resource
    CompanyService companyService;

    @CrossOrigin
    @GetMapping("/list/")
    ApiResult list(){
        return companyService.getAll();
    }

    @CrossOrigin
    @PostMapping
    public ApiResult add(@RequestBody Company company) {
        return companyService.post(company);
    }

    @CrossOrigin
    @PutMapping
    public ApiResult update(@RequestBody Company company) {
        return companyService.put(company);
    }

    @CrossOrigin
    @DeleteMapping
    public ApiResult remove(@RequestParam Integer id){
        return companyService.delete(id);
    }
}
