package com.w.service;

import com.w.entity.UserToRole;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Mr.W
 * @since 2018-05-03
 */
public interface IUserToRoleService extends IService<UserToRole> {

    /**
     * 根据用户ID查询人员角色
     * @param userNo 用户ID
     * @return  结果
     */
    UserToRole selectByUserNo(String  userNo);

}
