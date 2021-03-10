package samyups.example.trainingss

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DogViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var dogNameTextView: TextView = itemView.findViewById(R.id.dog_name_textview)

    fun bind(dogName: String) {
        dogNameTextView.text = dogName
    }
}