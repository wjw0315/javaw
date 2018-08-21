package com.w.service;

import com.w.entity.User;
import com.w.entity.UserThirdparty;
import com.baomidou.mybatisplus.service.IService;
import com.w.model.ThirdPartyUser;

/**
 * <p>
 * 第三方用户表 服务类
 * </p>
 *
 * @author Mr.W
 * @since 2018-07-27
 */
public interface IUserThirdpartyService extends IService<UserThirdparty> {

    User insertThirdPartyUser(ThirdPartyUser param, String password)throws Exception;

}
