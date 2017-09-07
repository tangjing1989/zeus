package com.tangjing.project.service.impl;


import com.tangjing.project.dao.SysUserMapper;
import com.tangjing.project.model.SysUser;
import com.tangjing.project.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Describe:
 * User:tangjing
 * Date:2017/7/31
 * Time:下午2:59
 */
@Service
public class SysUserServiceImpl implements ISysUserService {

    @Autowired
    SysUserMapper mapper;

    public List<SysUser> getUser(String userName) throws Exception{
        Map<String,Object> map= new HashMap<String,Object>();
        map.put("user_name",userName);
        return mapper.selectByMap(map);
    }

    public SysUser expendUser(int userId,String userName) throws Exception{
        SysUser user=new SysUser();
        user.setUserId(userId);
        user.setUserName(userName);
        return mapper.selectOne(user);
    }


}