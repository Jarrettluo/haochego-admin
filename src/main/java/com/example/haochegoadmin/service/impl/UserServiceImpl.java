package com.example.haochegoadmin.service.impl;

import com.example.haochegoadmin.entity.User;
import com.example.haochegoadmin.mapper.UserMapper;
import com.example.haochegoadmin.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
    public List<User> queryByCompanyId(Integer companyId) {
        return null;
    }
}
