package beta.myapp.muhnee.ui.addwallet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import beta.myapp.muhnee.MainViewModel
import beta.myapp.muhnee.R
import beta.myapp.muhnee.databinding.AddWalletFragmentBinding

class AddWalletFragment : Fragment() {

    companion object {
        fun newInstance() = AddWalletFragment()
    }

    private val binding by lazy {
        AddWalletFragmentBinding.inflate(layoutInflater)
    }

    private val viewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }

}