package beta.myapp.muhnee.ui.wallet


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import beta.myapp.muhnee.data.db.table.Wallet
import beta.myapp.muhnee.databinding.ItemWalletBinding

class WalletsAdapter(private val onItemClicked: (Wallet) -> Unit) :
    ListAdapter<Wallet, WalletsAdapter.WalletViewHolder>(diffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WalletViewHolder {
        return WalletViewHolder(
            ItemWalletBinding.inflate(
                LayoutInflater.from(parent.context)
            )
        )
    }

    override fun onBindViewHolder(holder: WalletViewHolder, position: Int) {
        val wallet = getItem(position)
        holder.itemView.setOnClickListener {
            onItemClicked(wallet)
        }
        holder.bind(wallet)
    }

    class WalletViewHolder(private val viewBinding: ItemWalletBinding) :
        RecyclerView.ViewHolder(viewBinding.root) {

        fun bind(wallet: Wallet) {
            viewBinding.apply {
                name.text = wallet.walletName
                identification.text = wallet.walletIdentification
                balance.text = "Rp.{wallet.walletBalance.toString()}"
            }
        }
    }

    companion object {
        private val diffCallback = object : DiffUtil.ItemCallback<Wallet>() {
            override fun areItemsTheSame(oldItem: Wallet, newItem: Wallet): Boolean {
                return oldItem === newItem
            }

            override fun areContentsTheSame(oldItem: Wallet, newItem: Wallet): Boolean {
                return oldItem.id == newItem.id
            }
        }
    }

}