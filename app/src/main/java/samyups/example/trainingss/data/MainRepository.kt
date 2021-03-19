package samyups.example.trainingss.data

import androidx.lifecycle.MutableLiveData

class MainRepository private constructor () {

    private val dogsList = mutableListOf<Dog>()
    private val dogs = MutableLiveData<List<Dog>>()

    init {
        dogs.value = dogsList
    }

    fun getDogsList() = dogs

    fun addDog(dog: Dog) {

        dogsList.add(dog)
        dogs.value = dogsList
    }


    companion object {
        @Volatile private var instance : MainRepository? = null

        fun getInstance() =
            instance ?: synchronized(this) {
                instance ?: MainRepository().also { instance = it }
            }
    }
}