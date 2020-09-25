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
     * URL前缀: https://game.gtimg.cn/images/yxzj/img201606/
     */
    private final static String PREFIX_URL = "https://game.gtimg.cn/images/yxzj/img201606/";
    /**
     * URL后缀（即图片后缀）: .jpg
     */
    private final static String SUFFIX_URL = ".jpg";
    /**
     * 手机端URL中间值：heroimg
     */
    private final static String PHONE_MIDDLE_URL = "heroimg";
    /**
     * 电脑端URL中间值：skin/hero-info
     */
    private final static String WALLPAPER_MIDDLE_URL = "skin/hero-info";
    /**
     * 小皮肤（字符串）：-smallskin-
     */
    private final static String SMALL_SKIN = "-smallskin-";
    /**
     * 手机皮肤（字符串）：-mobileskin-
     */
    private final static String MOBILE_SKIN = "-mobileskin-";
    /**
     * 大皮肤（字符串）：-bigskin-
     */
    private final static String BIG_SKIN = "-bigskin-";

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
     * 英雄头像URL(67*67)，例如：https://game.gtimg.cn/images/yxzj/img201606/heroimg/518/518-smallskin-1.jpg
     *
     * 详见：https://github.com/yansheng836/hero-skin-images
     */
    private String phoneSmallskinUrl;

    /**
     * 小屏手机英雄背景URL(600*410)，例如：https://game.gtimg.cn/images/yxzj/img201606/heroimg/518/518-mobileskin-1.jpg
     *
     * 详见：https://github.com/yansheng836/hero-skin-images
     */

    private String phoneMobileskinUrl;
    /**
     * 大屏手机英雄背景URL(1200*530)，例如：https://game.gtimg.cn/images/yxzj/img201606/heroimg/518/518-bigskin-1.jpg
     *
     * 详见：https://github.com/yansheng836/hero-skin-images
     */

    private String phoneBigskinUrl;

    /**
     * 手机壁纸URL(727*1071)，例如：https://game.gtimg.cn/images/yxzj/img201606/skin/hero-info/518/518-mobileskin-1.jpg
     *
     * 详见：https://github.com/yansheng836/hero-skin-images
     */
    private String wallpaperMobileskinUrl;

    /**
     * 电脑壁纸URL(1920*882)，例如：https://game.gtimg.cn/images/yxzj/img201606/skin/hero-info/518/518-bigskin-1.jpg
     *
     * 详见：https://github.com/yansheng836/hero-skin-images
     */
    private String wallpaperBigskinUrl;

    public Skin(Integer ename, Integer skinId, String skinName) {
        this.ename = ename;
        this.skinId = skinId;
        this.skinName = skinName;
        generateSkinUrl();
    }

    /**
     * 生成皮肤URL(注意：这里只是假设该皮肤操作，不一定真实存在)
     */
    private void generateSkinUrl() {
        // 例如：/518/518
        String twoEname = "/" + ename + "/" + ename;
        // https://game.gtimg.cn/images/yxzj/img201606/heroimg/518/518-smallskin-1.jpg
        this.phoneSmallskinUrl = PREFIX_URL + PHONE_MIDDLE_URL + twoEname + SMALL_SKIN + skinId + SUFFIX_URL;
        this.phoneMobileskinUrl = PREFIX_URL + PHONE_MIDDLE_URL + twoEname + MOBILE_SKIN + skinId + SUFFIX_URL;
        this.phoneBigskinUrl = PREFIX_URL + PHONE_MIDDLE_URL + twoEname + BIG_SKIN + skinId + SUFFIX_URL;
        this.wallpaperMobileskinUrl = PREFIX_URL + WALLPAPER_MIDDLE_URL + twoEname + MOBILE_SKIN + skinId + SUFFIX_URL;
        this.wallpaperBigskinUrl = PREFIX_URL + WALLPAPER_MIDDLE_URL + twoEname + BIG_SKIN + skinId + SUFFIX_URL;
    }

}
