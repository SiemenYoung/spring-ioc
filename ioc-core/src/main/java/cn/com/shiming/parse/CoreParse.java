package cn.com.shiming.parse;

import cn.com.shiming.util.FileLoaderUtil;
import com.thoughtworks.xstream.XStream;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * Created by shiming on 2017/11/26.
 */
public class CoreParse {

    public static List<BeanParse> getAllBeanParse(String classPath) {

        List<BeanParse> beanParses = new ArrayList<BeanParse>();

        InputStream is = FileLoaderUtil.getInputStreamFromRelativePath(classPath);

        XmlBeanContainer beanContainer = getBeanContainer(is);

        if (beanContainer != null) {
            beanParses.addAll(beanContainer.getBeans());
        }

        return beanParses;


    }



    public static XmlBeanContainer getBeanContainer(InputStream is) {

        XmlBeanContainer xmlBeanContainer= null;

        XStream xStream = new XStream();

        xStream.alias("root",XmlBeanContainer.class);
        xStream.alias("bean", BeanParse.class);
        xStream.useAttributeFor(BeanParse.class, "id");
        xStream.useAttributeFor(BeanParse.class, "className");

         xmlBeanContainer= new XmlBeanContainer();

        xStream.fromXML(is, xmlBeanContainer);


        return xmlBeanContainer;
    }
}
