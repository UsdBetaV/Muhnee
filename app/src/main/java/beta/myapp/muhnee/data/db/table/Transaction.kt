package beta.myapp.muhnee.data.db.table

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "transaction_table")
data class Transaction(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "wallet_id") val walletId: Int,
    @ColumnInfo(name = "transaction_desc") val transactionDesc: String,
    @ColumnInfo(name = "transaction_type") val transactionType: String,
    @ColumnInfo(name = "transaction_value") val transactionValue: String,
    @ColumnInfo(name = "transaction_date") val transactionDate: String
)

