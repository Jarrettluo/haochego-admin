package com.example.haochegoadmin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.haochegoadmin.entity.Partner;
import com.example.haochegoadmin.mapper.PartnerMapper;
import com.example.haochegoadmin.service.PartnerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.utils.ApiResult;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
public class PartnerServiceImpl extends ServiceImpl<PartnerMapper, Partner> implements PartnerService {


    public List<Partner> queryByCompanyId(Integer companyId) {
        QueryWrapper<Partner> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("vehicle_id", 107);
        List<Partner> partnerList= super.list(queryWrapper);
        return partnerList;
    }

    @Override
    public ApiResult getAll() {
        return null;
    }

    @Override
    public ApiResult getAllbyVehicleId(Integer vehicleId) {
        return null;
    }

    @Override
    public ApiResult delete(Integer id) {
        return null;
    }

    @Override
    public ApiResult deletebyVehicleId(Integer vehicleId) {
        return null;
    }

    @Override
    public ApiResult getOne() {
        return null;
    }

    @Override
    public ApiResult put(Partner partner) {
        return null;
    }
}
