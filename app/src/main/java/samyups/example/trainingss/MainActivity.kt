package samyups.example.trainingss

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.add_dogs_dialog_box.*
import kotlinx.android.synthetic.main.add_dogs_dialog_box.view.*

class MainActivity : AppCompatActivity() {

    private val dogAdapter = DogAdapter()

    var dogNamesList = mutableListOf<String>(
        "Pitbull",
        "Chihuahua",
        "Golden Retriever",
        "Havanese",
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecyclerView()
        loadData()

        fab_add.setOnClickListener {
            /**
            addDogDialog = AddDogNamesDialogBox()
            addDogDialog.show(supportFragmentManager, "customDialog") */

            val addDogNamesDialogBox = LayoutInflater.from(this).inflate(R.layout.add_dogs_dialog_box, null)
            val dialogBuilder = AlertDialog.Builder(this)
                .setView(addDogNamesDialogBox)
                .setTitle("Add New Dog")

            val dogDialogBox = dialogBuilder.show()

            addDogNamesDialogBox.submit_add_dog_button.setOnClickListener {
                dogDialogBox.dismiss()
                val newDogInput = addDogNamesDialogBox.enter_dog_edittext.text.toString()
                dogNamesList.add(newDogInput)
                Toast.makeText(this, "Dog Breed Added", Toast.LENGTH_SHORT).show()
            }

            addDogNamesDialogBox.cancel_add_dog_button.setOnClickListener {
                dogDialogBox.dismiss()
            }
        }
    }

    private fun initRecyclerView() {
        main_recyclerview.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = dogAdapter
        }
    }

    private fun loadData() {
        dogAdapter.update(dogNamesList)
    }
}