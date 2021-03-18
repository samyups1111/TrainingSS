package samyups.example.trainingss.data

class MainRepository private constructor (private val mainDao: MainDao) {

    fun addDog(dog: Dogs) {
        mainDao.addDog(dog)
    }

    fun getDogsList() = mainDao.getDogsList()


    companion object {
        @Volatile private var instance : MainRepository? = null

        fun getInstance(mainDao: MainDao) =
            instance ?: synchronized(this) {
                instance ?: MainRepository(mainDao).also { instance = it }
            }
    }
}