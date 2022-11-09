import javax.swing.*;

public class Ejercicio2While {
    public static void main(String[] args) {
        int numero;
         numero = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número: "));

         while (numero != 0){ //Mientras la variable número sea diferente de 0
             if(numero>0){
                 System.out.println("El número " +numero+ " es Positivo");
             }else{
                 System.out.println("El número " +numero+ " es Negativo");
             }

             numero = Integer.parseInt(JOptionPane.showInputDialog("Escribe otro número: "));
         }
    }
}
