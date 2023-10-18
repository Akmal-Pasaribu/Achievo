package com.example.anop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ArrayAdapter
import com.example.anop.databinding.ActivityDaftarAktivitasTugasBinding
import com.example.anop.databinding.ActivityPenjadwalanTugasBinding

class Daftar_Aktivitas_Tugas : AppCompatActivity() {

    private lateinit var tBinding: ActivityDaftarAktivitasTugasBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tBinding = ActivityDaftarAktivitasTugasBinding.inflate(LayoutInflater.from(this))
        setContentView(tBinding.root)

        val items = listOf<String>("Aktivitas", "Tugas")
        val adapter = ArrayAdapter(this, R.layout.list_dropdown1, items)
        tBinding.dropdownDaftar.setAdapter(adapter)

    }
}