package samyups.example.trainingss.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.add_dogs_dialog_box.view.*
import samyups.example.trainingss.R
import samyups.example.trainingss.data.Dog

class MainDialogBox(
    private val mainViewModel: MainViewModel
) : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val addDogDialog: View = inflater.inflate(
            R.layout.add_dogs_dialog_box,
            container,
            false)

        initUI(addDogDialog)
        return addDogDialog
    }

    private fun initUI(addDogDialog: View) {
        addDogDialog.cancel_add_dog_button.setOnClickListener {
            dismiss()
        }

        addDogDialog.submit_add_dog_button.setOnClickListener {

            val newDogBreedInput = addDogDialog.enter_dog_breed_edittext.text.toString()
            val newDogWeightInput = addDogDialog.enter_dog_weight_edittext.text.toString().toLongOrNull()?: 0L
            val newDogHeightInput = addDogDialog.enter_dog_height_edittext.text.toString().toLongOrNull()?: 0L
            val newDogMaxAgeInput = addDogDialog.enter_dog_maxage_edittext.text.toString().toIntOrNull()?: 0

            val newDogInput = Dog(
                0,
                newDogBreedInput,
                newDogWeightInput,
                newDogHeightInput,
                newDogMaxAgeInput)

            mainViewModel.addDog(newDogInput)

            Toast.makeText(context, "$newDogBreedInput added", Toast.LENGTH_SHORT).show()
            dismiss()
        }
    }
}