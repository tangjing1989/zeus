package com.tangjing.project.service;


import com.tangjing.project.model.SysUser;

import java.util.List;

public interface ISysUserService {

    List<SysUser> getUser(String userName) throws Exception;

    SysUser expendUser(int userId, String userName) throws Exception;
}
