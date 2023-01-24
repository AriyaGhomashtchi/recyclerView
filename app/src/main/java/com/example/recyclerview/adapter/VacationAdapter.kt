package com.example.recyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.data.model.Vacation
import com.example.recyclerview.ui.HomeFragmentDirections
import com.google.android.material.card.MaterialCardView

// der Adapter braucht den Context um auf String Resourcen zuzugreifen
// und die Liste an Jokes um sie für die RecyclerView vorzubereiten
// **JokeAdapter -> VacationAdapter
// **List<Joke> -> List<Vacation>
class VacationAdapter(
    private val context: Context,
    private val dataset: List<Vacation>
) : RecyclerView.Adapter<VacationAdapter.ViewHolder>() {

    // IDEE EINES VIEWHOLDERS
    // der ViewHolder weiß welche Teile des Layouts beim Recycling angepasst werden
    // **muss angepasst werden
    class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val vacationImage = view.findViewById<ImageView>(R.id.vacation_image)
        val priceText = view.findViewById<TextView>(R.id.price_text)
        val vacationCard = view.findViewById<CardView>(R.id.vacation_card)
    }

    // ERSTELLEN DES VIEWHOLDERS
    // hier werden neue ViewHolder erstellt
    // **R.layout.joke_item -> R.layout.vacation_item
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.vacation_item, parent, false)

        return ViewHolder(adapterLayout)
    }

    // BEFÜLLEN DES VIEWHOLDERS
    // hier findet der Recyclingprozess statt
    // die vom ViewHolder bereitgestellten Parameter werden verändert
    // **muss angepasst werden
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val vacation = dataset[position]

        holder.vacationImage.setImageResource(vacation.imageResource)
        holder.priceText.text = context.getString(vacation.priceResource)

        holder.vacationCard.setOnClickListener {
            holder.itemView.findNavController()
                .navigate(HomeFragmentDirections.actionHomeFragmentToDetailFragment(
                    vacation.imageResource,
                    vacation.priceResource,
                    vacation.name
                ))
        }
    }

    // damit der LayoutManager weiß wie lang die Liste ist
    override fun getItemCount(): Int {
        return dataset.size
    }
}
