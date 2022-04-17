package beta.myapp.muhnee.ui.viewwallet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import beta.myapp.muhnee.MainViewModel
import beta.myapp.muhnee.databinding.ViewWalletFragmentBinding

class ViewWalletFragment : Fragment() {

    companion object {
        fun newInstance() = ViewWalletFragment()
    }

    private val binding by lazy {
        ViewWalletFragmentBinding.inflate(layoutInflater)
    }

    private val viewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }



}