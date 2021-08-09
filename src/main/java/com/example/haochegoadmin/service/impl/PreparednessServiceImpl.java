package com.example.haochegoadmin.service.impl;

import com.example.haochegoadmin.entity.Preparedness;
import com.example.haochegoadmin.mapper.PreparednessMapper;
import com.example.haochegoadmin.service.PreparednessService;
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
public class PreparednessServiceImpl extends ServiceImpl<PreparednessMapper, Preparedness> implements PreparednessService {

    public List<Preparedness> queryByCompanyId(Integer companyId) {
        return null;
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
    public ApiResult put() {
        return null;
    }
}
