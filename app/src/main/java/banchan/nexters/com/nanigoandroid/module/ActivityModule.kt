package banchan.nexters.com.nanigoandroid.module

import banchan.nexters.com.nanigoandroid.MainActivity
import banchan.nexters.com.nanigoandroid.anotation.ActivityScope
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by jiyoung on 2019-06-14
 */

@Module
abstract class ActivityModule {
    @ActivityScope
    @ContributesAndroidInjector(modules = [(MainActivityModule::class)])
    abstract fun getMainActivity(): MainActivity
}