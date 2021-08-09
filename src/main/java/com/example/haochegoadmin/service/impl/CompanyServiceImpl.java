package com.example.haochegoadmin.service.impl;

import com.example.haochegoadmin.entity.Company;
import com.example.haochegoadmin.mapper.CompanyMapper;
import com.example.haochegoadmin.service.CompanyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.utils.ApiResult;
import org.springframework.stereotype.Service;

import java.io.Serializable;
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
public class CompanyServiceImpl extends ServiceImpl<CompanyMapper, Company> implements CompanyService {

    @Override
    public ApiResult post(Company entity) {
        boolean saveResult = super.save(entity);
        return ApiResult.success(saveResult);
    }

    @Override
    public boolean updateById(Company entity) {
        return super.updateById(entity);
    }

    @Override
    public List<Company> list() {
        return super.list();
    }

    @Override
    public boolean removeById(Serializable id) {
        return super.removeById(id);
    }

    @Override
    public ApiResult getAll() {
        return null;
    }

    @Override
    public ApiResult delete(Integer id) {
        return null;
    }

    @Override
    public ApiResult getOne() {
        return null;
    }

    @Override
    public ApiResult put(Company company) {
        return null;
    }
}
