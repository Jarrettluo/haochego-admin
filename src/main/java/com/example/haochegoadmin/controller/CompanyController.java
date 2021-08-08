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

    @GetMapping("/list/")
    ApiResult list(){
        List<Company> companyList = companyService.list();
        return ApiResult.success(companyList);
    }

    @PostMapping
    public ApiResult add(@RequestBody Company company) {
        boolean saveState = companyService.save(company);
        return ApiResult.success(saveState);
    }

    @PutMapping
    public ApiResult update(@RequestBody Company company) {
        boolean updateState = companyService.updateById(company);
        if(updateState){
            return ApiResult.success(updateState);
        }else {
            return ApiResult.error(1202, "更新失败");
        }

    }

    @DeleteMapping
    public ApiResult remove(@RequestParam Integer id){
        boolean removeState = companyService.removeById(id);
        if(removeState){
            return ApiResult.success(removeState);
        }else {
            return ApiResult.error(1202, "删除失败");
        }
    }
}
