package cn.com.shiming.factory;

import cn.com.shiming.parse.BeanParse;
import cn.com.shiming.parse.CoreParse;
import cn.com.shiming.reflect.ReflectUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by shiming on 2017/11/26.
 */
public class BeanFactory {

    String classpath = null;


    public BeanFactory(String classpath) {
        this.classpath = classpath;
        init();
    }

    private  final Map<String, Object> beansMap = new HashMap();

     private void init(){
        List<BeanParse> beanParses = CoreParse.getAllBeanParse(classpath);

        if (beanParses != null && beanParses.size() > 0) {

            for (BeanParse beanParse : beanParses) {

                if (beanParse.getId() == null && beanParse.getClassName() == null) {
                    continue;
                }

                Object bean = ReflectUtil.getObjectByClassName(beanParse.getClassName());

                if (bean == null) {
                    continue;
                }

                beansMap.put(beanParse.getId(), bean);
            }
        }
    }

    public  Object getBean(String beanId) {

        return beansMap.get(beanId);
    }
}
