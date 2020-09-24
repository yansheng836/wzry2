/*
 Navicat Premium Data Transfer

 Source Server         : 本地MySQL
 Source Server Type    : MySQL
 Source Server Version : 50626
 Source Host           : localhost:3306
 Source Schema         : wzry

 Target Server Type    : MySQL
 Target Server Version : 50626
 File Encoding         : 65001

 Date: 25/09/2020 00:09:49
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for hero
-- ----------------------------
DROP TABLE IF EXISTS `hero`;
CREATE TABLE `hero`  (
  `ename` int(11) NOT NULL COMMENT '英雄ID',
  `cname` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `title` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `new_type` int(11) NULL DEFAULT 0,
  `hero_type` int(11) NULL DEFAULT 0,
  `hero_type2` int(11) NULL DEFAULT 0,
  `skin_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`ename`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of hero
-- ----------------------------
INSERT INTO `hero` VALUES (105, '廉颇', '正义爆轰', 0, 3, NULL, '正义爆轰|地狱岩魂');
INSERT INTO `hero` VALUES (106, '小乔', '恋之微风', 0, 2, NULL, '恋之微风|万圣前夜|天鹅之梦|纯白花嫁|缤纷独角兽');
INSERT INTO `hero` VALUES (107, '赵云', '苍天翔龙', 0, 1, 4, '苍天翔龙|忍●炎影|未来纪元|皇家上将|嘻哈天王|白执事|引擎之心');
INSERT INTO `hero` VALUES (108, '墨子', '和平守望', 0, 2, 3, '和平守望|金属风暴|龙骑士|进击墨子号');
INSERT INTO `hero` VALUES (109, '妲己', '魅力之狐', 0, 2, NULL, '魅惑之狐|女仆咖啡|魅力维加斯|仙境爱丽丝|少女阿狸|热情桑巴');
INSERT INTO `hero` VALUES (110, '嬴政', '王者独尊', 0, 2, NULL, '王者独尊|摇滚巨星|暗夜贵公子|优雅恋人|白昼王子');
INSERT INTO `hero` VALUES (111, '孙尚香', '千金重弩', 0, 5, NULL, '千金重弩|火炮千金|水果甜心|蔷薇恋人|杀手不太冷|末日机甲|沉稳之力');
INSERT INTO `hero` VALUES (112, '鲁班七号', '机关造物', 0, 5, NULL, '机关造物|木偶奇遇记|福禄兄弟|电玩小子|星空梦想');
INSERT INTO `hero` VALUES (113, '庄周', '逍遥梦幻', 0, 6, 3, '逍遥幻梦|鲤鱼之梦|蜃楼王|云端筑梦师');
INSERT INTO `hero` VALUES (114, '刘禅', '暴走机关', 0, 3, NULL, '暴走机关|英喵野望|绅士熊喵|天才门将');
INSERT INTO `hero` VALUES (115, '高渐离', '叛逆吟游', 0, 2, NULL, '叛逆吟游|金属狂潮|死亡摇滚');
INSERT INTO `hero` VALUES (116, '阿轲', '信念之刃', 0, 4, NULL, '信念之刃|爱心护理|暗夜猫娘|致命风华|节奏热浪');
INSERT INTO `hero` VALUES (117, '钟无艳', '野蛮之锤', 0, 1, 3, '野蛮之锤|生化警戒|王者之锤|海滩丽影');
INSERT INTO `hero` VALUES (118, '孙膑', '逆流之时', 0, 6, 2, '逆流之时|未来旅行|天使之翼|妖精王');
INSERT INTO `hero` VALUES (119, '扁鹊', '善恶怪医', 0, 2, 6, '善恶怪医|救世之瞳|化身博士|炼金王');
INSERT INTO `hero` VALUES (120, '白起', '最终兵器', 0, 3, NULL, '最终兵器|白色死神|狰|星夜王子');
INSERT INTO `hero` VALUES (121, '芈月', '永恒之月', 0, 2, 3, '永恒之月|红桃皇后|大秦宣太后|重明');
INSERT INTO `hero` VALUES (123, '吕布', '无双之魔', 0, 1, 3, '无双之魔|圣诞狂欢|天魔缭乱|末日机甲|猎兽之王');
INSERT INTO `hero` VALUES (124, '周瑜', '铁血都督', 0, 2, NULL, '铁血都督|海军大将|真爱至上');
INSERT INTO `hero` VALUES (125, '元歌', '无间傀儡', 0, 4, NULL, '无间傀儡|午夜歌剧院');
INSERT INTO `hero` VALUES (126, '夏侯惇', '不羁之风', 0, 3, 1, '不羁之风|战争骑士|乘风破浪|无限飓风号');
INSERT INTO `hero` VALUES (127, '甄姬', '洛神降临', 0, 2, NULL, '洛神降临|冰雪圆舞曲|花好人间|游园惊梦');
INSERT INTO `hero` VALUES (128, '曹操', '鲜血枭雄', 0, 1, NULL, '鲜血枭雄|超能战警|幽灵船长|死神来了|烛龙');
INSERT INTO `hero` VALUES (129, '典韦', '狂战士', 0, 1, NULL, '狂战士|黄金武士|穷奇');
INSERT INTO `hero` VALUES (130, '宫本武藏', '剑圣', 0, 1, NULL, '剑圣|鬼剑武藏|未来纪元|万象初新|地狱之眼|霸王丸');
INSERT INTO `hero` VALUES (131, '李白', '青莲剑仙', 0, 4, 1, '青莲剑仙|范海辛|千年之狐|凤求凰|敏锐之力');
INSERT INTO `hero` VALUES (132, '马可波罗', '远游之枪', 0, 5, NULL, '远游之枪|激情绿茵|逐梦之星');
INSERT INTO `hero` VALUES (133, '狄仁杰', '断案大师', 0, 5, NULL, '断案大师|锦衣卫|魔术师|超时空战士|阴阳师');
INSERT INTO `hero` VALUES (134, '达摩', '拳僧', 0, 1, 3, '拳僧|大发明家|拳王');
INSERT INTO `hero` VALUES (135, '项羽', '霸王', 0, 3, NULL, '霸王|帝国元帅|苍穹之光|海滩派对|职棒王牌|霸王别姬|科学大爆炸');
INSERT INTO `hero` VALUES (136, '武则天', '女帝', 0, 2, NULL, '女帝|东方不败|海洋之心');
INSERT INTO `hero` VALUES (137, '司马懿', '寂灭之心', 0, 4, 2, '寂灭之心|魇语军师');
INSERT INTO `hero` VALUES (139, '老夫子', '万古长明', 0, 1, NULL, '万古长明|潮流仙人|圣诞老人|功夫老勺');
INSERT INTO `hero` VALUES (140, '关羽', '一骑当千', 0, 1, 3, '一骑当千|天启骑士|冰锋战神|龙腾万里');
INSERT INTO `hero` VALUES (141, '貂蝉', '绝世舞姬', 0, 2, 4, '绝世舞姬|异域舞娘|圣诞恋歌|逐梦之音|仲夏夜之梦');
INSERT INTO `hero` VALUES (142, '安琪拉', '暗夜萝莉', 0, 2, NULL, '暗夜萝莉|玩偶对对碰|魔法小厨娘|心灵骇客|如懿');
INSERT INTO `hero` VALUES (144, '程咬金', '热烈之斧', 0, 3, 1, '热烈之斧|爱与正义|星际陆战队|华尔街大亨|功夫厨神');
INSERT INTO `hero` VALUES (146, '露娜', '月光之女', 0, 1, 2, '月光之女|哥特玫瑰|绯红之刃|紫霞仙子|一生所爱');
INSERT INTO `hero` VALUES (148, '姜子牙', '太古魔导', 0, 2, 6, '太古魔导|时尚教父');
INSERT INTO `hero` VALUES (149, '刘邦', '双面君主', 0, 3, 6, '双面君主|圣殿之光|德古拉伯爵');
INSERT INTO `hero` VALUES (150, '韩信', '国士无双', 0, 4, 1, '国士无双|街头霸王|教廷特使|白龙吟|逐梦之影');
INSERT INTO `hero` VALUES (152, '王昭君', '冰雪之华', 0, 2, NULL, '冰雪之华|精灵公主|偶像歌手|凤凰于飞|幻想奇妙夜');
INSERT INTO `hero` VALUES (153, '兰陵王', '暗影刀锋', 0, 4, NULL, '暗影刀锋|隐刃|暗隐猎兽者');
INSERT INTO `hero` VALUES (154, '花木兰', '传说之刃', 0, 1, 4, '传说之刃|剑舞者|兔女郎|水晶猎龙者|青春决赛季|冠军飞将|瑞麟志');
INSERT INTO `hero` VALUES (156, '张良', '言灵之书', 0, 2, NULL, '言灵之书|天堂福音|一千零一夜|幽兰居士');
INSERT INTO `hero` VALUES (157, '不知火舞', '明媚烈焰', 0, 2, 4, '明媚烈焰');
INSERT INTO `hero` VALUES (162, '娜可露露', '鹰之守护', 0, 4, NULL, '鹰之守护');
INSERT INTO `hero` VALUES (163, '橘右京', '神梦一刀', 0, 4, 1, '神梦一刀');
INSERT INTO `hero` VALUES (166, '亚瑟', '圣骑之力', 0, 1, 3, '圣骑之力|死亡骑士|狮心王|心灵战警');
INSERT INTO `hero` VALUES (167, '孙悟空', '齐天大圣', 0, 1, 4, '齐天大圣|地狱火|西部大镖客|美猴王|至尊宝|全息碎影|大圣娶亲');
INSERT INTO `hero` VALUES (168, '牛魔', '精英酋长', 0, 3, 6, '精英酋长|西部大镖客|制霸全明星');
INSERT INTO `hero` VALUES (169, '后羿', '半神之弓', 0, 5, NULL, '半神之弓|精灵王|阿尔法小队|辉光之辰|黄金射手座');
INSERT INTO `hero` VALUES (170, '刘备', '仁德义枪', 0, 1, NULL, '仁德义枪|万事如意|纽约教父|汉昭烈帝');
INSERT INTO `hero` VALUES (171, '张飞', '禁血狂兽', 0, 3, 6, '禁血狂兽|五福同心|乱世虎臣');
INSERT INTO `hero` VALUES (173, '李元芳', '王都密探', 0, 5, NULL, '王都密探|特种部队|黑猫爱糖果|逐浪之夏');
INSERT INTO `hero` VALUES (174, '虞姬', '森之风灵', 0, 5, NULL, '森之风灵|加勒比小姐|霸王别姬|凯尔特女王');
INSERT INTO `hero` VALUES (175, '钟馗', '虚灵城判', 0, 2, 1, '虚灵城判|地府判官');
INSERT INTO `hero` VALUES (176, '杨玉环', '霓裳风华', 0, 2, 6, '风华霓裳|霓裳曲|遇见飞天');
INSERT INTO `hero` VALUES (177, '成吉思汗', '苍狼末裔', 0, 5, NULL, '苍狼末裔|维京掠夺者');
INSERT INTO `hero` VALUES (178, '杨戬', '根源之目', 0, 1, NULL, '根源之目|埃及法老|永曜之星');
INSERT INTO `hero` VALUES (179, '女娲', '至高创世', 0, 2, NULL, '至高创世|尼罗河女神');
INSERT INTO `hero` VALUES (180, '哪吒', '桀骜炎枪', 0, 1, NULL, '桀骜炎枪|三太子|逐梦之翼');
INSERT INTO `hero` VALUES (182, '干将莫邪', '淬命双剑', 0, 2, NULL, '淬命双剑|第七人偶|冰霜恋舞曲');
INSERT INTO `hero` VALUES (183, '雅典娜', '圣域余晖', 0, 1, NULL, '圣域余晖|战争女神|冰冠公主|神奇女侠');
INSERT INTO `hero` VALUES (184, '蔡文姬', '天籁弦音', 0, 6, NULL, '天籁弦音|蔷薇王座|舞动绿茵|奇迹圣诞');
INSERT INTO `hero` VALUES (186, '太乙真人', '炼金大师', 0, 6, 3, '炼金大师|圆桌骑士|饕餮|华丽摇滚');
INSERT INTO `hero` VALUES (187, '东皇太一', '噬灭日蚀', 0, 3, NULL, '噬灭日蚀|东海龙王|逐梦之光');
INSERT INTO `hero` VALUES (189, '鬼谷子', '万物有灵', 0, 6, NULL, '万物有灵|阿摩司公爵|幻乐之宴');
INSERT INTO `hero` VALUES (190, '诸葛亮', '绝代智谋', 0, 2, NULL, '绝代智谋|星航指挥官|黄金分割率|武陵仙君|掌控之力');
INSERT INTO `hero` VALUES (191, '大乔', '沧海之曜', 0, 6, NULL, '沧海之曜|伊势巫女|守护之力|猫狗日记');
INSERT INTO `hero` VALUES (192, '黄忠', '燃魂重炮', 0, 5, NULL, '燃魂重炮|芝加哥教父');
INSERT INTO `hero` VALUES (193, '铠', '破灭刃锋', 0, 1, 3, '破灭刃锋|龙域领主|曙光守护者|青龙志');
INSERT INTO `hero` VALUES (194, '苏烈', '不屈铁壁', 0, 3, 1, '不屈铁壁|爱与和平|坚韧之力|玄武志');
INSERT INTO `hero` VALUES (195, '百里玄策', '嚣狂之镰', 0, 4, NULL, '嚣狂之镰|威尼斯狂欢|白虎志');
INSERT INTO `hero` VALUES (196, '百里守约', '静谧之眼', 0, 5, 4, '静谧之眼|绝影神枪|特工魅影|朱雀志');
INSERT INTO `hero` VALUES (197, '弈星', '天元之弈', 0, 2, NULL, '天元之弈|踏雪寻梅');
INSERT INTO `hero` VALUES (198, '梦奇', '入梦之灵', 0, 3, 2, '入梦之灵|美梦成真|胖达荣荣');
INSERT INTO `hero` VALUES (199, '公孙离', '幻舞玲珑', 0, 5, NULL, '幻舞玲珑|花间舞|蜜橘之夏');
INSERT INTO `hero` VALUES (312, '沈梦溪', '爆弹怪猫', 0, 2, NULL, '爆弹怪猫|棒球奇才');
INSERT INTO `hero` VALUES (501, '明世隐', '灵魂劫卜', 0, 6, NULL, '灵魂劫卜|占星术士|虹云星官');
INSERT INTO `hero` VALUES (502, '裴擒虎', '六合虎拳', 0, 4, 1, '六合虎拳|街头霸王|梅西');
INSERT INTO `hero` VALUES (503, '狂铁', '战车意志', 0, 1, NULL, '战车意志|命运角斗场|御狮');
INSERT INTO `hero` VALUES (504, '米莱狄', '筑城者', 0, 2, NULL, '筑城者|精准探案法|御霄');
INSERT INTO `hero` VALUES (505, '瑶', '鹿灵守心', 0, 6, NULL, '森');
INSERT INTO `hero` VALUES (506, '云中君', '流云之翼', 0, 4, 1, '荷鲁斯之眼');
INSERT INTO `hero` VALUES (507, '李信', '谋世之战', 0, 1, 4, '谋世之战|灼热之刃');
INSERT INTO `hero` VALUES (508, '伽罗', '破魔之箭', 0, 5, NULL, '破魔之箭|花见巫女');
INSERT INTO `hero` VALUES (509, '盾山', '无尽之盾', 0, 6, NULL, '无尽之盾|极冰防御线');
INSERT INTO `hero` VALUES (510, '孙策', '光明之海', 0, 3, 1, '光明之海|海之征途|猫狗日记');
INSERT INTO `hero` VALUES (511, '猪八戒', '无忧猛士', 0, 3, NULL, '无忧猛士|年年有余');
INSERT INTO `hero` VALUES (513, '上官婉儿', '惊鸿之笔', 0, 2, 4, '惊鸿之笔|修竹墨客');
INSERT INTO `hero` VALUES (515, '嫦娥', '寒月公主', 0, 2, 3, '寒月公主|露花倒影');
INSERT INTO `hero` VALUES (518, '马超', '冷晖之枪', 1, 1, 4, NULL);
INSERT INTO `hero` VALUES (522, '曜', '星辰之子', 0, 1, NULL, '归虚梦演');
INSERT INTO `hero` VALUES (529, '盘古', '破晓之神', 0, 1, NULL, '破晓之神');

SET FOREIGN_KEY_CHECKS = 1;
