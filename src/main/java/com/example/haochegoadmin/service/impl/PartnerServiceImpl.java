package com.example.haochegoadmin.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
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

    @Override
    public ApiResult getAll() {
        List<Partner> partnerList = super.list();
        return ApiResult.success(partnerList);
    }

    @Override
    public ApiResult getAllbyVehicleId(Integer vehicleId) {
        List<Partner> partnerList = super.list(new QueryWrapper<Partner>().eq("vehicle_id", vehicleId));
        return ApiResult.success(partnerList);
    }

    @Override
    public ApiResult delete(Integer id) {
        boolean deleteState = super.removeById(id);
        if(deleteState){
            return ApiResult.success("true");
        }else {
            return ApiResult.error(1202, "删除失败！");
        }
    }

    @Override
    public ApiResult deletebyVehicleId(Integer vehicleId) {
        boolean deleteState = super.remove(new QueryWrapper<Partner>().eq("vehicle_id", vehicleId));
        if(deleteState){
            return ApiResult.success("true");
        }else {
            return ApiResult.error(1202, "删除失败！");
        }
    }

    @Override
    public ApiResult getOne() {
        Partner partner = super.getById(1);
        return ApiResult.success(partner);
    }

    @Override
    public ApiResult put(Partner partner) {
        boolean updateState = super.saveOrUpdate(partner);
        if(updateState){
            return ApiResult.success("true");
        }else {
            return ApiResult.error(1202, "删除失败！");
        }
    }
}
