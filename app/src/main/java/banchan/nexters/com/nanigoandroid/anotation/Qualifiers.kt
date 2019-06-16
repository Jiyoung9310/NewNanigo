package banchan.nexters.com.nanigoandroid.anotation

import javax.inject.Qualifier

/**
 * Created by jiyoung on 2019-06-16
 */

@Qualifier
@MustBeDocumented
@Retention(AnnotationRetention.RUNTIME)
annotation class Named(val value: String = "")