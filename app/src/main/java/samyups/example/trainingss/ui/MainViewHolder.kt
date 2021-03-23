package samyups.example.trainingss.ui

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import samyups.example.trainingss.R
import samyups.example.trainingss.data.Dog

class MainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private var dogIdTextView: TextView = itemView.findViewById(R.id.dog_id_textview)
    private var dogBreedTextView: TextView = itemView.findViewById(R.id.dog_breed_textview)
    private var dogWeightTextView: TextView = itemView.findViewById(R.id.dog_weight_textview)
    private var dogHeightTextView: TextView = itemView.findViewById(R.id.dog_height_textview)
    private var dogMaxAgeTextView: TextView = itemView.findViewById(R.id.dog_max_age_textview)

    fun bind(dog: Dog) {
        dogIdTextView.text = dog.id.toString()
        dogBreedTextView.text = dog.breed
        dogWeightTextView.text = dog.weight.toString()
        dogHeightTextView.text = dog.height.toString()
        dogMaxAgeTextView.text = dog.maxAge.toString()
    }
}