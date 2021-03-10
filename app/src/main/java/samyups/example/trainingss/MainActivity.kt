package samyups.example.trainingss

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val dogAdapter = DogAdapter()

    var dogNamesList = mutableListOf<String>(
        "Pitbull",
        "chihuahua",
        "Golden Retriever",
        "Havanese",
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecyclerView()
        loadData()

        fab_add.setOnClickListener {
            val addDogDialog = AddDogNamesDialogBox()
            addDogDialog.show(supportFragmentManager, "customDialog")
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