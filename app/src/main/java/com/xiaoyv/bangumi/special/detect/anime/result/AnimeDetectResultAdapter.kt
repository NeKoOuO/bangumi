package com.xiaoyv.bangumi.special.detect.anime.result

import com.xiaoyv.bangumi.databinding.ActivityDetectAnimeResultItemBinding
import com.xiaoyv.common.api.response.anime.AnimeSourceEntity
import com.xiaoyv.widget.binder.BaseQuickBindingAdapter
import com.xiaoyv.widget.binder.BaseQuickBindingHolder
import com.xiaoyv.widget.kts.formatHMS
import com.xiaoyv.widget.kts.loadImage
import kotlin.math.roundToLong

/**
 * AnimeDetectResultAdapter
 *
 * @author why
 * @since 11/18/23
 */
class AnimeDetectResultAdapter :
    BaseQuickBindingAdapter<AnimeSourceEntity.SourceResult, ActivityDetectAnimeResultItemBinding>() {
    override fun BaseQuickBindingHolder<ActivityDetectAnimeResultItemBinding>.converted(item: AnimeSourceEntity.SourceResult) {
        val from = item.from.roundToLong().formatHMS()
        val to = item.to.roundToLong().formatHMS()
        val episode = item.episode.orEmpty().ifBlank { "unknown" }

        binding.tvTitle.text = item.filename.orEmpty()
        binding.tvNo.text = String.format("Episode: %s", episode)
        binding.tvTime.text = String.format("%s - %s", from, to)
        binding.tvDesc.text = String.format("~%.2f%% Similarity", item.similarity * 100)
        binding.ivCover.loadImage(item.image)
    }
}