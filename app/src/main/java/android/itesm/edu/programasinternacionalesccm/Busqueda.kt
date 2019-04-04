package android.itesm.edu.programasinternacionalesccm

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View

import java.util.ArrayList

abstract class Busqueda : AppCompatActivity() {

    internal abstract var listDatos: ArrayList<Universidades>
    internal abstract var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_busqueda)

        recyclerView = findViewById(R.id.recycleView)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        listDatos = ArrayList<Universidades>()

        val adapter = Adaptalista(listDatos)
        recyclerView.adapter = adapter
    }
}
