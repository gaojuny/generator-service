package com.hfmoney.generatorservice;

import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.util.*;

/**
 * @author: gaojun
 * @date: 2019/3/27 14:35
 * @description:
 */
public class GeneratorService {

    private static String words = "我们鲁镇的习惯本来是凡有出嫁的女儿倘自己还未当家夏间便大抵回到母家去消夏那时我的祖母虽然还康建但母亲也已分担了些家务所以夏期便不能多日的归省了只得在扫墓完毕之后抽空去住几天这时我便每年跟了我的母亲住在外祖母的家里那地方叫平桥村是一个离海边不远极偏僻的临河的小村庄；住户不满三十家都种田打鱼只有一家很小的杂货店但在我是乐土：因为我在这里不但得到优待又可以免念“秩秩斯干幽幽南山”了" +
            "和我一同玩的是许多小朋友因为有了远客他们也都从父母那里得了减少工作的许可伴我来游戏在小村里一家的客几乎也就是公共的我们年纪都相仿但论起行辈来却至少是叔子有几个还是太公因为他们合村都同姓是本家然而我们是朋友即使偶而吵闹起来打了太公一村的老老少少也决没有一个会想出犯上这两个字来而他们也百分之九十九不识字" +
            "我们每天的事情大概是掘蚯蚓掘来穿在铜丝做的小钩上伏在河沿上去钓虾虾是水世界里的呆子决不惮用了自己的两个钳捧着钩尖送到嘴里去的所以不半天便可以钓到一大碗这虾照例是归我吃的其次便是一同去放牛但或者因为高等动物了的缘故罢黄牛水牛都欺生敢于欺侮我因此我也总不敢走近身只好远远地跟着站着这时候小朋友们便不再原谅我会读秩秩斯干却全都嘲笑起来了" +
            "至于我在那里所第一盼望的却在到赵庄去看戏赵庄是离平桥村五里的较大的村庄；平桥村太小自己演不起戏每年总付给赵庄多少钱算作合做的当时我并不想到他们为什么年年要演戏现在想那或者是春赛是社戏⑹了" +
            "就在我十一二岁时候的这一年这日期也看看等到了不料这一年真可惜在早上就叫不到船平桥村只有一只早出晚归的航船是大船决没有留用的道理其余的都是小船不合用；央人到邻村去问也没有早都给别人定下了外祖母很气恼怪家里的人不早定絮叨起来母亲便宽慰伊说我们鲁镇的戏比小村里的好得多一年看几回今天就算了只有我急得要哭母亲却竭力的嘱咐我说万不能装模装样怕又招外祖母生气又不准和别人一同去说是怕外祖母要担心" +
            "总之是完了到下午我的朋友都去了戏已经开场了我似乎听到锣鼓的声音而且知道他们在戏台下买豆浆喝" +
            "这一天我不钓虾东西也少吃母亲很为难没有法子想到晚饭时候外祖母也终于觉察了并且说我应当不高兴他们太怠慢是待客的礼数里从来没有的吃饭之后看过戏的少年们也都聚拢来了高高兴兴的来讲戏只有我不开口；他们都叹息而且表同情忽然间一个最聪明的双喜大悟似的提议了他说大船八叔的航船不是回来了么十几个别的少年也大悟立刻撺掇起来说可以坐了这航船和我一同去我高兴了然而外祖母又怕都是孩子不可靠；母亲又说是若叫大人一同去他们白天全有工作要他熬夜是不合情理的在这迟疑之中双喜可又看出底细来了便又大声的说道我写包票！船又大；迅哥儿向来不乱跑；我们又都是识水性的！" +
            "诚然！这十多个少年委实没有一个不会凫水的而且两三个还是弄潮的好手" +
            "外祖母和母亲也相信便不再驳回都微笑了我们立刻一哄的出了门" +
            "我的很重的心忽而轻松了身体也似乎舒展到说不出的大一出门便望见月下的平桥内泊着一只白篷的航船大家跳下船双喜拔前篙阿发拔后篙年幼的都陪我坐在舱中较大的聚在船尾母亲送出来吩咐要小心的时候我们已经点开船在桥石上一磕退后几尺即又上前出了桥于是架起两支橹一支两人一里一换有说笑的有嚷的夹着潺潺的船头激水的声音在左右都是碧绿的豆麦田地的河流中飞一般径向赵庄前进了" +
            "两岸的豆麦和河底的水草所发散出来的清香夹杂在水气中扑面的吹来；月色便朦胧在这水气里淡黑的起伏的连山仿佛是踊跃的铁的兽脊似的都远远的向船尾跑去了但我却还以为船慢他们换了四回手渐望见依稀的赵庄而且似乎听到歌吹了还有几点火料想便是戏台但或者也许是渔火" +
            "那声音大概是横笛宛转悠扬使我的心也沉静然而又自失起来觉得要和他弥散在含着豆麦蕴藻之香的夜气里" +
            "那火接近了果然是渔火；我才记得先前望见的也不是赵庄那是正对船头的一丛松柏林我去年也曾经去游玩过还看见破的石马倒在地下一个石羊蹲在草里呢过了那林船便弯进了叉港于是赵庄便真在眼前了" +
            "最惹眼的是屹立在庄外临河的空地上的一座戏台模胡在远处的月夜中和空间几乎分不出界限我疑心画上见过的仙境就在这里出现了这时船走得更快不多时在台上显出人物来红红绿绿的动近台的河里一望乌黑的是看戏的人家的船篷" +
            "近台没有什么空了我们远远的看罢阿发说" +
            "这时船慢了不久就到果然近不得台旁大家只能下了篙比那正对戏台的神棚还要远其实我们这白篷的航船本也不愿意和乌篷的船在一处而况没有空地呢……" +
            "在停船的匆忙中看见台上有一个黑的长胡子的背上插着四张旗捏着长枪和一群赤膊的人正打仗双喜说那就是有名的铁头老生能连翻八十四个筋斗他日里亲自数过的" +
            "我们便都挤在船头上看打仗但那铁头老生却又并不翻筋斗只有几个赤膊的人翻翻了一阵都进去了接着走出一个小旦来咿咿呀呀的唱双喜说晚上看客少铁头老生也懈了谁肯显本领给白地看呢我相信这话对因为其时台下已经不很有人乡下人为了明天的工作熬不得夜早都睡觉去了疏疏朗朗的站着的不过是几十个本村和邻村的闲汉乌篷船里的那些土财主的家眷固然在然而他们也不在乎看戏多半是专到戏台下来吃糕饼水果和瓜子的所以简直可以算白地" +
            "然而我的意思却也并不在乎看翻筋斗我最愿意看的是一个人蒙了白布两手在头上捧着一支棒似的蛇头的蛇精其次是套了黄布衣跳老虎但是等了许多时都不见小旦虽然进去了立刻又出来了一个很老的小生我有些疲倦了托桂生买豆浆去他去了一刻回来说没有卖豆浆的聋子也回去了日里倒有我还喝了两碗呢现在去舀一瓢水来给你喝罢" +
            "我不喝水支撑着仍然看也说不出见了些什么只觉得戏子的脸都渐渐的有些稀奇了那五官渐不明显似乎融成一片的再没有什么高低年纪小的几个多打呵欠了大的也各管自己谈话忽而一个红衫的小丑被绑在台柱子上给一个花白胡子的用马鞭打起来了大家才又振作精神的笑着看在这一夜里我以为这实在要算是最好的一折" +
            "然而老旦终于出台了老旦本来是我所最怕的东西尤其是怕他坐下了唱这时候看见大家也都很扫兴才知道他们的意见是和我一致的那老旦当初还只是踱来踱去的唱后来竟在中间的一把交椅上坐下了我很担心；双喜他们却就破口喃喃的骂我忍耐的等着许多工夫只见那老旦将手一抬我以为就要站起来了不料他却又慢慢的放下在原地方仍旧唱全船里几个人不住的吁气其余的也打起哈欠来双喜终于熬不住了说道怕他会唱到天明还不完还是我们走的好罢大家立刻都赞成和开船时候一样踊跃三四人径奔船尾拔了篙点退几丈回转船头驾起橹骂着老旦又向那松柏林前进了" +
            "月还没有落仿佛看戏也并不很久似的而一离赵庄月光又显得格外的皎洁回望戏台在灯火光中却又如初来未到时候一般又漂渺得像一座仙山楼阁满被红霞罩着了吹到耳边来的又是横笛很悠扬；我疑心老旦已经进去了但也不好意思说再回去看" +
            "不多久松柏林早在船后了船行也并不慢但周围的黑暗只是浓可知已经到了深夜他们一面议论着戏子或骂或笑一面加紧的摇船这一次船头的激水声更其响亮了那航船就像一条大白鱼背着一群孩子在浪花里蹿连夜渔的几个老渔父也停了艇子看着喝采起来" +
            "离平桥村还有一里模样船行却慢了摇船的都说很疲乏因为太用力而且许久没有东西吃这回想出来的是桂生说是罗汉豆⑺正旺相柴火又现成我们可以偷一点来煮吃大家都赞成立刻近岸停了船；岸上的田里乌油油的都是结实的罗汉豆" +
            "阿阿阿发这边是你家的这边是老六一家的我们偷那一边的呢双喜先跳下去了在岸上说" +
            "我们也都跳上岸阿发一面跳一面说道且慢让我来看一看罢他于是往来的摸了一回直起身来说道偷我们的罢我们的大得多呢一声答应大家便散开在阿发家的豆田里各摘了一大捧抛入船舱中双喜以为再多偷倘给阿发的娘知道是要哭骂的于是各人便到六一公公的田里又各偷了一大捧" +
            "我们中间几个年长的仍然慢慢的摇着船几个到后舱去生火年幼的和我都剥豆不久豆熟了便任凭航船浮在水面上都围起来用手撮着吃吃完豆又开船一面洗器具豆荚豆壳全抛在河水里什么痕迹也没有了双喜所虑的是用了八公公船上的盐和柴这老头子很细心一定要知道会骂的然而大家议论之后归结是不怕他如果骂我们便要他归还去年在岸边拾去的一枝枯桕树而且当面叫他八癞子" +
            "都回来了！那里会错我原说过写包票的！双喜在船头上忽而大声的说" +
            "我向船头一望前面已经是平桥桥脚上站着一个人却是我的母亲双喜便是对伊说着话我走出前舱去船也就进了平桥了停了船我们纷纷都上岸母亲颇有些生气说是过了三更了怎么回来得这样迟但也就高兴了笑着邀大家去吃炒米" +
            "大家都说已经吃了点心又渴睡不如及早睡的好各自回去了" +
            "第二天我向午才起来并没有听到什么关系八公公盐柴事件的纠葛下午仍然去钓虾" +
            "双喜你们这班小鬼昨天偷了我的豆了罢又不肯好好的摘蹋坏了不少我抬头看时是六一公公棹着小船卖了豆回来了船肚里还有剩下的一堆豆" +
            "是的我们请客我们当初还不要你的呢你看你把我的虾吓跑了！双喜说" +
            "六一公公看见我便停了楫笑道请客这是应该的于是对我说迅哥儿昨天的戏可好么" +
            "我点一点头说道好" +
            "豆可中吃呢" +
            "我又点一点头说道很好" +
            "不料六一公公竟非常感激起来将大拇指一翘得意的说道这真是大市镇里出来的读过书的人才识货！我的豆种是粒粒挑选过的乡下人不识好歹还说我的豆比不上别人的呢我今天也要送些给我们的姑奶奶尝尝去……他于是打着楫子过去了" +
            "待到母亲叫我回去吃晚饭的时候桌上便有一大碗煮熟了的罗汉豆就是六一公公送给母亲和我吃的听说他还对母亲极口夸奖我说小小年纪便有见识将来一定要中状元姑奶奶你的福气是可以写包票的了但我吃了豆却并没有昨夜的豆那么好" +
            "真的一直到现在我实在再没有吃到那夜似的好豆——也不再看到那夜似的好戏了" +
            "一九二二年十月身份证号是啥户籍所在地根据随机布尔值确定名字是一个字还是两个字方法用于从该随机数生成器的序列得到下一个伪均匀分布的布尔值";

