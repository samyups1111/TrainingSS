package samyups.example.trainingss.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import samyups.example.trainingss.data.MainRepository

class MainViewModelFactory(private val mainRepository: MainRepository)
    : ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T: ViewModel?> create(modelClass: Class<T>): T {
        return MainViewModel(mainRepository) as T
    }
}


