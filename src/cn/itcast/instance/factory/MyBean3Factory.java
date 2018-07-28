package cn.itcast.instance.factory;

import cn.itcast.instance.static_factory.Bean2;

/**
 * @Created with IDEA
 * @author:LiWangZhou
 * @Date:2018/7/28/028
 * @Time:21:41
 **/
public class MyBean3Factory {

    public  MyBean3Factory(){
        System.out.println("bean3工厂实例中");
    }
    //创建Bean的方法
    public Bean3 createBean(){
        return  new Bean3();
    }
}
