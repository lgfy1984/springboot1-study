package com.lmy.di;

import com.lmy.BaseTest;
import com.lmy.PrintSpringBeanUtil;
import com.lmy.di.controller.UserController;
import org.junit.Before;
import org.junit.Test;

/**
 * @author yuhao.wang3
 * @since 2019/8/24 11:11
 */
public class DiTest extends BaseTest {

    @Before
    public void before() {
        super.before(DiConfig.class);
    }

    @Test
    public void contextTest() {

        PrintSpringBeanUtil.printlnBean(context);
        System.out.println("开始比较容器中的Bean");
        UserController bean = context.getBean(UserController.class);
        bean.println();
    }
}