    /**
     * 随机生成名字+身份证号
     *
     * @param dataLength
     * @return
     */
    public static List<NameData> makeData(int dataLength) {
        // 写一个百家姓的数组
        String[] Surname = {"赵", "钱", "孙", "李", "周", "吴", "郑", "王", "冯", "陈", "褚", "卫", "蒋", "沈",
                "韩", "杨", "朱", "秦", "尤", "许", "何", "吕", "施", "张", "孔", "曹", "严", "华", "金", "魏", "陶",
                "姜", "戚", "谢", "邹", "喻", "柏", "水", "窦", "章", "云", "苏", "潘", "葛", "奚", "范", "彭", "郎",
                "鲁", "韦", "昌", "马", "苗", "凤", "花", "方", "俞", "任", "袁", "柳", "酆", "鲍", "史", "唐", "费",
                "廉", "岑", "薛", "雷", "贺", "倪", "汤", "滕", "殷", "罗", "毕", "郝", "邬", "安", "常", "乐", "于",
                "时", "傅", "皮", "卞", "齐", "康", "伍", "余", "元", "卜", "顾", "孟", "平", "黄", "和", "穆", "萧",
                "尹", "姚", "邵", "湛", "汪", "祁", "毛", "禹", "狄", "米", "贝", "明", "臧", "计", "伏", "成", "戴",
                "谈", "宋", "茅", "庞", "熊", "纪", "舒", "屈", "项", "祝", "董", "梁", "杜", "阮", "蓝", "闵", "席",
                "季", "麻", "强", "贾", "路", "娄", "危", "江", "童", "颜", "郭", "梅", "盛", "林", "刁", "钟", "徐",
                "邱", "骆", "高", "夏", "蔡", "田", "樊", "胡", "凌", "霍", "虞", "万", "支", "柯", "昝", "管", "卢",
                "莫", "经", "房", "裘", "缪", "干", "解", "应", "宗", "丁", "宣", "贲", "邓", "郁", "单", "杭", "洪",
                "包", "诸", "左", "石", "崔", "吉", "钮", "龚", "程", "嵇", "邢", "滑", "裴", "陆", "荣", "翁", "荀",
                "羊", "于", "惠", "甄", "曲", "家", "封", "芮", "羿", "储", "靳", "汲", "邴", "糜", "松", "井", "段",
                "富", "巫", "乌", "焦", "巴", "弓", "牧", "隗", "山", "谷", "车", "侯", "宓", "蓬", "全", "郗", "班",
                "仰", "秋", "仲", "伊", "宫", "宁", "仇", "栾", "暴", "甘", "钭", "厉", "戎", "祖", "武", "符", "刘",
                "景", "詹", "束", "龙", "叶", "幸", "司", "韶", "郜", "黎", "蓟", "溥", "印", "宿", "白", "怀", "蒲",
                "邰", "从", "鄂", "索", "咸", "籍", "赖", "卓", "蔺", "屠", "蒙", "池", "乔", "阴", "郁", "胥", "能",
                "苍", "双", "闻", "莘", "党", "翟", "谭", "贡", "劳", "逄", "姬", "申", "扶", "堵", "冉", "宰", "郦",
                "雍", "却", "璩", "桑", "桂", "濮", "牛", "寿", "通", "边", "扈", "燕", "冀", "浦", "尚", "农", "温",
                "别", "庄", "晏", "柴", "瞿", "阎", "充", "慕", "连", "茹", "习", "宦", "艾", "鱼", "容", "向", "古",
                "易", "慎", "戈", "廖", "庾", "终", "暨", "居", "衡", "步", "都", "耿", "满", "弘", "匡", "国", "文",
                "寇", "广", "禄", "阙", "东", "欧", "殳", "沃", "利", "蔚", "越", "夔", "隆", "师", "巩", "厍", "聂",
                "晁", "勾", "敖", "融", "冷", "訾", "辛", "阚", "那", "简", "饶", "空", "曾", "毋", "沙", "乜", "养",
                "鞠", "须", "丰", "巢", "关", "蒯", "相", "查", "后", "荆", "红", "游", "郏", "竺", "权", "逯", "盖",
                "益", "桓", "公", "仉", "督", "岳", "帅", "缑", "亢", "况", "郈", "有", "琴", "归", "海", "晋", "楚",
                "闫", "法", "汝", "鄢", "涂", "钦", "商", "牟", "佘", "佴", "伯", "赏", "墨", "哈", "谯", "篁", "年",
                "爱", "阳", "佟", "言", "福", "南", "火", "铁", "迟", "漆", "官", "冼", "真", "展", "繁", "檀", "祭",
                "密", "敬", "揭", "舜", "楼", "疏", "冒", "浑", "挚", "胶", "随", "高", "皋", "原", "种", "练", "弥",
                "仓", "眭", "蹇", "覃", "阿", "门", "恽", "来", "綦", "召", "仪", "风", "介", "巨", "木", "京", "狐",
                "郇", "虎", "枚", "抗", "达", "杞", "苌", "折", "麦", "庆", "过", "竹", "端", "鲜", "皇", "亓", "老",
                "是", "秘", "畅", "邝", "还", "宾", "闾", "辜", "纵", "侴", "万俟", "司马", "上官", "欧阳", "夏侯",
                "诸葛", "闻人", "东方", "赫连", "皇甫", "羊舌", "尉迟", "公羊", "澹台", "公冶", "宗正", "濮阳", "淳于", "单于",
                "太叔", "申屠", "公孙", "仲孙", "轩辕", "令狐", "钟离", "宇文", "长孙", "慕容", "鲜于", "闾丘", "司徒", "司空",
                "兀官", "司寇", "南门", "呼延", "子车", "颛孙", "端木", "巫马", "公西", "漆雕", "车正", "壤驷", "公良", "拓跋",
                "夹谷", "宰父", "谷梁", "段干", "百里", "东郭", "微生", "梁丘", "左丘", "东门", "西门", "南宫", "第五", "公仪",
                "公乘", "太史", "仲长", "叔孙", "屈突", "尔朱", "东乡", "相里", "胡母", "司城", "张廖", "雍门", "毋丘", "贺兰",
                "綦毋", "屋庐", "独孤", "南郭", "北宫", "王孙"};
        Random random = new Random(System.currentTimeMillis());

        // List集合存储姓名+身份证号实体类
        List<NameData> nameDataList = new ArrayList<>();
        // 循环dataLength 我要生成这么多数据量的数据
        for (int i = 0; i < dataLength; i++) {
            // 随机取得一个姓氏
            int index = random.nextInt(Surname.length - 1);
            String nameSur = Surname[index];
            String name = nameSur;
            NameData nameData = new NameData();
            // nextBoolean() 方法用于从该随机数生成器的序列得到下一个伪均匀分布的布尔值
            // 根据随机布尔值确定名字是一个字还是两个字
            if (random.nextBoolean()) {
                name += getName() + getName();
            } else {
                name += getName();
            }
            nameData.setName(name);
            // 再给每个生成的名字加个随机身份证号
            String idCardNumber = makeidCardNumber();
            nameData.setIdCardNumber(idCardNumber);
            nameDataList.add(nameData);
            nameData.setPhoneNumber(getTel());
            Map<String, String> bankInfo = getBankAccount();
            nameData.setBankAccount(bankInfo.get("code"));
            nameData.setBankName(bankInfo.get("name"));
            //System.out.println(name + ":" + idCardNumber);
        }
        return nameDataList;
    }

