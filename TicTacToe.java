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
         for(int i=0; i<3; i++){
            if(board[i,0]==player && board[i,1]==player && board[i,2]==player)||(board[0,i]==player && board[1,i]==player && board[2,i]){
                return true;
            }
         }
    }
    public static boolean isBoardFull(){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(board[i][j]==' '){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isMoveValid(int row, int column){
        return row>=0 && row<3 && column>=0 && column<3 && board[row][column]==' ';
    }
    public static void main(String[] args) {
        
    }
}
