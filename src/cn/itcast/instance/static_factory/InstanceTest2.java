package cn.itcast.instance.static_factory;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Created with IDEA
 * @author:LiWangZhou
 * @Date:2018/7/28/028
 * @Time:21:03
 **/
public class InstanceTest2 {

    @Test
    public  void demo02(){
        //定义文件的配置文件路径，相当于从类路径（src）
        String xmlpath="cn.itcast.instance.static_factory.Bean2.xml";
        //ApplicationContext 在加载配置文件的时，对Bean进行实例化
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlpath);

        System.out.println(applicationContext.getBean("bean2"));


    }
}
