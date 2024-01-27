package javaapplication28;
import java.util.Arrays;
import java.util.Scanner;

public class JavaApplication28 {
    
    
    static String[][] board = new String[6][7];
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean jugador1 = true;
        for(int i = 0; i < board.length ; i++){
            Arrays.fill(board[i], " ");
        }
        String nombre1, nombre2;
        System.out.print("Jugador 1 elige tu nombre: ");
        nombre1 = sc.nextLine();
        System.out.print("Jugador 2 elige tu nombre: ");
        nombre2 = sc.nextLine();
        System.out.println(tablero());
        while(!ganador(board)){
            System.out.println("Escribe la letra de la columna donde quieres colocar la letra:");
            String respuesta = sc.nextLine().toUpperCase().trim();
            while(!respuesta.matches("[A-G]")){
                System.out.println("Esa no es una opción válida");
                respuesta = sc.nextLine().toUpperCase().trim();
            }
            int conversion = (int)(respuesta.charAt(0)) - 16;
            char conversion2 = (char) conversion;
            int res = Integer.parseInt(Character.toString(conversion2));
            int casilla = board.length - 1;
            
            while(casillaOcupada(board, casilla, res - 1)){
                casilla--;
            }
            board[casilla][res - 1] = "XA"
                    + "A";
            System.out.println(tablero());
        }    
    }
    static boolean ganador(String board[][]){
        for(int i = 0 ; i < board.length - 3; i++){
            for(int j = 0 ; j < board[i].length - 3; j++){
                if((board[i][j].equals(board[i][j + 1]) 
                        && board[i][j].equals(board[i][j + 2]) 
                        && board[i][j].equals(board[i][j + 3]))
                        && casillaOcupada(board, i, j)){
                    return true;
                }
                if(( board[i][j].equals(board[i + 1][j]) 
                        && board[i][j].equals(board[i + 2][j]) 
                        && board[i][j].equals(board[i + 3][j]))
                        && casillaOcupada(board, i, j)){
                    return true;
                }
                if((board[i][j].equals(board[i + 1][j + 1]) &&
                        board[i][j].equals(board[i + 2][j + 2]) &&
                        board[i][j].equals(board[i + 3][j + 3]))
                        && casillaOcupada(board, i, j)){
                    return true;
                }
                if((board[i][board[j].length - 1].equals(board[i + 1][board[j].length - 2]) 
                            && board[i][board[j].length - 1].equals(board[i + 2][board[j].length - 3]) 
                            && board[i][board[j].length - 1].equals(board[i + 3][board[j].length - 4]))
                        && casillaOcupada(board, i, j)){
                    return true;
                }
            }
        }
        for(int i = board.length - 1 ; i >= 3; i--){
            for(int j = board[i].length - 1 ; j >= 3; j--){
                if((board[i][j].equals(board[i][j - 1]) 
                        && board[i][j].equals(board[i][j - 2]) 
                        && board[i][j].equals(board[i][j - 3]))
                        && casillaOcupada(board, i, j)){
                    return true;
                }
                if(( board[i][j].equals(board[i - 1][j]) 
                        && board[i][j].equals(board[i - 2][j]) 
                        && board[i][j].equals(board[i - 3][j]))
                        && casillaOcupada(board, i, j)){
                    return true;
                }
                if((board[i][j].equals(board[i - 1][j - 1]) &&
                        board[i][j].equals(board[i - 2][j - 2]) &&
                        board[i][j].equals(board[i - 3][j - 3]))
                        && casillaOcupada(board, i, j)){
                    return true;
                }
                if((board[board.length - 1][j].equals(board[board[i].length - 2][j - 1]) 
                            && board[board.length - 1][j].equals(board[board[i].length - 3][j - 2]) 
                            && board[board.length - 1][j].equals(board[board[i].length - 4][j - 3]))
                        && casillaOcupada(board, i, j)){
                    return true;
                }
            }
            
        }
        return false;
    }
    static String fileresDibuix(){
        String a ="  ";
        for(int i = 0 ; i < 29 ; i++){
            a += "-";
        }
        a += "\n";
        return a;
    }
    static String columnesDibuix(String board[]){
        String a = "";
        
        for (int i = 0 ; i < board.length; i++){
            a += "| " + board[i]+ " ";
        }
        a += "|\n";
        return a;
    }
    static String tablero(){
        String a = "";
        for(int i = 0 ; i < 6 ; i ++){
            int n = 49 + i;
            char c = (char) n;
            
            a += fileresDibuix();
            a += c + " " + columnesDibuix(board[i]);
        }
        a += fileresDibuix();
        a+= " ";
        for (int i = 0; i < 7 ; i++){
           int n = 65 + i;
           char c = (char) n;
            
            a += "   " + c;
        }
        return a;
    }
    static boolean casillaOcupada(String board[][], int i, int j){
        if(!board[i][j].equals(" ")){
            return true;
        }
        return false;
    }
    
}
