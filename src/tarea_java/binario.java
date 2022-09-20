
package tarea_java;
import java.io.Serializable;

public class binario  implements Serializable
{
        private String jugador_1;
        private String jugador_2;
        private String ganador;

        public binario(String aa, String ba, String ca) {
          this.jugador_1 = aa;
          this.jugador_2 = ba;
          this.ganador = ca;
        }

        public String getGanador() {
            return ganador;
        }
        
        public String getParticipantes() {
            return jugador_1 + " " +jugador_2;
        }
        
        @Override
        public String toString() {
            return "Entrada guardada con éxito [ganador=" + ganador + ", participantes=" + getParticipantes() + "]";
        }
}