    /**
     * 随机获取一个汉字来组成名字
     *
     * @return
     */
    public static String getName() {
        String nameStr = "";
//        int highCode, lowCode;
//        Random random = new Random();
//        // 区码0xA0打头从第16区开始即0xB0=11*16=176,16~55一级汉字56~87二级汉字
//        highCode = (176 + Math.abs(random.nextInt(71)));
//        random = new Random();
//        // 位码0xA0打头范围第1~94列
//        lowCode = 161 + Math.abs(random.nextInt(94));
//
//        byte[] codeArr = new byte[2];
//        codeArr[0] = (new Integer(highCode)).byteValue();
//        codeArr[1] = (new Integer(lowCode)).byteValue();
//        try {
//            // 区位码组合成汉字
//            nameStr = new String(codeArr, "GB2312");
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
        int length = words.length();
        Random random = new Random();
        nameStr = String.valueOf(words.charAt(random.nextInt(length - 1)));
        return nameStr;
    }

    /**
     * 随机生成身份证号
     *
     * @return
     */
    private static String makeidCardNumber() {
        // 身份证号是啥户籍所在地（第1到第6位） + 出生日期（第7到第14位） + 落户派出所代码（第15、16位） + 性别代码（第17位） + 验证码（第18位）
        // 户籍所在地(以北京为例)
        Map<String, Integer> registerLocation = new HashMap<>();
        registerLocation.put("北京市", 110000);
        registerLocation.put("市辖区", 110100);
        registerLocation.put("东城区", 110101);
        registerLocation.put("西城区", 110102);
        registerLocation.put("崇文区", 110103);
        registerLocation.put("宣武区", 110104);
        registerLocation.put("朝阳区", 110105);
        registerLocation.put("丰台区", 110106);
        registerLocation.put("石景山区", 110107);
        registerLocation.put("海淀区", 110108);
        registerLocation.put("门头沟区", 110109);
        registerLocation.put("房山区", 110111);
        registerLocation.put("通州区", 110112);
        registerLocation.put("顺义区", 110113);
        registerLocation.put("昌平区", 110114);
        registerLocation.put("大兴区", 110115);
        registerLocation.put("怀柔区", 110116);
        registerLocation.put("平谷区", 110117);
        registerLocation.put("县", 110200);
        registerLocation.put("密云县", 110228);
        registerLocation.put("延庆县", 110229);
        registerLocation.put("天津市", 120000);
        registerLocation.put("市辖区", 120100);
        registerLocation.put("和平区", 120101);
        registerLocation.put("河东区", 120102);
        registerLocation.put("河西区", 120103);
        registerLocation.put("南开区", 120104);
        registerLocation.put("河北区", 120105);
        registerLocation.put("红桥区", 120106);
        registerLocation.put("东丽区", 120110);
        registerLocation.put("西青区", 120111);
        registerLocation.put("津南区", 120112);
        registerLocation.put("北辰区", 120113);
        registerLocation.put("武清区", 120114);
        registerLocation.put("宝坻区", 120115);
        registerLocation.put("县", 120200);
        registerLocation.put("宁河县", 120221);
        registerLocation.put("静海县", 120223);
        registerLocation.put("蓟　县", 120225);
        registerLocation.put("公安县", 421022);

        StringBuffer strBuffer = new StringBuffer();
        // 区号
        strBuffer.append(randomLocationCode(registerLocation));
        // 身份证号
        strBuffer.append(randomBirthday());
        // 15、16、17位
        strBuffer.append(randomCode());
        // 利用前十七位获取第十八位
        String eighteenth = verificationCode(strBuffer.toString());
        strBuffer.append(eighteenth);
        return strBuffer.toString();
    }

