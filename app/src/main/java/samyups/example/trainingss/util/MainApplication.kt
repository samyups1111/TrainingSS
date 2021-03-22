package samyups.example.trainingss.util

import android.app.Application
import samyups.example.trainingss.data.MainDatabase
import samyups.example.trainingss.data.MainRepository

class MainApplication: Application() {

    val database by lazy { MainDatabase.getInstance(this)}

    val mainRepository by lazy {MainRepository(database.mainDao())}
}