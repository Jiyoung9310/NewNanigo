package banchan.nexters.com.nanigoandroid.module

import android.databinding.DataBindingUtil
import banchan.nexters.com.nanigoandroid.MainActivity
import banchan.nexters.com.nanigoandroid.MainFragment
import banchan.nexters.com.nanigoandroid.R
import banchan.nexters.com.nanigoandroid.anotation.ActivityScope
import banchan.nexters.com.nanigoandroid.anotation.FragmentScope
import banchan.nexters.com.nanigoandroid.databinding.MainActivityBinding
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

/**
 * Created by jiyoung on 2019-06-14
 */

@Module
abstract class MainActivityModule {
    @Module
    companion object {
        @JvmStatic
        @Provides
        @ActivityScope
        fun provideMainActivityBinding(activity: MainActivity) : MainActivityBinding {
            return DataBindingUtil.setContentView(activity, R.layout.main_activity)
        }
    }

    @FragmentScope
    @ContributesAndroidInjector(modules = [(MainFragmentModule::class)])
    abstract fun getMainFragment() : MainFragment
}