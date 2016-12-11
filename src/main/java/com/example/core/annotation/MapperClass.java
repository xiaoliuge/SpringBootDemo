package com.example.core.annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Administrator on 2016/12/9.
 */
@SuppressWarnings("unchecked")
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MapperClass{
    /**
     *指定 MapperClass
     */
    Class value();
}
