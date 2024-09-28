// programa creado por Amisadai Morales 23/sept/24

import java.util.*;

public class tarea3 {
    public static void main(String[]args){
        int uN, rN, dN, x = 0;  
        String nS, nI;      
        
        System.out.println(""); //space
        System.out.println("BIENVENIDO AL JUEGO DE ADIVINANZAS!");
        System.out.println(""); //space
        System.out.print("Ingrese un numero entre el 1 al 100: ");
        
        // input:
        Scanner userNumber = new Scanner(System.in);
        uN = userNumber.nextInt();
        Random randomNumber = new Random();
        rN = randomNumber.nextInt(100);

        // loop de intentos:
        while (uN != rN && x < 5 ){                 
            System.out.println(""); //space
            x += 1;
            System.out.println("Intento #" + x + " es INCORRECTO!");
            if(x < 5){
                if (uN < rN){
                    System.out.println("El numero correcto es MAYOR al numero ingresado!");
                }
                else{
                    System.out.println("El numero correcto es MENOR al numero ingresado!");
                }
                System.out.println(""); //space
                System.out.print("Intente otra vez: "); 
                uN = userNumber.nextInt();
            }
        };        
        userNumber.close();
        System.out.println(""); //space

        // resultados:
        if (uN == rN){
            System.out.println("CORRECTO! FELICIDADES!");
            System.out.println("Ha ganado el juego!");
            nI = (x > 1)? " intentos": " intento";
            System.out.println("Numero de intentos: " + x + nI);
        }
        else{
            System.out.println("Ha perdido el juego!");
            System.out.println("-- El numero era: " + rN + " --"); 
            // diferencia:
            dN = Math.abs(rN - uN);
            nS = (dN > 1)? " numeros": " numero";
            System.out.println("El ultimo numero ingresado (" + uN +  ") tuvo una diferencia de " + dN + nS + " al numero correcto!");
        }
        System.out.println(""); //space
    }
}
