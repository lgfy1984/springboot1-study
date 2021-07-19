package com.lmy.component.scan;

import com.lmy.BaseTest;
import com.lmy.PrintSpringBeanUtil;
import org.junit.Before;
import org.junit.Test;

/**
 * @author yuhao.wang3
 * @since 2019/8/24 11:11
 */
public class ComponentScanTest extends BaseTest {

    @Before
    public void before() {
        super.before(ComponentScanConfig.class);
    }

    @Test
    public void contextTest() {
        PrintSpringBeanUtil.printlnBean(context);
    }
}
