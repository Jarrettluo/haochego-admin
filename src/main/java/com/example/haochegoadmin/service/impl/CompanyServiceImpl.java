package com.example.haochegoadmin.service.impl;

import com.example.haochegoadmin.entity.Company;
import com.example.haochegoadmin.mapper.CompanyMapper;
import com.example.haochegoadmin.service.CompanyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
    public boolean save(Company entity) {
        return super.save(entity);
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
}
