# Wzry2

[![Build Status](https://travis-ci.org/yansheng836/wzry2.svg?branch=master)](https://travis-ci.org/yansheng836/wzry2)  [![codebeat badge](https://codebeat.co/badges/1fd0a446-fb1a-4d9b-bacd-e9a17041fd8b)](https://codebeat.co/projects/github-com-yansheng836-wzry2-master)  [![BCH compliance](https://bettercodehub.com/edge/badge/yansheng836/wzry2?branch=master)](https://bettercodehub.com/)  [![Codacy Badge](https://app.codacy.com/project/badge/Grade/97b9825a94164e51bf29f3a5e6547796)](https://www.codacy.com/manual/yansheng836/wzry2/dashboard?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=yansheng836/wzry2&amp;utm_campaign=Badge_Grade)

具体可参考：<https://github.com/yansheng836/wzry-wallpaper>

---

王者荣耀皮肤壁纸，访问：<http://wzry.yansheng.xyz/image/wallpaper-bigskin.html> 即可返回一个王者荣耀皮肤壁纸，详见<http://wzry.yansheng.xyz/>。启发于bing每日壁纸：<https://api.uixsj.cn/bing/bing.php>。

## API接口说明

API说明详见：<http://wzry.yansheng.xyz/swagger-ui.html> 。

## 1.返回json

### 1.1大尺寸壁纸(1920x882)

`/json/wallpaper-bigskin.html`

返回当天的壁纸的json信息，如（5月28日的数据）：

```json
{
    "id": 149,
    "url": "https://game.gtimg.cn/images/yxzj/img201606/heroimg/168/168-bigskin-4.jpg"
}
```

#### 参数id说明

| 参数值         | 说明                             |
| -------------- | -------------------------------- |
| id=today，不写 | 返回从1月1日到当日天数对应的数据 |
| id=now         | 每次刷新随机获得数据             |
| id=[数字]      | 返回对应的id的数据               |

Example：

<http://wzry.yansheng.xyz/json/wallpaper-bigskin.html>

<http://wzry.yansheng.xyz/json/wallpaper-bigskin.html?id=today>

<http://wzry.yansheng.xyz/json/wallpaper-bigskin.html?id=now>

<http://wzry.yansheng.xyz/json/wallpaper-bigskin.html?id=1>

### 1.2较小尺寸壁纸(1200x530)

`/json/phone-bigskin.html`

```json
{
    "id": 149,
    "url": "https://game.gtimg.cn/images/yxzj/img201606/heroimg/168/168-bigskin-4.jpg"
}
```

参数id同1.1。

Example：

<http://wzry.yansheng.xyz/json/phone-bigskin.html>

<http://wzry.yansheng.xyz/json/phone-bigskin.html?id=today>

<http://wzry.yansheng.xyz/json/phone-bigskin.html?id=now>

<http://wzry.yansheng.xyz/json/phone-bigskin.html?id=1>

## 2.返回图片

### 2.1大尺寸壁纸(1920x882)

`/image/wallpaper-bigskin.html`

参数id同1.1。

Example：

<http://wzry.yansheng.xyz/image/wallpaper-bigskin.html>

<http://wzry.yansheng.xyz/image/wallpaper-bigskin.html?id=today>

<http://wzry.yansheng.xyz/image/wallpaper-bigskin.html?id=now>

<http://wzry.yansheng.xyz/image/wallpaper-bigskin.html?id=1>

### 2.2较小尺寸壁纸(1200x530)

`/image/phone-bigskin.html`

参数id同1.1。

Example：

<http://wzry.yansheng.xyz/image/phone-bigskin.html>

<http://wzry.yansheng.xyz/image/phone-bigskin.html?id=today>

<http://wzry.yansheng.xyz/image/phone-bigskin.html?id=now>

<http://wzry.yansheng.xyz/image/phone-bigskin.html?id=1>

## 3.图片使用说明

### HTML

```html
<img alt="王者荣耀每日壁纸" title="王者荣耀每日壁纸" src="http://wzry.yansheng.xyz/image/wallpaper-bigskin.html"/>
```

<img alt="王者荣耀每日壁纸" title="王者荣耀每日壁纸" src="http://wzry.yansheng.xyz/image/wallpaper-bigskin.html"/>

### MD

```markdown
![王者荣耀每日壁纸](http://wzry.yansheng.xyz/image/wallpaper-bigskin.html)
```

![王者荣耀每日壁纸](http://wzry.yansheng.xyz/image/wallpaper-bigskin.html)

## License

<div style="text-align:left"><img src="https://img.shields.io/badge/license-MIT-green.svg" alter="MIT License" title="MIT License"/></div>

This software is licensed under the MIT License by [yansheng836](<https://github.com/yansheng836>)(Email:[sheng.yan836@gmail.com](mailto:sheng.yan836@gmail.com)). 