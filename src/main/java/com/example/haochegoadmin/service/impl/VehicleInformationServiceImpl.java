package com.example.haochegoadmin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.haochegoadmin.entity.Partner;
import com.example.haochegoadmin.entity.Preparedness;
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

    @Override
    public ApiResult add(VehicleInformation vehicleInformation) {
        boolean addState = super.save(vehicleInformation);
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
    public ApiResult getSaledbyCompanyId(Integer companyId) {
        return null;
    }

    @Override
    public ApiResult getUnsaledbyCompanyId(Integer companyId) {
        return null;
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
    public ApiResult put(VehicleInformation vehicleInformation) {
        boolean updateState = super.saveOrUpdate(vehicleInformation);
        if(updateState){
            return ApiResult.success("true");
        }else {
            return ApiResult.error(1202, "保存失败");
        }
    }
}
