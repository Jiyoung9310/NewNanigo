package banchan.nexters.com.nanigoandroid.base

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

/**
 * Created by jiyoung on 2019-06-14
 */

class BaseApplication : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().create(this)
    }
}