package samyups.example.trainingss.util

import android.app.Application
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import samyups.example.trainingss.data.MainDatabase
import samyups.example.trainingss.data.MainRepository

class MainApplication: Application() {

    val applicationScope = CoroutineScope(SupervisorJob())

    val database by lazy { MainDatabase.getInstance(this)}

    val mainRepository by lazy {MainRepository(database.mainDao())}
}