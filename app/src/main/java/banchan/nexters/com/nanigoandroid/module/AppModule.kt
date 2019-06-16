package banchan.nexters.com.nanigoandroid.module

import banchan.nexters.com.nanigoandroid.anotation.Named
import dagger.Module
import dagger.Provides

/**
 * Created by jiyoung on 2019-06-16
 */

@Module
class AppModule {
    @Named("hello")
    @Provides
    fun provideHelloWorld() = "Hello AppModule!!"
}