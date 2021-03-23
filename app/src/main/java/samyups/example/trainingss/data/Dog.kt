package samyups.example.trainingss.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "DogBreeds")
data class Dog(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val breed: String,
    val height: Long,
    val weight: Long,
    val maxAge: Int,
)