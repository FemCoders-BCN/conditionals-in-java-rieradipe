public class Weather {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario que ingrese la temperatura en celcius de su ciudad (La pregunta y la respuesta deberá estar en una sola línea) y según ello devuelva lo siguiente:
        
        String entrada = System.console().readLine("Ingrese la temperatura en Celsius: ");
         String temperaturaTexto = entrada.replace("\n", "");
         int temperatura = Integer.parseInt(temperaturaTexto);
        //Si es bajo 0: Te estás congelando
        if (temperatura < 0) {
            System.out.println("Te estas congelando");
            //Si es entre 0 y 10: Hace mucho frío 
        } else if (temperatura >= 0 && temperatura <= 10) {
            System.out.println("Hace mucho frio");
            //Si es entre 11 y 17: Con un abrigo estás bien
        } else if (temperatura >=11 && temperatura <=17) {
            System.out.println("Con un abrigo estas bien");
            //Si es entre 18 y 25: Parece que ha llegado el verano
        } else if (temperatura >=18 && temperatura <= 25) {
            System.out.println("Parece que ha llegadp el verano");
            //Si es entre 26 y 35: Que calooorrrrr
        }  else if (temperatura >= 26 && temperatura <= 35) {
            System.out.println("Que calooooor");
        } else {
            //Si es mayor a 36: Ahí no hay quien viva
            System.out.println("Aqui no hay quien viva");
        }

        //Imprime el resultado
    }
}