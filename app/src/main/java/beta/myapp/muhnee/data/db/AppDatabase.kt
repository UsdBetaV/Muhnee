package beta.myapp.muhnee.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import beta.myapp.muhnee.data.db.dao.TransactionDao
import beta.myapp.muhnee.data.db.dao.WalletDao
import beta.myapp.muhnee.data.db.table.Transaction
import beta.myapp.muhnee.data.db.table.Wallet

@Database(entities = [Transaction::class, Wallet::class], version = 1, exportSchema = false)
abstract class AppDatabase: RoomDatabase() {
    abstract fun transactionDao(): TransactionDao
    abstract fun walletDao(): WalletDao

    companion object{
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return  INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "wallet_database"
                )
                    .build()
                INSTANCE = instance
                instance
            }
        }
    }

}