package cn.com.shiming.parse;

/**
 * Created by shiming on 2017/11/26.
 */
public class BeanParse {

    private String id;

    private String className;

    public BeanParse() {
    }

    public BeanParse(String id, String className) {
        this.id = id;
        this.className = className;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "BeanParse{" +
                "id='" + id + '\'' +
                ", className='" + className + '\'' +
                '}';
    }
}
