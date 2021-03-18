package samyups.example.trainingss.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import samyups.example.trainingss.R
import samyups.example.trainingss.data.Dogs

class MainRecyclerAdapter : RecyclerView.Adapter<MainViewHolder>() {

    private var dogNamesList = emptyList<Dogs>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_item, parent, false)
        return MainViewHolder(view)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val dogBreed = dogNamesList[position].breed
        val dogWeight = dogNamesList[position].weight
        val dogHeight = dogNamesList[position].height
        val dogMaxAge = dogNamesList[position].maxAge
        val dogData = Dogs(dogBreed, dogWeight, dogHeight, dogMaxAge)
        holder.bind(dogData)
    }

    override fun getItemCount(): Int {
        return dogNamesList.size
    }

    fun update(data: List<Dogs>) {
        this.dogNamesList = data
    }
}