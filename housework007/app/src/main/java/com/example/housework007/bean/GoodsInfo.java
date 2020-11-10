package com.example.housework007.bean;

import com.example.housework007.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "book", "充电宝", "电冰箱", "电脑", "电视", "电视机","空调","平板","杯子","台灯"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "正版12册鬼谷子全集墨菲定律狼道羊皮卷人性的弱点卡耐基读心术九型人格心理学格局自控力厚黑学励志图书籍",
            "罗马仕sense6+ 2万毫安时18WPD双向快充充电宝大容量移动电源Type-C输入输出适用于苹果安卓华为小米手机",
            "美的(Midea)606升 双变频风冷对开双门冰箱一级能效智能冰箱独立风冷大容积节能家电BCD-606WKPZM(E)",
            "惠普（HP）战66 四代 14英寸轻薄笔记本电脑（英特尔酷睿11代i7 16G 512G MX450 高色域 一年上门+意外）",
            "索尼（SONY）KD-75X8000H 75英寸 4K超高清 HDR 液晶平板电视 智能家居 安卓9.0系统",
            "索尼（SONY）京品家电 KD-65X9100H 65英寸 4K超高清 游戏电视 全面屏AI智能 HDMI2.1 支持4K120Hz输入",
            "美的(Midea)新一级 i青春II 智能控制 变频冷暖 1.5匹壁挂式空调挂机KFR-35GW/N8XHB1",
            "华为平板MatePad Pro 10.8英寸麒麟990影音娱乐游戏办公学习全面屏平板电脑6GB+128GB WIFI（夜阑灰）",
            "KEEPCUP 澳洲进口 轻盈塑料环保咖啡杯彩环车载随行水杯多款颜色可选 塑料 赤杨/340ml",
            "松下（Panasonic）学习台灯减蓝光护眼台灯 国AA级儿童学生阅读工作护眼灯LED触控调光卧室宿舍台灯"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {88, 188, 2999, 2899, 2698, 2098,1999,2999,100,333};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.book_s, R.drawable.chongdianbao_s, R.drawable.dianbingxiang_s,
            R.drawable.diannao_s, R.drawable.dianshi_s, R.drawable.dianshiji_s,
            R.drawable.kongtiao_s, R.drawable.pingban_s,R.drawable.teacup_s,R.drawable.light_s
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.book, R.drawable.chongdianbao, R.drawable.dianbingxiang,
            R.drawable.diannao, R.drawable.dianshi, R.drawable.dianshiji,
            R.drawable.kongtiao,R.drawable.pingban,R.drawable.teacup,R.drawable.light
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
