package samyups.example.trainingss.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.add_dogs_dialog_box.*
import kotlinx.android.synthetic.main.add_dogs_dialog_box.view.*
import samyups.example.trainingss.*
import samyups.example.trainingss.util.InjectorUtils

abstract class MainActivity : AppCompatActivity() {

    private val dogAdapter = DogAdapter()
    private lateinit var addDogDialog : AddDogNamesDialogBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecyclerView()
        initUI()
    }

    private fun initRecyclerView() {
        main_recyclerview.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = dogAdapter
        }
    }

    private fun initUI() {
        val factory = InjectorUtils.provideDogsViewModelFactory()
        val viewModel = ViewModelProvider(this, factory).get(MainViewModel::class.java)

        viewModel.getDogsList().observe(this, Observer {
            dogAdapter.update(it)
        })

        fab_add.setOnClickListener { showDialog(viewModel) }
    }

    private fun showDialog(viewModel: MainViewModel) {
        addDogDialog = AddDogNamesDialogBox(viewModel)
        addDogDialog.show(supportFragmentManager, "customDialog")
    }
}