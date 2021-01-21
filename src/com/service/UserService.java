package com.service;

import com.pojo.User;

/**
 * @author xhz
 * @description 用户业务逻辑
 * @date 2021-01-20
 */

public interface UserService {
   boolean checkLogin(User user);
   boolean register(User user);
   User userCheckInfo(User user);
   User modifyInfo(User user);
   boolean modifyPwd(User user);
   boolean forgetPwd(User user);
}