    /**
     * 随机获取区号
     *
     * @param registerLocation
     * @return
     */
    public static String randomLocationCode(Map<String, Integer> registerLocation) {
        int index = (int) (Math.random() * registerLocation.size());
        Collection<Integer> values = registerLocation.values();
        Iterator<Integer> it = values.iterator();
        int i = 0;
        int locationCode = 0;
        while (i <= index && it.hasNext()) {
            if (i == index) {
                locationCode = it.next();
                break;
            }
            i++;
        }
        return String.valueOf(locationCode);
    }

    /**
     * 随机生成出生日期
     *
     * @return
     */
    public static String randomBirthday() {
        Calendar birthday = Calendar.getInstance();
        birthday.set(Calendar.YEAR, (int) (Math.random() * 60) + 1950);
        birthday.set(Calendar.MONTH, (int) (Math.random() * 12));
        birthday.set(Calendar.DATE, (int) (Math.random() * 31));

        StringBuilder builder = new StringBuilder();
        builder.append(birthday.get(Calendar.YEAR));
        long month = birthday.get(Calendar.MONTH) + 1;
        if (month < 10) {
            builder.append("0");
        }
        builder.append(month);
        long date = birthday.get(Calendar.DATE);
        if (date < 10) {
            builder.append("0");
        }
        builder.append(date);
        return builder.toString();
    }

