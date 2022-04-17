package beta.myapp.muhnee.data.db

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class WalletRepository(private val database: AppDatabase) {

    fun refreshWallet() = database.walletDao().getAllWallet()

    fun getBalance() = database.walletDao().getTotalBalance()
}