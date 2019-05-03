package com.imooc.VO;

import lombok.Data;

/**
 * http请求返回的对象
 * Created by Dod_Annie on 2019/5/2
 */

@Data
public class ResultVO <T>{

    /*错误码*/
    private Integer code;

    /*提示信息*/
    private String msg;

     /*具体内容*/
    private T data;
}
