package samyups.example.trainingss.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import samyups.example.trainingss.data.MainRepository
import samyups.example.trainingss.data.Dog

class MainViewModel(private val mainRepository: MainRepository): ViewModel() {

    val getDogsList: LiveData<List<Dog>> = mainRepository.dogsList.asLiveData()

    fun addDog(dog:Dog) = viewModelScope.launch {
        mainRepository.addDog(dog)
    }
}