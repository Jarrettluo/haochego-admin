package com.example.haochegoadmin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.haochegoadmin.entity.Partner;
import com.example.haochegoadmin.entity.Preparedness;
import com.example.haochegoadmin.entity.User;
import com.example.haochegoadmin.mapper.UserMapper;
import com.example.haochegoadmin.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.utils.ApiResult;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Jarrett
 * @since 2021-08-04
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public ApiResult add(User user) {
        boolean addState = super.save(user);
        if(addState){
            return ApiResult.success("保存成功！");
        }else {
            return ApiResult.error(1202, "保存失败！");
        }
    }

    @Override
    public ApiResult getAll() {
        return ApiResult.success(super.list());
    }

    @Override
    public ApiResult getAllbyCompanyId(Integer companyId) {
        List<User> userList = super.list(new QueryWrapper<User>().eq("company_id", companyId));
        return ApiResult.success(userList);
    }

    @Override
    public ApiResult delete(Integer id) {
        boolean removeState = super.removeById(id);
        if(removeState){
            return ApiResult.success("true");
        }else {
            return ApiResult.error(1202, "删除失败");
        }
    }

    @Override
    public ApiResult deletebyCompanyId(Integer companyId) {
        boolean removeState = super.removeById(new QueryWrapper<Preparedness>().eq("company_id", companyId));
        if(removeState){
            return ApiResult.success("true");
        }else {
            return ApiResult.error(1202, "删除失败");
        }
    }

    @Override
    public ApiResult getOne() {
        return null;
    }

    @Override
    public ApiResult put(User user) {
        boolean updateState = super.saveOrUpdate(user);
        if(updateState){
            return ApiResult.success("true");
        }else {
            return ApiResult.error(1202, "保存失败");
        }
    }
}
