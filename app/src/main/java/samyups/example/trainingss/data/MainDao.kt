package samyups.example.trainingss.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface MainDao {

    @Query("SELECT * FROM `DogBreeds`")
    fun getDogList(): Flow<List<Dog>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addDog(dog: Dog)
}