package javaapplication19;

import java.util.Scanner;

public class JavaApplication19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean datosCorrectos = false;
        for ( int i = 0 ; i < 3 && !datosCorrectos ; i++){
            System.out.println("Introduce el usuario: ");
            String userName = sc.nextLine();
            System.out.println("Introduce la password");
            String password = sc.nextLine();
            if(login(userName, password)){
                System.out.println("Datos correctos");
                datosCorrectos= true;
            } else {
                System.out.println("Datos incorrectos");
            }
            if(i >= 2 && !datosCorrectos){
                System.out.println("chao, pescao");
            }
        }
    }
    static boolean login(String userName, String password){
        if(userName.equals("user1") && password.equals("asdfg")){
            return true;
        }
        return false;
    }
    
}