    /**
     * 随机获取落户派出所代码（第15、16位） + 性别代码（第17位）
     * 直接生成三位数
     *
     * @return
     */
    public static String randomCode() {
        int code = (int) (Math.random() * 1000);
        if (code < 10) {
            return "00" + code;
        } else if (code < 100) {
            return "0" + code;
        } else {
            return "" + code;
        }
    }

    /**
     * 生成第18位身份证号
     *
     * @param str17
     * @return 身份证校验码的计算方法
     * 将前面的身份证号码17位数分别乘以不同的系数从第一位到第十七位的系数分别为：7－9－10－5－8－4－2－1－6－3－7－9－10－5－8－4－2
     * 将这17位数字和系数相乘的结果相加
     * 用加出来和除以11看余数是多少
     * 余数只可能有0－1－2－3－4－5－6－7－8－9－10这11个数字
     * 其分别对应的最后一位身份证的号码为1－0－X －9－8－7－6－5－4－3－2
     */
    public static String verificationCode(String str17) {
        char[] chars = str17.toCharArray();
        if (chars.length < 17) {
            return " ";
        }
        // 前十七位分别对应的系数
        int[] coefficient = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
        // 最后应该取得的第十八位的验证码
        char[] resultChar = {'1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2'};
        int[] numberArr = new int[17];
        int result = 0;
        for (int i = 0; i < numberArr.length; i++) {
            numberArr[i] = Integer.parseInt(chars[i] + "");
        }
        for (int i = 0; i < numberArr.length; i++) {
            result += coefficient[i] * numberArr[i];
        }
        return String.valueOf(resultChar[result % 11]);
    }

