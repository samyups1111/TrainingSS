package samyups.example.trainingss

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListAdapter
import android.widget.TextView

class DogAdapter: ListAdapter<DogBreeds, DogAdapter.DogViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogViewHolder {

        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.dogRV, parent, false)
        return DogViewHolder(view)

    }

    override fun onbindViewHolder(holder: DogViewHolder, position: Int) {

        val dogBreed = getItem(position)
        holder.dogBreedsItemView.text  = dogBreed.name




    }

    class DogViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        val dogBreedsItemView: TextView = itemView.findViewById(R.id.textView)

    }

}