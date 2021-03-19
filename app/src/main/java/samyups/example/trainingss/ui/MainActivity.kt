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

class MainActivity : AppCompatActivity() {

    private val mainAdapter = MainRecyclerAdapter()
    private lateinit var mainDialogBox : MainDialogBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecyclerView()
        initUI()
    }

    private fun initRecyclerView() {
        main_recyclerview.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = mainAdapter
        }
    }

    private fun initUI() {
        val factory = InjectorUtils.provideMainViewModelFactory()
        val viewModel = ViewModelProvider(this, factory).get(MainViewModel::class.java)
        fab_add.setOnClickListener { showDialog(viewModel) }

        viewModel.getDogsList().observe(this, Observer {
            mainAdapter.update(it)
        })
    }

    private fun showDialog(viewModel: MainViewModel) {
        mainDialogBox = MainDialogBox(viewModel)
        mainDialogBox.show(supportFragmentManager, "customDialog")
    }
}