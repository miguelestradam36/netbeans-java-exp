package tarea_java;

import java.util.Random;

public class diferentes_cartas
{
    public String color;
    public int value;
    private Random rand;
    private String face;
    public int id;
    
    class Carta_normal extends diferentes_cartas 
    {
        public String Imprimir_valor()
        {
            face = "[ ";
            face += color + " ";
            face += String.valueOf(value); 
            face += " ]";
            return face;
        }
        public Carta_normal(int numero_, String color_)
        {
            value = numero_;
            color = color_; 
        }
        public Carta_normal()
        {
            rand = new Random();
            value = rand.nextInt(10); 
            rand = new Random();
            int coloure = rand.nextInt(4);
            switch(coloure)
            {
                case 0: color = "Rosado"; 
                    break;
                case 1: color = "Gris"; 
                    break;
                case 2: color = "Blanco"; 
                    break;
                case 3: color = "Café"; 
                    break;
            }
            id = coloure*10 + value; 
        }

        public boolean canPlace(diferentes_cartas.Carta_normal aleatorio_1, String color_)
        {
            if (color == color_)
            {
                return true;
            }
            else if (color_ == "Arcoiris")
            {
                return true;
            }
            else if (value == aleatorio_1.value)
            {
                return true;
            }
            else if (color == "Arcoiris")
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        public boolean canPlace(diferentes_cartas.Carta_especial aleatorio_1, String color_)
        {
            if (color == color_)
            {
                return true;
            }
            else if (color == "Arcoiris")
            {
                return true;
            }
            else if (value == aleatorio_1.value)
            {
                return true;
            }
            else if (color_ == "Arcoiris")
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
    
    
    class Carta_especial extends diferentes_cartas 
    {
        public String Imprimir_valor()
        {
            face = "[ ";
            face += color + " ";
            face += String.valueOf(value);
            face += " ]";
            return face;
        }
        
        public Carta_especial()
        {
            value = 10;
            color = "Arcoiris";
            rand = new Random();
            id = rand.nextInt(51); 
            while (id < 41)
            {
                id++;
            }
        }

        public boolean canPlace(diferentes_cartas.Carta_normal aleatorio_1, String color_)
        {
            if (color == color_)
            {
                return true;
            }
            else if (color_ == "Arcoiris")
            {
                return true;
            }
            else if (value == aleatorio_1.value)
            {
                return true;
            }
            else if (color == "Arcoiris")
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        public boolean canPlace(diferentes_cartas.Carta_especial aleatorio_1, String color_)
        {
            if (color == color_)
            {
                return true;
            }
            else if (color_ == "Arcoiris")
            {
                return true;
            }
            else if (value == aleatorio_1.value)
            {
                return true;
            }
            else if (color == "Arcoiris")
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
}