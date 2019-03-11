package com.demo.serviceimpl;

import com.demo.dao.userinfodao;
import com.demo.pojo.Userinfo;
import com.demo.service.UserInfoService;

public class UserInfoServiceImpl implements UserInfoService {
    /**
     * 拆入用户信息
     * @param userinfo
     * @return
     */

    private userinfodao uidao;
    public boolean insertUser(Userinfo userinfo) {
        return false;
    }
}
