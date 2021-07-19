package com.lmy.iimport;

import com.lmy.iimport.bean.CatTestBean;
import com.lmy.iimport.bean.DogTestBean;
import com.lmy.iimport.bean.ImportTestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author yuhao.wang3
 * @since 2019/8/24 15:58
 */
@Configuration
@Import({DogTestBean.class, CatTestBean.class, AnimalImportSelector.class, AnimalImportBeanDefinitionRegistrar.class})
public class ImportConfig {

    @Bean
    public ImportTestBean importTestBean() {
        return new ImportTestBean();
    }

    // 最终注入的其实是 MonkeyTestBean 类
    @Bean
    public AnimalFactoryBean monkeyTestBean() {
        return new AnimalFactoryBean();
    }
}
