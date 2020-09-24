package xyz.yansheng.wzry2.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 王者荣耀壁纸实体类
 * 
 * @author yansheng
 * @date 2020/05/28
 */
@Data
@AllArgsConstructor
@ApiModel(value = "王者荣耀壁纸实体类")
public class WzryWallpaper {

    /**
     * 壁纸id
     */
    @ApiModelProperty(value = "壁纸id", example = "1")
    private Integer id;

    /**
     * 壁纸对应的图片URL
     */
    @ApiModelProperty(value = "壁纸对应的图片URL",
        example = "https://game.gtimg.cn/images/yxzj/img201606/skin/hero-info/523/523-bigskin-1.jpg")
    private String url;

}
