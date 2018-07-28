package cn.itcast.instance.factory;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Created with IDEA
 * @author:LiWangZhou
 * @Date:2018/7/28/028
 * @Time:22:01
 **/
public class InstanceTest3 {

    @Test
    public void demoo3(){
        //指定配置文件路径bean3.xml
        String xmlPath="cn/itcast/instance/factory/bean3.xml";
        //ApplicationContext 在加载配置文件时，对Bean进行实例化
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);

        System.out.println(applicationContext.getBean("bean3"));

    }
}
