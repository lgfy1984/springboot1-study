package com.lmy.annotation;

import com.lmy.core.TrackConfig;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@EnableAspectJAutoProxy
@Import({TrackConfig.class})
public @interface EnableAspectJLog {

}
