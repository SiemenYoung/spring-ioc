package cn.com.shiming.util;

import cn.com.shiming.parse.CoreParse;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * Created by shiming on 2017/11/26.
 */
public class FileLoaderUtil {

    public static InputStream getInputStreamFromRelativePath(String path) {


        InputStream is = null;

        is = FileLoaderUtil.class.getClassLoader().getResourceAsStream(path);

        return is;
    }

    public static File  getFileByPath(String path) throws IOException {

        /**
         * 带／则读取项目的ClassPath根下获取资源，不带／ ，则默认是从此类所在的包下取资源
         */
       URL url=FileLoaderUtil.class.getResource(path);



       return new File(url.getFile());

    }




}
