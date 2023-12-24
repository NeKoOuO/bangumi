package com.xiaoyv.common.api.interceptor

import com.xiaoyv.common.api.BgmApiManager
import com.xiaoyv.common.helper.UserTokenHelper
import okhttp3.Interceptor
import okhttp3.Response

/**
 * Class: [JsonAuthInterceptor]
 *
 * @author why
 * @since 11/24/23
 */
class JsonAuthInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        if (request.url.toString().contains(BgmApiManager.URL_BASE_API).not()) {
            return chain.proceed(request)
        }

        return chain.proceed(
            request
                .newBuilder()
                .addHeader("Authorization", "Bearer ${UserTokenHelper.authToken.accessToken}")
                .build()
        )
    }
}