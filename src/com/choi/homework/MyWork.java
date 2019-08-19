package com.choi.homework;

import com.choi.entity.Data;
import com.choi.entity.Pics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MyWork {
    public static void main(String[] args) throws JSONException {
        String json = "{\"status\":\"ok\",\"paramz\":{\"feeds\":[{\"id\":299080,\"oid\":288342,\"category\":\"article\",\"data\":{\"subject\":\"视频直播：习近平马英九会面\",\"summary\":\"两岸领导人习近平、马英九在新加坡会面\",\"cover\":\"/Attachs/Article/288342/56a263bcab4a4c55b0bef0528ce880b6_padmini.JPG\",\"pic\":\"\",\"format\":\"video\",\"changed\":\"2015-11-07 14:35:22\"}},{\"id\":299076,\"oid\":288340,\"category\":\"article\",\"data\":{\"subject\":\"荔枝新闻3.0：不止是阅读\",\"summary\":\"江苏广电旗下资讯类手机应用“荔枝新闻”于近期推出全新升级换代的3.0版。\",\"cover\":\"/Attachs/Article/288340/3e8e2c397c70469f8845fad73aa38165_padmini.JPG\",\"pic\":\"\",\"format\":\"txt\",\"changed\":\"2015-09-22 16:01:41\"}},{\"id\":299069,\"oid\":288333,\"category\":\"article\",\"data\":{\"subject\":\"荔枝新闻3.0改版升级通告\",\"summary\":\"荔枝新闻3.0全新升级，只等你来！荔枝新闻，伴你一起看世界！\",\"cover\":\"/Attachs/Article/288333/84aefe60759247808d8e804ac79a46d4_padmini.JPG\",\"pic\":\"\",\"format\":\"txt\",\"changed\":\"2015-09-20 15:28:11\"}},{\"id\":299032,\"oid\":288310,\"category\":\"article\",\"data\":{\"subject\":\"迪拜酋长长子突发心脏病去世\",\"summary\":\"阿联酋迪拜酋长长子突发心脏病去世，年仅34岁。\",\"cover\":\"/Attachs/Article/288310/622756a75c424a459cfb14506fc55a5f_padmini.JPG\",\"pic\":\"\",\"format\":\"txt\",\"changed\":\"2015-09-19 17:45:07\"}},{\"id\":299048,\"oid\":288321,\"category\":\"article\",\"data\":{\"subject\":\"南通一村干部被爆不雅视频\",\"summary\":\"今天（9月19日），一段“如皋吴窑镇长西村村长不雅视频”在微信朋友圈疯传。\",\"cover\":\"/Attachs/Article/288321/6ec2109e3cf44fa985929b9b4a6d5669_padmini.JPG\",\"pic\":\"\",\"format\":\"original\",\"changed\":\"2015-09-19 19:27:35\"}},{\"id\":299077,\"oid\":186,\"category\":\"zhibo\",\"data\":{\"subject\":\"回顾：南京牛首山佛顶骨舍利供奉大典\",\"summary\":\"2015年10月27日，南京举行盛典恭迎佛顶舍利进驻牛首山佛顶宫。\",\"cover\":\"/Attachs/Zhibo/186/ab8d88f7a13d441bb05e0c93eeb5c603_padmini.JPG\",\"format\":\"zhibo\",\"changed\":\"2015-10-27 12:50:37\"}},{\"id\":299045,\"oid\":288320,\"category\":\"article\",\"data\":{\"subject\":\"贵阳一官员开受贿轿车接受调查\",\"summary\":\"贵阳一官员开着不法商人为其购买的轿车前往接受组织调查。\",\"cover\":\"/Attachs/Article/288320/3dff218fa4c34451b93fe7fd39163aa0_padmini.JPG\",\"pic\":\"\",\"format\":\"txt\",\"changed\":\"2015-09-19 19:00:17\"}},{\"id\":298922,\"oid\":288230,\"category\":\"article\",\"data\":{\"subject\":\"感动网友\\\"雨伞爸爸\\\"毕业于南大\",\"summary\":\"爆红照片并不会改变我们的生活，会尽全力为儿子创造最好的条件，自由闯荡。\",\"cover\":\"/Attachs/Article/288230/7c16334e2ebf495b8140264423b91b89_padmini.JPG\",\"pic\":\"\",\"format\":\"txt\",\"changed\":\"2015-09-19 15:28:58\"}},{\"id\":299066,\"oid\":288332,\"category\":\"article\",\"data\":{\"subject\":\"荔枝派：我才不会轻易的狗带！\",\"summary\":\"传说，程序猿早已加入丈母娘最爱女婿套餐，并已取代公务猿登上榜首之位。\",\"cover\":\"/Attachs/Article/288332/e6a3b871a4ab4671abf736cfb73b667a_padmini.JPG\",\"pic\":\"\",\"format\":\"original\",\"changed\":\"2015-09-19 20:11:56\"}},{\"id\":298993,\"oid\":288284,\"category\":\"article\",\"data\":{\"subject\":\"《蒙面歌王》：面具下的公正\",\"summary\":\"歌手带上面具，影响他社会声誉的其它因素就都一笔勾销了，节目因此变得纯粹\",\"cover\":\"/Attachs/Article/288284/0e9f8f4d23a345f6a2d7566405d111fd_padmini.JPG\",\"pic\":\"\",\"format\":\"original\",\"changed\":\"2015-09-20 10:34:52\"}},{\"id\":299049,\"oid\":7985,\"category\":\"map\",\"data\":{\"subject\":\"香港警方夜查黑帮酒吧拘捕62名陪酒女\",\"summary\":\"香港警方9月17日晚10时许，联同入境处在香港湾仔扫黄，拘捕67人，全部被通宵扣查。\",\"cover\":\"/Attachs/Map/7985/8fbb2d18a6554272ae884da9b7308e13_cover_padmini.JPG\",\"format\":\"map\",\"changed\":\"2015-09-19 16:30:19\",\"pics\":[{\"id\":69986,\"photo\":\"/Attachs/Map/7985/9db00649770a4537bf52d334d5e8e2af_cover_padmini.JPG\",\"subject\":\"香港警方9月17日晚10时许，联同入境处在香港湾仔扫黄，拘捕67人，全部被通宵扣查。行动突击搜查湾仔骆克道一间酒吧，发现酒吧安排内地及台湾女子非法陪酒及提供性服务。图中被带走女子打扮性感。\"},{\"id\":69987,\"photo\":\"/Attachs/Map/7985/d7044fb3462a4b0bb0ac0f83ac4fd5f3_cover_padmini.JPG\",\"subject\":\"涉案酒吧由黑帮操控，以卡拉OK形式经营，暗地里进行卖淫活动，顾客需熟人介绍或与经理混熟后，才可安排场中陪酒女郎外出进行性交易，肉金由数千元至万元不等，警方估计该酒吧每月有约100万元营业额。\"},{\"id\":69988,\"photo\":\"/Attachs/Map/7985/29f3c84b1f024aaf86352c024cd35d3a_cover_padmini.JPG\",\"subject\":\"除拘捕酒吧5名负责人外，其余62女(18至43岁)，涉嫌“违反逗留条件”，除15名台湾女子外，其余47名内地女子分持双程证及中国大陆护照。全部被带署作通宵扣查。\"}]}},{\"id\":299007,\"oid\":7983,\"category\":\"map\",\"data\":{\"subject\":\"高校学生参加军训学习“匕首操”\",\"summary\":\"2015年9月18日，杭州，在中国计量学院内，200名新生正在操练匕首操。这是该校首次在军训中引入匕首操，相比往年学生军训中常见的站军姿、踢正步等传统项目，“匕首操”丰富学生军训内容、提高学生军训乐趣。\",\"cover\":\"/Attachs/Map/7983/6ffb0a20d3604e08a9c68c4b0e4ef9a8_cover_padmini.JPG\",\"format\":\"map\",\"changed\":\"2015-09-19 14:33:53\",\"pics\":[{\"id\":69975,\"photo\":\"/Attachs/Map/7983/20355fa917224c5ab1aef6ffa682a83d_cover_padmini.JPG\",\"subject\":\"2015年9月18日，杭州，在中国计量学院内，200名新生正在操练匕首操。这是该校首次在军训中引入匕首操，相比往年学生军训中常见的站军姿、踢正步等传统项目，“匕首操”丰富学生军训内容、提高学生军训乐趣。thomas wei/CFP\"},{\"id\":69976,\"photo\":\"/Attachs/Map/7983/34b351a3d39a4c1093b635625382257f_cover_padmini.JPG\",\"subject\":\"2015年9月18日，杭州，在中国计量学院内，200名新生正在操练匕首操。\"},{\"id\":69977,\"photo\":\"/Attachs/Map/7983/7f2566e6efff45dfa5078d625be4d887_cover_padmini.JPG\",\"subject\":\"2015年9月18日，杭州，在中国计量学院内，200名新生正在操练匕首操。\"}]}},{\"id\":298938,\"oid\":288243,\"category\":\"article\",\"data\":{\"subject\":\"荔枝说：人体冷冻那些事儿\",\"summary\":\"女作家杜虹选择冷冻头部等待50年后复活，冷冻靠不靠谱？有没有其他方法？\",\"cover\":\"/Attachs/Article/288243/15d93fe5d93b4d1f9859e97c739e1166_padmini.JPG\",\"pic\":\"\",\"format\":\"original\",\"changed\":\"2015-09-19 15:30:15\"}},{\"id\":298969,\"oid\":288259,\"category\":\"article\",\"data\":{\"subject\":\"声音：老娘今天就让你丢人  \",\"summary\":\"南京三山街与男友吵架脱衣的裸女：你嫌老娘丢人，老娘今天就让你丢人。 \",\"cover\":\"/Attachs/Article/288259/bf50d0c35a384bc8a600884e94356efc_padmini.JPG\",\"pic\":\"\",\"format\":\"original\",\"changed\":\"2015-09-19 15:20:43\"}},{\"id\":299034,\"oid\":288294,\"category\":\"article\",\"data\":{\"subject\":\"4女子离家房子被倒卖蜗居楼道\",\"summary\":\"北京市公安局朝阳分局经侦大队已受理崔文花的报案，目前该案正在调查中。\",\"cover\":\"/Attachs/Article/288294/cee8182e731a4240816e62c162a30a91_padmini.JPG\",\"pic\":\"\",\"format\":\"txt\",\"changed\":\"2015-09-19 17:48:19\"}},{\"id\":298951,\"oid\":288241,\"category\":\"article\",\"data\":{\"subject\":\"无锡轿车连撞多车 司机涉毒驾\",\"summary\":\"据警方证实，驾驶人陈某，经尿检结果涉嫌吸毒，目前案件已移交派出所调查。\",\"cover\":\"/Attachs/Article/288241/247c46f827d04bcc98812479a58e841c_padmini.JPG\",\"pic\":\"\",\"format\":\"txt\",\"changed\":\"2015-09-19 15:00:28\"}},{\"id\":299054,\"oid\":288322,\"category\":\"article\",\"data\":{\"subject\":\"独家专访动画片《狮子王》导演\",\"summary\":\"活动结束后，明可夫接受了江苏网络电视台荔枝新闻记者独家专访。\",\"cover\":\"/Attachs/Article/288322/fa53631a9579407f91eeb9c16c88b6ed_padmini.JPG\",\"pic\":\"\",\"format\":\"original\",\"changed\":\"2015-09-19 19:15:25\"}},{\"id\":298985,\"oid\":288270,\"category\":\"article\",\"data\":{\"subject\":\"平邑事件镇书记和镇长被停职\",\"summary\":\"9月19日，“平邑9.14”事件地方镇主要负责人被停职检查。\",\"cover\":\"/Attachs/Article/288270/874b82ff0cb647578eb007495282d915_padmini.JPG\",\"pic\":\"\",\"format\":\"txt\",\"changed\":\"2015-09-19 16:03:21\"}},{\"id\":298970,\"oid\":288253,\"category\":\"article\",\"data\":{\"subject\":\"天津消防总队政委受贿9万判5年\",\"summary\":\"受贿事实共3起，均发生在徐在上海消防系统任职期间。\",\"cover\":\"/Attachs/Article/288253/592894f9adb74390a36553c427f14389_padmini.JPG\",\"pic\":\"\",\"format\":\"txt\",\"changed\":\"2015-09-19 15:04:32\"}},{\"id\":298945,\"oid\":7982,\"category\":\"map\",\"data\":{\"subject\":\"重庆情侣下体藏毒 4天排出3000粒毒品\",\"summary\":\"9月12日凌晨，警方在江北机场抓获一对情侣，他们共在体内藏超3000颗麻古，最后排出超280克毒品。其中，28岁的女子竟然将800颗麻古放入避孕套，再藏在阴道内。二人自称是为把抵押的房子赎回来，才运输毒品。目前，两人因涉嫌运输毒品被刑拘。\",\"cover\":\"/Attachs/Map/7982/4b20a05444604973a7a1efba858ed4bc_cover_padmini.JPG\",\"format\":\"map\",\"changed\":\"2015-09-19 14:27:16\",\"pics\":[{\"id\":69971,\"photo\":\"/Attachs/Map/7982/8124156070c54b0c8954079d878c7c99_cover_padmini.JPG\",\"subject\":\"9月12日凌晨，警方在江北机场抓获一对情侣，他们共在体内藏超3000颗麻古，最后排出超280克毒品。其中，28岁的女子竟然将800颗麻古放入避孕套，再藏在阴道内。二人自称是为把抵押的房子赎回来，才运输毒品。目前，两人因涉嫌运输毒品被刑拘。来源：腾讯图片\"},{\"id\":69972,\"photo\":\"/Attachs/Map/7982/e10761368d23449bb8ce8a19dfaad05b_cover_padmini.JPG\",\"subject\":\"9月11日晚上，江北寸滩派出所的民警守候在江北机场。在此之前，他们接到线索：一对身藏毒品的情侣将于次日凌晨抵达江北机场。当晚，这对情侣从西双版纳起飞，由于飞机晚点，接近凌晨3点才出现在机场出口。28岁的苗丽（化名）一头黄发，戴着无框眼镜，手里提着一些云南特产。24岁的男友蓝伟（化名）帮她提着重物。\"},{\"id\":69973,\"photo\":\"/Attachs/Map/7982/89bb296c34444384a2c2788b870a114e_cover_padmini.JPG\",\"subject\":\"通过审讯，苗丽交代，民警查获的麻古是由她和男友运到重庆。不仅如此，在他们体内还藏有大量麻古，未能排出体外。民警立即将二人带到医院，通过4天的“排毒”，两人体内共排出超过3000粒麻古。苗丽说，被民警查获的600粒麻古之所以用多层避孕套包裹，是因为她将这个条状物放入了阴道内。“我确实吞不下去了。”她交代称，自己吞入口中的、数十粒包装的麻古有10包。不过，登机后，其中一条毒品滑出，这才放入绣花包内。\"}]}}],\"PageIndex\":1,\"PageSize\":20,\"TotalCount\":53521,\"TotalPage\":2677}}";
        JSONObject object1 = null;
        object1 = new JSONObject(json);
        JSONObject paramz = object1.getJSONObject("paramz");
        JSONArray feeds = paramz.getJSONArray("feeds");
        ArrayList<Data> list = new ArrayList<>();
        for (int i = 0; i < feeds.length(); i++) {
            JSONObject jsobj = feeds.getJSONObject(i);
            JSONObject data = jsobj.getJSONObject("data");
            String subject = data.getString("subject");
            String summary = data.getString("summary");
            String cover = data.getString("cover");
            String pic = null;
            try {
                //判断是否有pic标签
                pic = data.getString("pic");
            }
            //没有pic标签
            catch (JSONException e) {
                JSONArray picsArray =null;
                try{
                    picsArray = data.getJSONArray("pics");
                }
                //没有pics标签
                catch (JSONException ex){
                    //将pic=null放进去，并继续下一次循环
                    String format = data.getString("format");
                    String changed = data.getString("changed");
                    Data data1 = new Data(subject, summary, cover, pic, format, changed);
                    list.add(data1);
                        continue;
                }
                for (int j = 0; j < picsArray.length(); j++) {
                    JSONObject picsJSON = picsArray.getJSONObject(j);
                    int id = picsJSON.getInt("id");
                    String photo = picsJSON.getString("photo");
                    String subject1 = picsJSON.getString("subject");
                    Pics pics = new Pics(id, photo, subject1);
                    //将pics的值赋给pic
                    pic = pics.toString();
                }

            }
            //String pic = null;
            String format = data.getString("format");
            String changed = data.getString("changed");
            Data data1 = new Data(subject, summary, cover, pic, format, changed);
            list.add(data1);
        }
        System.out.println(list);


    }
}
