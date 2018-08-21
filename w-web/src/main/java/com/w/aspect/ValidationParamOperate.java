package com.w.aspect;

/**
 * @author w
 * @since on 2018/5/10.
 */
public class ValidationParamOperate extends AspectHandler{
    @Override
    protected ValidationParamAspect factoryMethod() {
        return  new ValidationParamAspect();
    }
}
