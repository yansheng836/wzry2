package xyz.yansheng.wzry2.util;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;

/**
 * 测试SpiderUtil
 *
 * @author yansheng
 * @date 2020/9/26
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpiderUtilTest {

    /**
     * https://game.gtimg.cn/images/yxzj/img201606/heroimg/105/105-smallskin-1.jpg
     * https://game.gtimg.cn/images/yxzj/img201606/heroimg/105/105-smallskin-10.jpg
     */
    @Test
    public void testIsUrlRight() {
        String[] urls = {};
        Assert.assertTrue(
            SpiderUtil.isUrlRight2("https://game.gtimg.cn/images/yxzj/img201606/heroimg/105/105-smallskin-1.jpg"));
        Assert.assertFalse(
            SpiderUtil.isUrlRight2("https://game.gtimg.cn/images/yxzj/img201606/heroimg/105/105-smallskin-10.jpg"));
        Assert.assertEquals(false,
            SpiderUtil.isUrlRight2("https://game.gtimg.cn/images/yxzj/img201606/heroimg/105/105-smallskisn-1.jpg"));
    }

}
