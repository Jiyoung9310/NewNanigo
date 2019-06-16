package banchan.nexters.com.nanigoandroid.base

import banchan.nexters.com.nanigoandroid.module.ActivityModule
import banchan.nexters.com.nanigoandroid.module.AppModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * Created by jiyoung on 2019-06-14
 */

@Singleton
@Component(modules = [(AndroidSupportInjectionModule::class), (ActivityModule::class), (AppModule::class)])
interface AppComponent : AndroidInjector<BaseApplication> {
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<BaseApplication>()
}