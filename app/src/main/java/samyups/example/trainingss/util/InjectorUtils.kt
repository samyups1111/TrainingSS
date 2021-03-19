package samyups.example.trainingss.util

import samyups.example.trainingss.data.MainRepository
import samyups.example.trainingss.ui.MainViewModelFactory

object InjectorUtils {

    fun provideMainViewModelFactory(): MainViewModelFactory {
        val mainRepository = MainRepository.getInstance()
        return MainViewModelFactory(mainRepository)
    }
}