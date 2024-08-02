package cn.sx.hu.wall.e.util;

import java.util.HashMap;
import java.util.Map;

/**
 * URL查询字符串工具类
 *
 * <p>更多内容参看<a href="https://hu.sx.cn" target="_blank"><b>老胡爱分享</b></a>
 * @author hu
 */
public class QueryStringUtil {

    private QueryStringUtil(){

    }

    public static Map<String,String> parse(String querystring) {
        Map<String,String> result = new HashMap<String,String>();

        String[] couples = querystring.split("\\&");

        for(int i = 0; i < couples.length; i++) {
            String couple = couples[i];
            String[] kvs = couple.split("\\=");
            result.put(kvs[0], kvs[1]);
        }

        return result;
    }

}
