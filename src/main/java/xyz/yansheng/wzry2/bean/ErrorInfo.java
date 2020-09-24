package xyz.yansheng.wzry2.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 返回错误信息（给前端）的实体类
 * 
 * @author yansheng
 * @date 2020/05/28
 */
@Data
@AllArgsConstructor
public class ErrorInfo {

    /**
     * 错误状态码
     */
    private Integer statusCode;

    /**
     * 错误信息
     */
    private String errorString;

}
