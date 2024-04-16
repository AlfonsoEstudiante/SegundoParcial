package com.example.segundoparcial_22180.ViewModels

import com.example.segundoparcial_22180.R
import com.example.segundoparcial_22180.Models.Personaje

class InfoPersonajes {

    fun getInfoPersonajes(): ArrayList<Personaje> {
        val personajeList: ArrayList<Personaje> = ArrayList()

        //Create list
        personajeList.add(Personaje("Estudiante","Chica",12,R.drawable.female01))
        personajeList.add(Personaje("Estudiante","Chico",10,R.drawable.male01))
        personajeList.add(Personaje("Youtuber","Chica",14,R.drawable.female02))
        personajeList.add(Personaje("Profesor","Chico",24,R.drawable.male02))
        personajeList.add(Personaje("Enfermera","Chica",22,R.drawable.female03))
        personajeList.add(Personaje("Pescador","Chico",65,R.drawable.male03))
        personajeList.add(Personaje("Mecanica","Chica",21,R.drawable.female04))
        personajeList.add(Personaje("Cocinero","Chico",32,R.drawable.male04))

        return personajeList
    }
}