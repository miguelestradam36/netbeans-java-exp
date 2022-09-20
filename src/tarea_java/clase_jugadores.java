package tarea_java;
import java.util.ArrayList;
public class clase_jugadores 
{
    String nombre;
    String nacionalidad;
    int puntos;
    ArrayList<diferentes_cartas.Carta_normal> mazo_normal = new ArrayList<diferentes_cartas.Carta_normal>();
    ArrayList<diferentes_cartas.Carta_especial> mazo_especial = new ArrayList<diferentes_cartas.Carta_especial>();

    public void setNationality(String pais) {
        this.nacionalidad = pais;
        nacionalidad = pais;
        
    }

    public void setName(String Jugador) {
        this.nombre = Jugador;
        nombre = Jugador;
    }
}
