package beta.myapp.muhnee.ui.wallet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import beta.myapp.muhnee.MainViewModel
import beta.myapp.muhnee.databinding.HomeFragmentBinding

class HomeFragment : Fragment() {

    companion object {
        fun newInstance() = HomeFragment()
    }

    private val binding by lazy {
        HomeFragmentBinding.inflate(layoutInflater)
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
        viewModel.balance.observe(viewLifecycleOwner){
            binding.saldo.text = it.toString()
        }
        val adapter  = WalletsAdapter {

        }
        binding.apply {
            listWallet.adapter = adapter
        }

    }

}