package xyz.yansheng.wzry2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 参考：https://www.jianshu.com/p/be1e772b089a。Swagger配置类，访问路径：http://localhost:8080/swagger-ui.html。
 * 
 * @author yansheng
 * @date 2020/06/07
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    /**
     * 访问http://localhost:8080/v2/api-docs可得到json数据。
     * 
     * @return
     */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
            // 为当前包路径
            // .apis(RequestHandlerSelectors.basePackage("xyz.yansheng.wzrywallpaper.controller"))
            .apis(RequestHandlerSelectors.any()).paths(PathSelectors.any()).build();
    }

    /**
     * 构建 api文档的详细信息函数。
     * 
     * @return ApiInfo
     */
    private ApiInfo apiInfo() {

        String title = "王者荣耀每日壁纸项目的(RESTful)API";
        String description = "王者荣耀每日壁纸API，访问对应接口可返回王者荣耀每日壁纸、实时壁纸、指定ID的壁纸信息（JSON数据/图片）。";
        // terms n. 地位，关系；[法] 条款；术语；措辞；价钱（term的复数形式）
        String termsOfServiceUrl = "/swagger-ui.html";

        // Contact(name, url, email)联系人（创建者）信息
        String name = "yansheng";
        String url = "http://www.yansheng.xyz/";
        String email = "sheng.yan836@gmail.com";

        String license = "MIT";
        String licenseUrl = "https://raw.githubusercontent.com/yansheng836/license-templates/master/templates/mit.txt";

        String version = "V1.0";

        return new ApiInfoBuilder()
            // 页面标题
            .title(title)
            // 描述
            .description(description).termsOfServiceUrl(termsOfServiceUrl)
            // 创建人信息
            .contact(new Contact(name, url, email)).license(license).licenseUrl(licenseUrl)
            // 版本号
            .version(version).build();
    }
}
