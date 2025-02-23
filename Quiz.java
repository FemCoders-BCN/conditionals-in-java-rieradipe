import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int puntaje = 0;
        //Escribe un programa que sea un pequeño juego trivial de acertar preguntas
        //Cada pregunta tendrá 4 opciones que el usuario podrá escoger
        //Por cada respuesta correcta, añade 5 puntos al puntaje
        //Al finalizar el juego imprime cual fue tu puntaje /20
        //Si el puntaje es 15 o más, imprime: Tú si que sabes mucho
        //Si el puntaje es menor de 15 pero mayor o igual a 5, imprime: No lo has hecho mal
        //De lo contrario imprime: Buena suerte la próxima vez
        //Las opciones a, b, c y d de cada pregunta, deberán dejar en terminal un espacio de sangría, averigua como hacerlo en java

        // 1 pregunta
        System.out.println("\n¿Quién fue la hacker que escribió en 1994 Hacking the Wetware?");
            System.out.println("\ta) Ada Lovelace");
            System.out.println("\tb) Jude Milhon");
            System.out.println("\tc) Martha Ackelsberg");
            System.out.println("\td) Jane Jacobs");
        String respuesta1 = scanner.nextLine();
            if(respuesta1.equalsIgnoreCase("a")) {
                puntaje += 5;
            }
            
        // 2 pregunta
        System.out.println("\n¿Quién es Fuencisla Clemares?");
            System.out.println("\ta) La directora general de IBM Europa, Oriente Medio y África");
            System.out.println("\tb) La vicepresidenta de Microsoft Western Europe");
            System.out.println("\tc) La directora general de Google en España y Portugal");
            System.out.println("\td) Fundadora y CEO de Marsi Bionics");

            String respuesta2 = scanner.nextLine();
            if(respuesta2.equalsIgnoreCase("c")) {
                puntaje += 5;
            }
        //3 pregunta
            
        System.out.println("\n¿Quién fue Hedwig Eva Maria Kiesler, conocida como Hedy Lamarr?");
            System.out.println("\ta) Primera programadora de software");
            System.out.println("\tb) Una actriz de cine");
            System.out.println("\tc) Inventora del procesador de datos");
            System.out.println("\td) Inventora del sistema de comunicaciones de salto de frecuencia, base del wifi, bluetooth y GPS");
        
        String respuesta3 = scanner.nextLine();
        if(respuesta3.equalsIgnoreCase("b y d")) {
            puntaje += 5;
        }    
            //4 pregunta

        System.out.println("\n¿Cómo se llamaban las principales 'mujeres ocultas' de la NASA, encargadas de los cálculos para que la misión del Apolo 11 concluyera con éxito?");
            System.out.println("\ta) Katherine Johnson, Dorothy Vaughan y Mary Jackson");
            System.out.println("\tb) Jessica Miller, Emily Johnson, Sarah Davis");
            System.out.println("\tc) bell hooks, Toni Morrison y Alice Walker");
            System.out.println("\td) Emmeline Pankhurst, Millicent Fawcett y Harriet Harman");
    
        String respuesta4 = scanner.nextLine();
        if(respuesta4.equalsIgnoreCase("a"));
        puntaje += 5;
        //Respuestas: 1. b / 2. c / 3. b y d / 4. a
 

    //enseñar los resultados
    System.out.println("\n Tú puntuaje total es de : " + puntaje + "/20");
    if(puntaje >= 15) {
        System.out.println("Tú si que sabes mucho!");
    } else if (puntaje >= 5) {
        System.out.println("No lo has hecho mal");
    } else {
        System.out.println("Buena suerte ka próxima vez");
    }
    scanner.close();
}
}



    