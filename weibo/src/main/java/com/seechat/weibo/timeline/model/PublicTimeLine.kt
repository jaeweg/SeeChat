package com.seechat.weibo.timeline.model


data class PublicTimeLine(
        var statuses: List<Statuse> = listOf(),
        var previous_cursor: Int = 0, //0
        var next_cursor: Long = 0, //11488013766
        var total_number: Int = 0 //81655
) {
    data class Statuse(
            var created_at: String = "", //Tue May 31 17:46:55 +0800 2011
            var id: Long = 0, //11488058246
            var text: String = "", //求关注。
            var source: String = "", //www.baidu.com
            var favorited: Boolean = false, //false
            var truncated: Boolean = false, //false
            var in_reply_to_status_id: String = "",
            var in_reply_to_user_id: String = "",
            var in_reply_to_screen_name: String = "",
            var geo: Any = Any(), //null
            var mid: String = "", //5612814510546515491
            var reposts_count: Int = 0, //8
            var comments_count: Int = 0, //9
            var annotations: List<Any> = listOf(),
            var user: User = User()
    ) {
        data class User(
                var id: Int = 0, //1404376560
                var screen_name: String = "", //zaku
                var name: String = "", //zaku
                var province: String = "", //11
                var city: String = "", //5
                var location: String = "", //北京 朝阳区
                var description: String = "", //人生五十年，乃如梦如幻；有生斯有死，壮士复何憾。
                var url: String = "", //http://blog.sina.com.cn/zaku
                var profile_image_url: String = "", //http://tp1.sinaimg.cn/1404376560/50/0/1
                var domain: String = "", //zaku
                var gender: String = "", //m
                var followers_count: Int = 0, //1204
                var friends_count: Int = 0, //447
                var statuses_count: Int = 0, //2908
                var favourites_count: Int = 0, //0
                var created_at: String = "", //Fri Aug 28 00:00:00 +0800 2009
                var following: Boolean = false, //false
                var allow_all_act_msg: Boolean = false, //false
                var remark: String = "",
                var geo_enabled: Boolean = false, //true
                var verified: Boolean = false, //false
                var allow_all_comment: Boolean = false, //true
                var avatar_large: String = "", //http://tp1.sinaimg.cn/1404376560/180/0/1
                var verified_reason: String = "",
                var follow_me: Boolean = false, //false
                var online_status: Int = 0, //0
                var bi_followers_count: Int = 0 //215
        )
    }
}