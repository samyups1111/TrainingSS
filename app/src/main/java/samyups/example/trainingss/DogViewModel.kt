package samyups.example.trainingss

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider

class DogViewModel: ViewModel() {



    class DogVMFactory: ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            TODO("Not yet implemented")
        }

    }

}