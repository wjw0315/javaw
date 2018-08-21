package com.w.service.impl;

import com.w.entity.Notice;
import com.w.mapper.NoticeMapper;
import com.w.service.INoticeService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 消息通知表 服务实现类
 * </p>
 *
 * @author Mr.W
 * @since 2018-07-27
 */
@Service
public class NoticeServiceImpl extends ServiceImpl<NoticeMapper, Notice> implements INoticeService {

    @Override
    public void insertByThemeNo(String themeNo,String  mobile) {
        Notice notice =new Notice();
        notice.setThemeNo(themeNo);
        //自己设定业务类型
        notice.setType(1);
        notice.setTitle("测试通知1111111111");
        notice.setMobile(mobile);
        notice.setCreateTime(System.currentTimeMillis());
        //未读
        notice.setIsRead(0);
        this.insert(notice);
    }
}
