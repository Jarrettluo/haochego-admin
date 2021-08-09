package com.example.haochegoadmin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
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


    @Override
    public ApiResult getAll() {
        return ApiResult.success(super.list());
    }

    @Override
    public ApiResult getAllByVehicleId(Integer vehicleId) {
        List<Preparedness> preparednessList = super.list(new QueryWrapper<Preparedness>().eq("vehicle_id", vehicleId));
        return ApiResult.success(preparednessList);
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
    public ApiResult deleteByVehicleId(Integer vehicleId) {
        boolean removeState = super.removeById(new QueryWrapper<Preparedness>().eq("vehicle_id", vehicleId));
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
    public ApiResult put() {
        Preparedness preparedness = new Preparedness();
        boolean updateState = super.saveOrUpdate(preparedness);
        if(updateState){
            return ApiResult.success("true");
        }else {
            return ApiResult.error(1202, "保存失败");
        }
    }
}
