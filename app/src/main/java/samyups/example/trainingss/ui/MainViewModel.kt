package samyups.example.trainingss.ui

import androidx.lifecycle.ViewModel
import samyups.example.trainingss.data.MainRepository
import samyups.example.trainingss.data.Dog

class MainViewModel(private val mainRepository: MainRepository): ViewModel() {

    fun addDog(dog:Dog) = mainRepository.addDog(dog)

    fun getDogsList() = mainRepository.getDogsList()
}