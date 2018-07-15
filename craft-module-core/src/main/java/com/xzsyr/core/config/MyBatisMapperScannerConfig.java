/**  
* @Title: MyBatisMapperScannerConfig.java  
* @Package com.xzsyr.core.config  
* @Description: TODO 
* @author jizhuang.wang 
* @date 2018年6月10日  
* @version V1.0  
*/ 
package com.xzsyr.core.config;

import org.mybatis.spring.mapper.MapperScannerConfigurer;

/**  
* @ClassName: MyBatisMapperScannerConfig  
* @Description: TODO 
* @author jizhuang.wang  
* @date 2018年6月10日  
*    
*/
//@Configuration
//TODO 注意，由于MapperScannerConfigurer执行的比较早，所以必须有下面的注解
//@AutoConfigureAfter(MyBatisConfig.class)
public class MyBatisMapperScannerConfig {
	//@Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        mapperScannerConfigurer.setBasePackage("tk.mybatis.springboot.mapper");
        return mapperScannerConfigurer;
    }
}
