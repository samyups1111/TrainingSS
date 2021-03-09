package samyups.example.trainingss

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val dogAdapter = DogAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecyclerView()
    }
    private fun initRecyclerView() {
        main_recyclerview.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = dogAdapter
        }
    }
}