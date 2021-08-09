package com.example.haochegoadmin.controller;


import com.example.haochegoadmin.entity.User;
import com.example.haochegoadmin.service.PartnerService;
import com.example.haochegoadmin.service.UserService;
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
@RequestMapping("/haochegoadmin/user")
public class UserController {

    @Resource
    UserService userService;

    @PostMapping
    public ApiResult add(@RequestBody User user){
        return userService.add(user);
    }

    @PutMapping
    public ApiResult update(@RequestBody User user){
        return userService.put(user);
    }

    @GetMapping
    public ApiResult find(){
        return ApiResult.success();
    }

    @DeleteMapping
    public ApiResult remove(@RequestParam Integer id){
        return userService.delete(id);
    }

    @GetMapping("/list/")
    public ApiResult list(@RequestParam Integer companyId){
        return userService.getAllbyCompanyId(companyId);
    }

}
