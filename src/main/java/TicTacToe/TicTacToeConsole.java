package TicTacToe;

import java.util.Scanner;

public class TicTacToeConsole extends Referee {

    Scanner scanner = new Scanner(System.in);


    @Override
    public int[] getCoord() {


        int row = scanner.nextInt();
        int col = scanner.nextInt();


        return new int[] {row,col};
    }



    public TicTacToeConsole(Player player1, Player player2){
        super(player1,player2);



    }


}
