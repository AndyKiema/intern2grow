public class TicTacToe {
    static char[][]board=new char[3][3];
    public static void printBoard(){
        System.out.println("-------------");
        for(int i=0; i<3; i++){
            System.out.println("| ");
            for(int j=0; j<3; j++){
                System.out.println(board[i][j]+" | ");
            }
            System.out.println("\n-------------");
        }
    }
    public static void clearBoard(){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                board[i][j]=' ';
            }
        }
    }
    public static boolean checkwin(char player){
         
    }
    public static void main(String[] args) {
        
    }
}
