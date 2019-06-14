package banchan.nexters.com.nanigoandroid

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.android.support.DaggerFragment
import javax.inject.Inject

/**
 * Created by jiyoung on 2019-06-14
 */

class MainFragment : DaggerFragment() {
    @Inject
    lateinit var binding: banchan.nexters.com.nanigoandroid.databinding.MainFragmentBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? = binding.root
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.textView.text = "Hello, Dagger!!"
    }
}