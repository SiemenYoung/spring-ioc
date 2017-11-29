package cn.com.shiming.main;

import cn.com.shiming.bean.Student;
import cn.com.shiming.factory.BeanFactory;

/**
 * Created by shiming on 2017/11/26.
 */
public class MainTest {

    public static void main(String[] args) {

        BeanFactory beanFactory = new BeanFactory("ioc/ioc-1.xml");
        Student student= (Student) beanFactory.getBean("student1");

        student.setName("");
    }
}
