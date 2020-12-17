package com.shm.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 这里我们用到了一个Result的类，这个用于我们的异步统一返回的结果封装。
 * 一般来说，结果里面有几个要素必要的
 * <p>
 * 是否成功，可用code表示（如200表示成功，400表示异常）
 * 结果消息
 * 结果数据
 */
@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class R implements Serializable {
    private int code; //200是正常  非200表示异常
    private String msg;
    private Object data;

    public static R succ(Object data) {
        R r = new R()
                .setCode(200)
                .setData(data)
                .setMsg("操作成功");
        return r;
    }
    public static R succ(String msg,Object data) {
        R r = new R()
                .setCode(200)
                .setData(data)
                .setMsg(msg);
        return r;
    }
    public static R succ(int code,String msg, Object data){
        R r = new R()
                .setCode(code)
                .setData(data)
                .setMsg(msg);
        return r;
    }

    public static R fail(String msg) {
        R r = new R()
                .setCode(-1)
                .setData(null)
                .setMsg(msg);
        return r;
    }

    public static R fail(String msg,Object data) {
        R r = new R()
                .setCode(-1)
                .setData(data)
                .setMsg(msg);
        return r;
    }

    public static R fail(int i, String message, Object data) {
        R r = new R()
                .setCode(i)
                .setData(data)
                .setMsg(message);
        return r;
    }
}
