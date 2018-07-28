package cn.itcast.instance.static_factory;

import org.springframework.context.annotation.Bean;

/**
 * @Created with IDEA
 * @author:LiWangZhou
 * @Date:2018/7/28/028
 * @Time:20:56
 **/
public class MyBean2Factory {
    //使用自己工厂创建bean实例
    public static Bean2 createBean(){
        return  new Bean2();
    }
}
