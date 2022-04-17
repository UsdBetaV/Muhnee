package beta.myapp.muhnee.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import beta.myapp.muhnee.MainViewModel
import beta.myapp.muhnee.R

class AddTransactionRecordFragment : Fragment() {

    companion object {
        fun newInstance() = AddTransactionRecordFragment()
    }

    private val viewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.add_transaction_record_fragment, container, false)
    }

}