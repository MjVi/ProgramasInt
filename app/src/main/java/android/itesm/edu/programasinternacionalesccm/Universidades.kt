package android.itesm.edu.programasinternacionalesccm

class Universidades{

    private var universidad: Int = 0
    private var pais: Int = 0
    private var ciudad: Int = 0
    private var image: Int = 0

    fun Universidades(universidad: Int, pais: Int, ciudad: Int, image: Int) {
        this.universidad = universidad
        this.pais = pais
        this.ciudad = ciudad
    }

    fun getUniversidad(): Int {
     return universidad
    }
    fun getPais(): Int {
     return pais
    }
    fun getCiudad(): Int {
     return ciudad
    }
    fun getImage(): Int {
     return image
    }
    fun setUniversidad(universidad: String) {
     //this.universidad = universidad
    }
    fun setCantidad(cantidad: String) {
     this.pais = pais
    }
    fun setCaducidad(caducidad: String) {
     this.ciudad = ciudad
    }
    fun setImage(image: Int) {
     this.image = image
    }
}