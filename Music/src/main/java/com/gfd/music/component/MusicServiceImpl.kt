package com.gfd.home.component

import android.support.v4.app.Fragment
import com.gfd.common.ui.fragment.BaseFragment
import com.gfd.music.ui.fragment.MusicFragment
import com.gfd.provider.router.service.MusicService

/**
 * Crosstalk模块提供服务的具体实现者
 */
class MusicServiceImpl : MusicService {

    override fun getMusicFragment(): BaseFragment {
        return MusicFragment()
    }

}