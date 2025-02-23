import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Pedimos con print()
        System.out.print("Ingrese su usuario: ");
        String userName = scanner.nextLine();

        //Lo mismo para la contraseña con print() misma linea
        System.out.print("Ingrese su contraseña: ");
        String userPassword = scanner.nextLine();
        /*Escribe un programa que pida al usuario ingresar un nombre de usuario y 
        una constraseña, si son iguales a los datos dados imprimirá en terminal: 
        Acceso concedido, si no son iguales imprimirá en terminal: Nombre de 
        usuario o contraseña incorrecta.*/
        /*Averigua como hacer para poder ingresar el dato justo al lado de 
        lo que termine la pregunta, es decir, que no haga un salto de línea.*/
//el método System.out.print() permite escribir texto sin hacer un salto de linea.
String UserNameOriginal = "user";
String PasswordOriginal = "pass";
if (UserNameOriginal.equals(userName) && PasswordOriginal.equals(userPassword)) {
    System.out.println("Allowed Access");
}  else { 
    System.out.println("Access denied, incorrect credentials");
  };
//cerrar Scaner
scanner.close();
}
}
/*por cierto me daba error cuando el nombre de el archivo era Logln y no se si
ha sido un error mio o era parte del ejercicio, e cambiado el nombre tanto en el 
archivo como en la clase, no se si al oinerle ln detras causaba error*/






