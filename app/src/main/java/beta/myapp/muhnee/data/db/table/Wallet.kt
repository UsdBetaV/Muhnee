package beta.myapp.muhnee.data.db.table

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wallet_table")
data class Wallet(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "wallet_name") val walletName: String,
    @ColumnInfo(name = "wallet_id") val walletIdentification: String,
    @ColumnInfo(name = "wallet_balance") val walletBalance: Int,
    @ColumnInfo(name = "wallet_status") val walletStatus: String
)
