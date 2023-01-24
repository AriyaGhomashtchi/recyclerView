package com.example.recyclerview.data

import com.example.recyclerview.R
import com.example.recyclerview.data.model.Vacation

class Datasource {

    fun getVacations(): List<Vacation> {
        return listOf(
            Vacation(R.drawable.urlaub1, R.string.preis1,
            "/ Amsterdam"),
            Vacation(R.drawable.urlaub2, R.string.preis2,
            "Tokyo"),
            Vacation(R.drawable.urlaub3, R.string.preis3,
                "Basel",),
            Vacation(R.drawable.urlaub4, R.string.preis4,
            "Venedig"),
            Vacation(R.drawable.urlaub5, R.string.preis1,
            "Hamburg"),
            Vacation(R.drawable.urlaub6, R.string.preis2,
            "Malaga"),
            Vacation(R.drawable.urlaub7, R.string.preis3,
            "Marbella"),
            Vacation(R.drawable.urlaub8, R.string.preis4,
            "Rio de Janeiro"),
            Vacation(R.drawable.urlaub9, R.string.preis1,
            "Porto"),
            Vacation(R.drawable.urlaub10, R.string.preis2,
            "London"),
            Vacation(R.drawable.urlaub11, R.string.preis3,
            "Bukarest"),
            Vacation(R.drawable.urlaub12, R.string.preis4,
            "Turin"),
            Vacation(R.drawable.urlaub1, R.string.preis1,
            "Rom"),
            Vacation(R.drawable.urlaub2, R.string.preis2,
            "Johannesburg"),
            Vacation(R.drawable.urlaub3, R.string.preis3,
            "Mallorca"),
            Vacation(R.drawable.urlaub4, R.string.preis4,
            "Lissabon"),
            Vacation(R.drawable.urlaub5, R.string.preis1,
            "Washington D.C."),
            Vacation(R.drawable.urlaub6, R.string.preis2,
            "Los Angeles"),
            Vacation(R.drawable.urlaub7, R.string.preis3,
            "Bejing"),
            Vacation(R.drawable.urlaub8, R.string.preis4,
            "Canberra"),
            Vacation(R.drawable.urlaub9, R.string.preis1,
            "Stockholm"),
            Vacation(R.drawable.urlaub10, R.string.preis2,
            "Nairobi"),
            Vacation(R.drawable.urlaub11, R.string.preis3,
            "Duisburg"),
            Vacation(R.drawable.urlaub12, R.string.preis4,
            "Reeperbahn")
        )
    }
}
