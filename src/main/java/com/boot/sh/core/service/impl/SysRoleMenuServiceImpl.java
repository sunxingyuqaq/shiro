package com.boot.sh.core.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.boot.sh.core.dao.SysRoleMenuDao;
import com.boot.sh.core.entity.SysRoleMenuEntity;
import com.boot.sh.core.service.SysRoleMenuService;

/**
 * @Description 角色与权限业务实现
 * @Author Sans
 * @CreateTime 2019/6/14 15:57
 */
@Service("sysRoleMenuService")
public class SysRoleMenuServiceImpl extends ServiceImpl<SysRoleMenuDao, SysRoleMenuEntity> implements SysRoleMenuService {

}