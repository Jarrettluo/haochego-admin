package com.example.haochegoadmin.service.impl;

import com.example.haochegoadmin.entity.Company;
import com.example.haochegoadmin.entity.Partner;
import com.example.haochegoadmin.entity.Preparedness;
import com.example.haochegoadmin.entity.SaleItem;
import com.example.haochegoadmin.mapper.CompanyMapper;
import com.example.haochegoadmin.mapper.PartnerMapper;
import com.example.haochegoadmin.mapper.UserMapper;
import com.example.haochegoadmin.mapper.VehicleInformationMapper;
import com.example.haochegoadmin.service.CompanyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.utils.ApiResult;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    UserMapper userMapper;

    @Autowired
    PartnerMapper partnerMapper;

    @Autowired
    Preparedness preparedness;

    @Autowired
    SaleItem saleItem;

    @Autowired
    VehicleInformationMapper vehicleInformationMapper;

    @Override
    public ApiResult post(Company company) {
        return null;
    }

    @Override
    public ApiResult getAll() {
        return ApiResult.success(super.list());
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
