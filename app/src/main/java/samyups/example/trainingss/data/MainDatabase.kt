package samyups.example.trainingss.data

class MainDatabase private constructor() {

    var mainDao = MainDao()
        private set

    companion object {
        @Volatile private var instance : MainDatabase? = null

        fun getInstance() =
            instance ?: synchronized(this) {
                instance ?: MainDatabase().also { instance = it }
            }
    }
}