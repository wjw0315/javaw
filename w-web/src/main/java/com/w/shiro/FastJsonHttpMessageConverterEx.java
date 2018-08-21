package com.w.shiro;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

/**
 * @author w
 * @since 2018-05-03
 */
public class FastJsonHttpMessageConverterEx extends FastJsonHttpMessageConverter {
    public FastJsonHttpMessageConverterEx() {
    }

    @Override
    protected boolean supports(Class<?> clazz) {
        return super.supports(clazz);
    }
}
