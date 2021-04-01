package samyups.example.trainingss.data

import androidx.annotation.WorkerThread
import com.google.firebase.database.DatabaseReference
import kotlinx.coroutines.flow.Flow

class MainRepository(private val mainDao: MainDao, private val remoteDatabase: DatabaseReference) {

    val dogsList : Flow<List<Dog>> = mainDao.getDogList()

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun addDog(dog: Dog) {
        mainDao.addDog(dog)
        val reference = remoteDatabase.child("Dog").child("${dog.breed}")
        reference.setValue(dog)
    }
}