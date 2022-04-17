package beta.myapp.muhnee.data.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import beta.myapp.muhnee.data.db.table.Transaction
import kotlinx.coroutines.flow.Flow

@Dao
interface TransactionDao {

    @Query("SELECT * FROM transaction_table ORDER BY id DESC LIMIT 5")
    fun getLatestTransaction(): Flow<List<Transaction>>

    @Query("SELECT * FROM transaction_table WHERE wallet_id = :id ORDER BY id DESC")
    fun getTransactionByWallet(id: Int): Flow<Transaction>

    @Insert
    suspend fun inputTransaction(transaction: Transaction)

    @Update
    suspend fun updateTransaction(transaction: Transaction)
}