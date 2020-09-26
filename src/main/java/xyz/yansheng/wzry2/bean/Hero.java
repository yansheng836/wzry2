package xyz.yansheng.wzry2.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 英雄实体类： https://pvp.qq.com/web201605/js/herolist.json
 *
 * {
 *         "ename": 107,
 *         "cname": "赵云",
 *         "title": "苍天翔龙",
 *         "new_type": 0,
 *         "hero_type": 1,
 *         "hero_type2": 4,
 *         "skin_name": "苍天翔龙|忍●炎影|未来纪元|皇家上将|嘻哈天王|白执事|引擎之心"
 *     },
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

    /**
     * 将实体类中的null替换为默认值，如：0，""
     */
    public Hero replaceNull() {

        this.setNewType((newType != null) ? newType : 0);
        this.setHeroType((heroType != null) ? heroType : 0);
        this.setHeroType2((heroType2 != null) ? heroType2 : 0);
        this.setSkinName((skinName != null) ? skinName : "");

        return this;
    }

}
