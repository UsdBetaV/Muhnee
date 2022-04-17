package beta.myapp.muhnee

import android.app.Application
import androidx.lifecycle.*
import beta.myapp.muhnee.data.db.AppDatabase
import beta.myapp.muhnee.data.db.WalletRepository
import beta.myapp.muhnee.data.db.table.Wallet
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class MainViewModel(application: Application) : AndroidViewModel(application) {

    private val repository: WalletRepository = WalletRepository(AppDatabase.getDatabase(application))

    private val _listWallet = MutableLiveData<List<Wallet>>()
    val listWallet: LiveData<List<Wallet>> = _listWallet

    private val _wallet = MutableLiveData<Wallet>()
    val wallet: LiveData<Wallet> = _wallet

    fun getListWallet() = viewModelScope.launch(Dispatchers.IO) {
        repository.refreshWallet().collect { wallets -> _listWallet.postValue(wallets) }
    }

//    fun getBalance() = viewModelScope.launch(Dispatchers.IO) {
//        repository.getBalance().collect { balance ->  }
//    }
//
    val balance = repository.getBalance().asLiveData()

    fun setWallet(wallet: Wallet) {
        _wallet.postValue(wallet)
    }


}