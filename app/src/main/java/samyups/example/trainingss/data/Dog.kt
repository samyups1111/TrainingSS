package samyups.example.trainingss.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Dog Breeds")
data class Dog(
    @PrimaryKey val breed: String,
    val height: Long,
    val weight: Long,
    val maxAge: Int
)