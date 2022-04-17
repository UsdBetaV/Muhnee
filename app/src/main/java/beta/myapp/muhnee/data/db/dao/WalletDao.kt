package beta.myapp.muhnee.data.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import beta.myapp.muhnee.data.db.table.Wallet
import kotlinx.coroutines.flow.Flow

@Dao
interface WalletDao {

    @Query("SELECT * FROM wallet_table ORDER BY id DESC")
    fun getAllWallet(): Flow<List<Wallet>>

    @Query("SELECT * FROM wallet_table WHERE id = :id")
    fun getWalletDetail(id: Int): Flow<Wallet>

    @Query("SELECT SUM(wallet_balance) FROM wallet_table")
    fun getTotalBalance(): Flow<Int>

    @Insert
    suspend fun addWallet(wallet: Wallet)
}