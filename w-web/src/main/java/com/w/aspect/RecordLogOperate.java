package com.w.aspect;

/**
 * @author w
 * @since on 2018/5/10.
 */
public class RecordLogOperate extends AspectHandler{
    @Override
    protected RecordLogAspect factoryMethod() {
        return new RecordLogAspect();
    }
}
