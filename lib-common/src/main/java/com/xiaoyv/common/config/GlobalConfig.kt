package com.xiaoyv.common.config

import com.xiaoyv.common.config.annotation.MediaType
import com.xiaoyv.common.config.bean.tab.MediaTab

/**
 * Class: [GlobalConfig]
 *
 * @author why
 * @since 11/28/23
 */
object GlobalConfig {
    private const val DOC_ROOT = "https://xiaoyvyv.github.io/bangumi/lib-doc/build"

    const val GROUP_MY_REPLY_TOPIC = "my_reply"
    const val GROUP_MY_SEND_TOPIC = "my_topic"

    /**
     * 功能页面
     */
    const val PAGE_RANK = 0
    const val PAGE_PROCESS = 1

    val docPrivacy: String
        get() = "$DOC_ROOT/starter.html?_=" + System.currentTimeMillis()

    val docArgument: String
        get() = "$DOC_ROOT/argument.html?_=" + System.currentTimeMillis()

    val docAuthor: String
        get() = "$DOC_ROOT/author.html?_=" + System.currentTimeMillis()

    val docDonation
        get() = "$DOC_ROOT/donation.html?_=" + System.currentTimeMillis()

    val mediaTypes by lazy {
        listOf(
            MediaTab("动画", MediaType.TYPE_ANIME),
            MediaTab("书籍", MediaType.TYPE_BOOK),
            MediaTab("音乐", MediaType.TYPE_MUSIC),
            MediaTab("游戏", MediaType.TYPE_GAME),
            MediaTab("三次元", MediaType.TYPE_REAL),
        )
    }

    fun mediaTypeName(@MediaType mediaType: String): String {
        return mediaTypes.find { it.type == mediaType }?.title.orEmpty()
    }
}