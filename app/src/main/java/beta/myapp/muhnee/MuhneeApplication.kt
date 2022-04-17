package beta.myapp.muhnee

import android.app.Application
import beta.myapp.muhnee.data.db.AppDatabase

class MuhneeApplication: Application() {
    val database: AppDatabase by lazy {
        AppDatabase.getDatabase(this)
    }
}