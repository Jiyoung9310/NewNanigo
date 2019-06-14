package banchan.nexters.com.nanigoandroid.module

import android.databinding.DataBindingUtil
import banchan.nexters.com.nanigoandroid.MainActivity
import banchan.nexters.com.nanigoandroid.R
import banchan.nexters.com.nanigoandroid.anotation.FragmentScope
import banchan.nexters.com.nanigoandroid.databinding.MainFragmentBinding
import dagger.Module
import dagger.Provides

/**
 * Created by jiyoung on 2019-06-14
 */

@Module
class MainFragmentModule {
    @Provides
    @FragmentScope
    fun provideMainFragmentBinding(activity: MainActivity): MainFragmentBinding {
        return DataBindingUtil.inflate<MainFragmentBinding>(
            activity.layoutInflater,
            R.layout.main_fragment, null, false
        )
    }
}