package main.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @Created with IDEA
 * @author:LiWangZhou
 * @Date:2018/7/28/028
 * @Time:19:53
 **/
public class demo {
    @Test
    public  void demo1(){
        String xmlPath="main/test/beans1.xml";
        ApplicationContext applicationContext;
        applicationContext  = new ClassPathXmlApplicationContext(xmlPath);
        System.out.println(applicationContext.getBean("bean1"));
    }
}
