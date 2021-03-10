package samyups.example.trainingss

import android.app.Activity
import android.content.ContentValues.TAG
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.add_dogs_dialog_box.view.*

class AddDogNamesDialogBox() : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val addDogDialog : View = inflater.inflate(R.layout.add_dogs_dialog_box, container, false)

        addDogDialog.cancel_add_dog_button.setOnClickListener {
            dismiss()
        }

        addDogDialog.submit_add_dog_button.setOnClickListener {

            val newDogInput = addDogDialog.enter_dog_edittext.text.toString()

            Toast.makeText(context, "Dog Breed Added", Toast.LENGTH_SHORT).show()
            dismiss()
        }
        return addDogDialog
    }
}