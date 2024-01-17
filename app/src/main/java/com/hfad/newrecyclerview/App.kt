package com.hfad.newrecyclerview

import android.app.Application
import com.hfad.newrecyclerview.model.PersonService

class App : Application() {
    val personService = PersonService()
}