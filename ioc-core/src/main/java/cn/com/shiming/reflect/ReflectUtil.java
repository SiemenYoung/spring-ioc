package cn.com.shiming.reflect;

/**
 * Created by shiming on 2017/11/26.
 */
public class ReflectUtil {

    public static Object getObjectByClassName(String className) {

        Object o = null;

        try {
            try {
               o = Class.forName(className).newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return o;

    }

    public static void main(String[] args) {
        Object o = getObjectByClassName("cn.com.shiming.bean.Student");


    }
}
