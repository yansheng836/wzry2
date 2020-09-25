package xyz.yansheng.wzry2.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 英雄皮肤实体类： https://github.com/yansheng836/hero-skin-images
 *
 * @author yansheng
 * @date 2020/9/25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Skin {

    /**
     * 英雄ID
     */
    private Integer ename;
    /**
     * 英雄皮肤ID
     */
    private Integer skinId;
    /**
     * 皮肤名
     */
    private String skinName;

    /**
     * 英雄头像URL(67*67)
     *
     * 详见：https://github.com/yansheng836/hero-skin-images
     */
    private String phoneSmallskinUrl;

    /**
     * 小屏手机英雄背景URL(600*410)
     *
     * 详见：https://github.com/yansheng836/hero-skin-images
     */

    private String phoneMobileskinUrl;
    /**
     * 大屏手机英雄背景URL(1200*530)
     *
     * 详见：https://github.com/yansheng836/hero-skin-images
     */

    private String phoneBigskinUrl;

    /**
     * 手机壁纸URL(727*1071)
     *
     * 详见：https://github.com/yansheng836/hero-skin-images
     */
    private String wallpaperMobileskinUrl;

    /**
     * 电脑壁纸URL(1920*882)
     *
     * 详见：https://github.com/yansheng836/hero-skin-images
     */
    private String wallpaperBigskinUrl;


}
