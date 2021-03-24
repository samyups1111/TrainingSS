package samyups.example.trainingss.data

import androidx.annotation.WorkerThread
import kotlinx.coroutines.flow.Flow

class MainRepository(private val mainDao: MainDao) {

    val dogsList : Flow<List<Dog>> = mainDao.getDogList()

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun addDog(dog: Dog) {
        mainDao.addDog(dog)
    }
}  // How come I don't need a singleton for this repository?