package android.itesm.edu.programasinternacionalesccm

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.app.Fragment
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_menu.*
import kotlinx.android.synthetic.main.app_bar_main2.*

class Menu : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        setSupportActionBar(toolbar)
        cargarFragmento(Inicio())
        val toggle = ActionBarDrawerToggle(
            this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close
        )

        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        val navigationView: NavigationView = findViewById(R.id.nav_view)
        navigationView.setNavigationItemSelectedListener(this)
        //nav_view.setItemIconTintList(null);

    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.menu_TiposProgramas -> {
                cargarFragmento(TiposPrograma())
            }
            R.id.menu_RequisitosParticipacion -> {
                cargarFragmento(RequisitosParticipacion())
            }
            R.id.menu_ConoceOferta -> {
                cargarFragmento(ConoceOferta())
            }
            R.id.menu_LlenaSolicitud -> {
                cargarFragmento(LlenaSolicitud())
            }
            R.id.menu_SigueProceso -> {
                cargarFragmento(SigueProceso())
            }
            R.id.menu_Contacto -> {
                cargarFragmento(Contacto())
            }
            R.id.menu_Youtube -> {
                val page = Uri.parse("https://www.youtube.com/playlist?list=PLrzJxfs9Q2NeEUjuGU6J_PRh92kSHxA7G")
                val web = Intent(Intent.ACTION_VIEW, page)
                startActivity(web)
            }
            R.id.menu_Facebook -> {
                val page = Uri.parse("https://www.facebook.com/programasinternacionalesccm/")
                val web = Intent(Intent.ACTION_VIEW, page)
                startActivity(web)
            }
            R.id.menu_Facebook2 -> {
                val page = Uri.parse("https://www.facebook.com/ProgramasInternacionalesTec/")
                val web = Intent(Intent.ACTION_VIEW, page)
                startActivity(web)
            }
            R.id.menu_Calendario -> {
                val page = Uri.parse("http://sitios.itesm.mx/vi/oport_calendario.html#calendario")
                val web = Intent(Intent.ACTION_VIEW, page)
                startActivity(web)
            }
            R.id.menu_CalificaExperiencia -> {
                val page = Uri.parse("https://sitiosmiespacio.itesm.mx/publicos/evaluacionescsc/Paginas/Programas%20Internacionales/Experiencia%20ESPA%C3%91OL%20V1%202019.html")
                val web = Intent(Intent.ACTION_VIEW, page)
                startActivity(web)
            }
            else->{
                cargarFragmento(Inicio())
            }

        }
        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }

    private fun cargarFragmento(fragment: Fragment) {
        val manager = supportFragmentManager
        manager.beginTransaction().replace(R.id.contenedor_fragmentos, fragment).commit()
    }
}