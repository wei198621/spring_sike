package com.tiza.leo.springsike_apiservice01.beanFactoryPostProcessor;

import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.Resource;
import org.springframework.util.DefaultPropertiesPersister;
import org.springframework.util.PropertiesPersister;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author leowei
 * @date 2021/12/19  - 0:09
 */
public class CustomPropertyConfig extends PropertySourcesPlaceholderConfigurer {
    private Resource[] locations;
    private PropertiesPersister propertiesPersister = new DefaultPropertiesPersister();

    public Resource[] getLocations() {
        return locations;
    }

    @Override
    public void setLocations(Resource[] locations) {
        this.locations = locations;
    }

    public void setLocalOverride(boolean localOverride){
        this.localOverride = localOverride;
    }

    /**
     * 覆盖这个方法，根据启动参数，动态读取配置文件
     * @param props
     * @throws IOException
     */
    @Override
    protected void loadProperties(Properties props) throws IOException {
        if (locations != null) {
            // locations 里面就已经包含了那三个定义的文件
            for (Resource location : this.locations) {
                InputStream is = null;
                try {
                    String filename = location.getFilename();
                    String env = "application-" + System.getProperty("spring.profiles.active", "dev") + ".properties";

                    // 找到我们需要的文件，加载
                    if (filename.contains(env)) {
                        logger.info("Loading properties file from " + location);
                        is = location.getInputStream();
                        this.propertiesPersister.load(props, is);

                    }
                } catch (IOException ex) {
                    logger.info("读取配置文件失败.....");
                    throw ex;
                } finally {
                    if (is != null) {
                        is.close();
                    }
                }
            }
        }
    }


}