    /**
     * 返回手机号码
     */
    private static String[] telFirst = "134,135,136,137,138,139,150,151,152,157,158,159,130,131,132,155,156,133,153".split(",");

    private static String getTel() {
        int index = getNum(telFirst.length);
        String first = telFirst[index];
        String second = String.valueOf(getNum(888) + 10000).substring(1);
        String third = String.valueOf(getNum(9100) + 10000).substring(1);
        return first + second + third;
    }

    private static int getNum(int end) {
        return new Random().nextInt(end);
    }

    private static String[] bankCode = new String[]{"103000","622202","356889"};
    private static String[] bankName = new String[]{"农业银行","工商银行","招商银行"};

    private static Map<String,String> getBankAccount(){
        Map<String,String> map = new HashMap<>(2);
        Random random = new Random();
        StringBuilder sb = new StringBuilder("");
        int i = random.nextInt(bankCode.length);
        String head = bankCode[i];
        sb.append(head);
        while (sb.length() < (16 + random.nextInt(3))){
            sb.append(random.nextInt(10));
        }
        map.put("code", sb.toString());
        map.put("name", bankName[i]);
        return map;
    }

    public static void main(String[] args) {
        // 输入一个参数这个参数代表你想随机生成多少数据量的数据这里先写好 因为我需要10万的数据量
        int dataLength = 100;
        List<NameData> dataList = makeData(dataLength);
        for (NameData nameData : dataList) {
            System.out.println(nameData.toString());
        }
    }
}
