package samyups.example.trainingss

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DogAdapter : RecyclerView.Adapter<DogViewHolder>() {

    private var dogNamesList = emptyList<String>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_item, parent, false)
        return DogViewHolder(view)
    }

    override fun onBindViewHolder(holder: DogViewHolder, position: Int) {
        val dogName = dogNamesList[position]
        holder.bind(dogName)
    }

    override fun getItemCount(): Int {
        return dogNamesList.size
    }

    fun update(data: List<String>) {
        this.dogNamesList = data
    }
}