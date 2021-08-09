package com.example.haochegoadmin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.haochegoadmin.entity.*;
import com.example.haochegoadmin.mapper.*;
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
    PreparednessMapper preparednessMapper;

    @Autowired
    SaleItemMapper saleItemMapper;

    @Autowired
    VehicleInformationMapper vehicleInformationMapper;

    @Override
    public ApiResult post(Company company) {
        boolean addState = super.save(company);
        if(addState){
            return ApiResult.success("success");
        }else {
            return ApiResult.error(1202, "删除失败！");
        }
    }

    @Override
    public ApiResult getAll() {
        return ApiResult.success(super.list());
    }

    @Override
    public ApiResult delete(Integer id) {
        userMapper.delete(new QueryWrapper<User>().eq("vehicle_id", id));
        saleItemMapper.delete(new QueryWrapper<SaleItem>().eq("vehicle_id", id));
        vehicleInformationMapper.delete(new QueryWrapper<VehicleInformation>().eq("vehicle_id", id));
        // TODO 删除vehicle关联的子表
        boolean removeState = super.removeById(id);
        if(removeState){
            return ApiResult.success("success");
        }else {
            return ApiResult.error(1202, "删除失败");
        }
    }

    @Override
    public ApiResult getOne() {
        return null;
    }

    @Override
    public ApiResult put(Company company) {
        boolean updateState = super.updateById(company);
        if(updateState){
            return ApiResult.success("success");
        }else {
            return ApiResult.error(1202, "更新失败！");
        }
    }
}
