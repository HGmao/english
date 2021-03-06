package com.cccxm.english.mvp.model

import com.cccxm.english.bean.HttpResponse
import com.cccxm.english.bean.UserBean
import com.cccxm.english.bean.WelcomeBean
import com.cccxm.english.config.Urls
import com.cccxm.english.mvp.contract.WelcomeContract
import com.cccxm.english.net.LoginService
import com.cccxm.english.net.WelcomeService
import com.cxm.lib.retrofit.RetrofitUtils

/**
 * 菩提本无树
 * 明镜亦非台
 * 本来无一物
 * 何处惹尘埃
 * 陈小默 16/8/29.
 */
class WelcomeModel : WelcomeContract.IWelcomeModel {
    override fun loadData(present: WelcomeContract.IWelcomePresent, cb: (HttpResponse<WelcomeBean>) -> Unit) {
        val service = RetrofitUtils.getService(Urls.HOST, WelcomeService::class.java)
        service.getAdvertisement()
                .netCallback(cb)
    }

    override fun login(username: String, password: String, cb: (HttpResponse<UserBean>) -> Unit) {
        val service = RetrofitUtils.getService(Urls.HOST, LoginService::class.java)
        service.login(username, password)
                .netCallback(cb)
    }
}