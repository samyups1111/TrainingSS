package samyups.example.trainingss.ui

import androidx.lifecycle.ViewModel
import samyups.example.trainingss.data.MainRepository
import samyups.example.trainingss.data.Dogs

class MainViewModel(private val mainRepository: MainRepository): ViewModel() {

    fun addDog(dog:Dogs) = mainRepository.addDog(dog)

    fun getDogsList() = mainRepository.getDogsList()
}