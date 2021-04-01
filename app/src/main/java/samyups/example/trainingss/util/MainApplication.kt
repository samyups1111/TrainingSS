package samyups.example.trainingss.util

import android.app.Application
import com.google.firebase.database.FirebaseDatabase
import samyups.example.trainingss.data.MainDatabase
import samyups.example.trainingss.data.MainRepository

class MainApplication: Application() {

    private val database by lazy { MainDatabase.getInstance(this)}

    private val remoteDatabase by lazy { FirebaseDatabase.getInstance().reference}

    val mainRepository by lazy {MainRepository(database.mainDao(), remoteDatabase)}
}