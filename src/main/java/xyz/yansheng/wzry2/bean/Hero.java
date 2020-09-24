package xyz.yansheng.wzry2.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 英雄实体类： https://pvp.qq.com/web201605/js/herolist.json
 *
 * @author yansheng
 * @date 2020/9/24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hero {

    /**
     * 英雄ID
     */
    private Integer ename;
    /**
     * 英雄名
     */
    private String cname;
    /**
     * 英雄伴生皮肤
     */
    private String title;
    /**
     * 英雄新类型
     */
    private Integer newType;
    /**
     * 英雄类型
     */
    private Integer heroType;
    /**
     * 英雄类型2
     */
    private Integer heroType2;
    /**
     * 英雄所有皮肤
     */
    private String skinName;

}
