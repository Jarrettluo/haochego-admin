package com.example.haochegoadmin.service.impl;

import com.example.haochegoadmin.entity.VehicleInformation;
import com.example.haochegoadmin.mapper.VehicleInformationMapper;
import com.example.haochegoadmin.service.VehicleInformationService;
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
public class VehicleInformationServiceImpl extends ServiceImpl<VehicleInformationMapper, VehicleInformation> implements VehicleInformationService {

    public List<VehicleInformation> queryByCompanyId(Integer companyId) {
        return null;
    }

    @Override
    public ApiResult getAll() {
        return null;
    }

    @Override
    public ApiResult getSaledbyCompanyId(Integer companyId) {
        return null;
    }

    @Override
    public ApiResult getUnsaledbyCompanyId(Integer companyId) {
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
    public ApiResult put(VehicleInformation vehicleInformation) {
        return null;
    }
}
