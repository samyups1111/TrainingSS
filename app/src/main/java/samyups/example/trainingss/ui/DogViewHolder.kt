package samyups.example.trainingss.ui

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import samyups.example.trainingss.R
import samyups.example.trainingss.data.Dogs

class DogViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private var dogBreedTextView: TextView = itemView.findViewById(R.id.dog_breed_textview)
    private var dogWeightTextView: TextView = itemView.findViewById(R.id.dog_weight_textview)
    private var dogHeightTextView: TextView = itemView.findViewById(R.id.dog_height_textview)
    private var dogMaxAgeTextView: TextView = itemView.findViewById(R.id.dog_max_age_textview)

    fun bind(dogs: Dogs) {
        dogBreedTextView.text = dogs.breed
        dogWeightTextView.text = dogs.weight.toString()
        dogHeightTextView.text = dogs.height.toString()
        dogMaxAgeTextView.text = dogs.maxAge.toString()
    }
}