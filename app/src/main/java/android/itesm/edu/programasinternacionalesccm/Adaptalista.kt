package android.itesm.edu.programasinternacionalesccm

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import java.util.ArrayList

class Adaptalista(private var listDatos: ArrayList<Universidades>) : RecyclerView.Adapter<Adaptalista.ViewHolderDatos>(),
    View.OnClickListener {
    private var listener: View.OnClickListener? = null

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): Adaptalista.ViewHolderDatos {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.activity_lista, null, false)

        view.setOnClickListener(this)
        return ViewHolderDatos(view)
    }

   override fun onBindViewHolder(viewHolderDatos: Adaptalista.ViewHolderDatos, i: Int) {
       viewHolderDatos.ciudad.setText(listDatos[i].getCiudad())
       viewHolderDatos.universidad.setText(listDatos[i].getUniversidad())
       viewHolderDatos.pais.setText(listDatos[i].getPais())
       viewHolderDatos.image.setImageResource(listDatos[i].getImage())
   }

    override fun getItemCount(): Int {
        return listDatos.size
    }

    fun setOnClickListener(listener: View.OnClickListener) {
        this.listener = listener
    }

    override fun onClick(view: View) {
        if (listener != null) {
            listener!!.onClick(view)
        }
    }

    inner class ViewHolderDatos(itemView: View) : RecyclerView.ViewHolder(itemView) {

        internal var pais: TextView = itemView.findViewById(R.id.id_pais)
        internal var universidad: TextView = itemView.findViewById(R.id.id_universidad)
        internal var ciudad: TextView = itemView.findViewById(R.id.id_ciudad)
        internal var image: ImageView = itemView.findViewById(R.id.foto)

    }
}