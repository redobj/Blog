package top.redobj.blog.bean;

import java.util.HashMap;
import java.util.Map;

public class Msg {

    /**
     * 错误码
     * 成功 ： 100
     * 错误 ： 200
     */
    public static int MSG_SUCCESS = 100;
    public static int MSG_FAIL = 200;

    private int code;
    private String msg;
    private Map<String,Object> extend;

    public static Msg success(){
        return new Msg(MSG_SUCCESS,"success");
    }

    public static Msg fail(){
        return new Msg(MSG_FAIL,"fail");
    }

    public static Msg fail(int code){
        return new Msg(code,"fail");
    }


    public Msg(int code, String msg) {
        this.code = code;
        this.msg = msg;
        this.extend = new HashMap<String, Object>();
    }

    public int getCode() {
        return code;
    }

    public Msg setCode(int code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Map<String, Object> getExtend() {
        return extend;
    }

    public void setExtend(Map<String, Object> extend) {
        this.extend = extend;
    }

    public Msg add(String key, Object value){
        extend.put(key,value);
        return this;
    }
}