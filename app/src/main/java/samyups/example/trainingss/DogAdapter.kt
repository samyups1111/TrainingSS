package samyups.example.trainingss

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.recycler_view_item.view.*

class DogAdapter: RecyclerView.Adapter<DogViewHolder>() {

    val dogNamesList = listOf<String>("Pitbull", "chihuahua", "Golden Retriever", "Havanese")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_item, parent, false)
        return DogViewHolder(view)

    }

    override fun onBindViewHolder(holder: DogViewHolder, position: Int) {
        holder.dogName.text = dogNamesList[position]

    }

    override fun getItemCount(): Int {
        return dogNamesList.size
    }
}

class DogViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    var dogName : TextView

    init {
        dogName = itemView.findViewById(R.id.dogName)
    }



}