package samyups.example.trainingss.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class MainDao {

    private val dogsList = mutableListOf<Dogs>()
    private val dogs = MutableLiveData<List<Dogs>>()

    init {
        dogs.value = dogsList
    }

    fun getDogsList() = dogs as LiveData<List<Dogs>>

    fun addDog(dog: Dogs) {
        dogsList.add(dog)
        dogs.value = dogsList
    }
}