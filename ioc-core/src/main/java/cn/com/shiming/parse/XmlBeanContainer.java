package cn.com.shiming.parse;

import java.util.List;

/**
 * Created by shiming on 2017/11/26.
 */
public class XmlBeanContainer {


    private List<BeanParse> beans;

    public XmlBeanContainer() {
    }

    public XmlBeanContainer(List<BeanParse> beans) {
        this.beans = beans;
    }

    public List<BeanParse> getBeans() {
        return beans;
    }

    public void setBeans(List<BeanParse> beans) {
        this.beans = beans;
    }


    @Override
    public String toString() {
        return "XmlBeanContainer{" +
                "beans=" + beans +
                '}';
    }
}
