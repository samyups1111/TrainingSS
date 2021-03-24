package samyups.example.trainingss.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.add_dogs_dialog_box.*
import kotlinx.android.synthetic.main.add_dogs_dialog_box.view.*
import samyups.example.trainingss.*
import samyups.example.trainingss.util.MainApplication


class MainActivity : AppCompatActivity() {

    private val mainAdapter = MainRecyclerAdapter()
    private lateinit var mainDialogBox : MainDialogBox
    private val mainViewModel : MainViewModel by viewModels {
        MainViewModelFactory((application as MainApplication).mainRepository)
    }

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
        fab_add.setOnClickListener { showDialog(mainViewModel) }

        mainViewModel.getDogsList.observe(this, Observer {
            mainAdapter.update(it)
        })
    }

    private fun showDialog(viewModel: MainViewModel) {
        mainDialogBox = MainDialogBox(viewModel)
        mainDialogBox.show(supportFragmentManager, "customDialog")
    }
}