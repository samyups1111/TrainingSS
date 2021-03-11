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

class MainActivity : AppCompatActivity(), IAddDog {

    private val dogAdapter = DogAdapter()
    private val addDogDialog = AddDogNamesDialogBox(this)

    var dogNamesList = mutableListOf(
        "Pitbull",
        "Chihuahua",
        "Golden Retriever",
        "Havanese",
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecyclerView()
        updateData()
        fab_add.setOnClickListener { showDialog() }
    }

    override fun add(dogName: String) {
        dogNamesList.add(dogName)
        updateData()
    }

    private fun initRecyclerView() {
        main_recyclerview.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = dogAdapter
        }
    }

    private fun updateData() {
        dogAdapter.update(dogNamesList)
    }

    private fun showDialog() {
        addDogDialog.show(supportFragmentManager, "customDialog")
    }
}