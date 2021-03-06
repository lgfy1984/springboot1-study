package com.lmy.init.destory;

import com.lmy.BaseTest;
import com.lmy.PrintSpringBeanUtil;
import org.junit.Before;
import org.junit.Test;

/**
 * 测试Bean的三种初始化、销毁方式和执行顺序
 *
 * @author yuhao.wang3
 */
public class SpringIocTest extends BaseTest {

    @Before
    public void before() {
        super.before(MyConfig.class);
    }

    @Test
    public void contextTest() {
        PrintSpringBeanUtil.printlnBean(context);

        // 测试Bean的三种初始化、销毁方式和执行顺序
        System.out.println(context.getBean(InitBeanAndDestroyBean.class));
        System.out.println(context.getBean(InitBeanAndDestroyBean.class));
    }

}