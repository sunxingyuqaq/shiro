package com.boot.sh.core.service.impl;


import com.boot.sh.core.dao.SysMenuDao;
import com.boot.sh.core.service.SysMenuService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.boot.sh.core.entity.SysMenuEntity;

import java.util.List;

/**
 * @Description 权限业务实现
 * @Author Sans
 * @CreateTime 2019/6/14 15:57
 */
@Service("sysMenuService")
public class SysMenuServiceImpl extends ServiceImpl<SysMenuDao, SysMenuEntity> implements SysMenuService {


    /**
     * 根据角色查询用户权限
     * @Author Sans
     * @CreateTime 2019/6/19 10:14
     * @Param  roleId 角色ID
     * @Return List<SysMenuEntity> 权限集合
     */
    @Override
    public List<SysMenuEntity> selectSysMenuByRoleId(Long roleId) {
        return this.baseMapper.selectSysMenuByRoleId(roleId);
    }
}