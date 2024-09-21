//package com.kunge2013.nacos.client.config;
//
//import com.alibaba.nacos.api.NacosFactory;
//import com.alibaba.nacos.api.PropertyKeyConst;
//import com.alibaba.nacos.api.config.ConfigService;
//import com.alibaba.nacos.api.exception.NacosException;
//import com.alibaba.nacos.api.naming.NamingService;
//
//
//import java.util.Properties;
//
///**
// * @Author kunge2013
// * @Description TODO
// * @Date 2024/9/20 15:41
// * @Version 1.0
// */
//public class NacosFactoryTest {
//    public static void main(String[] args) throws NacosException {
////        try {
////            ServerRequest request;
////            Http2ConnectionHandler handler;
////            String serverAddr = "http://124.70.159.63:8848";
//            String serverAddr = "localhost:8848";
//            String dataId = "nacos_config";
//            String group = "DEFAULT_GROUP";
//            Properties properties = new Properties();
//            properties.put("serverAddr", serverAddr);
//            ConfigService configService = NacosFactory.createConfigService(properties);
//            String content = configService.getConfig(dataId, group, 5000);
//            System.out.println(content);
//        } catch (NacosException e) {
//            e.printStackTrace();
//        }
//    }
//}
