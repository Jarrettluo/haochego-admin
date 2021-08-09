package com.example.haochegoadmin.service.impl;

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

    public List<User> queryByCompanyId(Integer companyId) {
        return null;
    }

    @Override
    public ApiResult getAll() {
        return null;
    }

    @Override
    public ApiResult getAllbyCompanyId(Integer companyId) {
        return null;
    }

    @Override
    public ApiResult delete(Integer id) {
        return null;
    }

    @Override
    public ApiResult deletebyCompanyId(Integer companyId) {
        return null;
    }

    @Override
    public ApiResult getOne() {
        return null;
    }

    @Override
    public ApiResult put() {
        return null;
    }
}
