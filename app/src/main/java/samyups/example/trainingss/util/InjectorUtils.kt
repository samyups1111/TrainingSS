package samyups.example.trainingss.util

import samyups.example.trainingss.data.MainDatabase
import samyups.example.trainingss.data.MainRepository
import samyups.example.trainingss.ui.MainViewModelFactory

object InjectorUtils {

    fun provideDogsViewModelFactory(): MainViewModelFactory {
        val mainRepository = MainRepository.getInstance(MainDatabase.getInstance().mainDao)
        return MainViewModelFactory(mainRepository)
    }
}