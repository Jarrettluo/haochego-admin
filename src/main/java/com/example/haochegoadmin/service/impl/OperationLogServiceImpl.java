package com.example.haochegoadmin.service.impl;

import com.example.haochegoadmin.entity.OperationLog;
import com.example.haochegoadmin.mapper.OperationLogMapper;
import com.example.haochegoadmin.service.OperationLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.utils.ApiResult;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Collection;
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
public class OperationLogServiceImpl extends ServiceImpl<OperationLogMapper, OperationLog> implements OperationLogService {


    @Override
    public boolean save(OperationLog entity) {
        return super.save(entity);
    }

    @Override
    public boolean removeById(Serializable id) {
        return super.removeById(id);
    }

    @Override
    public boolean removeByIds(Collection<? extends Serializable> idList) {
        return super.removeByIds(idList);
    }

    @Override
    public boolean updateById(OperationLog entity) {
        return super.updateById(entity);
    }

    @Override
    public ApiResult getAll() {
        return null;
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
    public ApiResult put() {
        return null;
    }
}
