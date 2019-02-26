package com.felix.project.common.annotation;

import java.lang.annotation.*;

/**
 * @author Felxi
 * @date 2019-02-20
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SysLogger {
	String value() default "";
}
