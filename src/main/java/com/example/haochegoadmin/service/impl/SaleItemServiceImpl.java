package com.example.haochegoadmin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.haochegoadmin.entity.OperationLog;
import com.example.haochegoadmin.entity.Preparedness;
import com.example.haochegoadmin.entity.SaleItem;
import com.example.haochegoadmin.mapper.SaleItemMapper;
import com.example.haochegoadmin.service.SaleItemService;
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
public class SaleItemServiceImpl extends ServiceImpl<SaleItemMapper, SaleItem> implements SaleItemService {

    @Override
    public ApiResult getAll() {
        return ApiResult.success(super.list());
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
    public ApiResult deletebyVehicleId(Integer vehicleId) {
        boolean removeState = super.removeById(new QueryWrapper<Preparedness>().eq("vehicle_id", vehicleId));
        if(removeState){
            return ApiResult.success("true");
        }else {
            return ApiResult.error(1202, "删除失败");
        }
    }

    @Override
    public ApiResult getOne(Integer id) {
        return null;
    }

    @Override
    public ApiResult getOnebyVehicleId(Integer vehicleId) {
        List<SaleItem> saleItemList = super.list(new QueryWrapper<SaleItem>().eq("vehicle_id", vehicleId));
        return ApiResult.success(saleItemList);
    }

    @Override
    public ApiResult put(SaleItem saleItem) {
        boolean updateState = super.saveOrUpdate(saleItem);
        if(updateState){
            return ApiResult.success("true");
        }else {
            return ApiResult.error(1202, "保存失败");
        }
    }
}
