package TicTacToe;

public class Runner {

    public static void main(String[] args) {
        Board x = new Board();
        System.out.println(x.toString());

        Player player = new Player("Andrei", Board.Mark.MARK_X);
        Player player1 = new Player("Gigi", Board.Mark.MARK_0);


        TicTacToeConsole joc = new TicTacToeConsole(player, player1);

        System.out.println(joc);

        Player winner = joc.start();
        System.out.println("Castigator " + winner);
    }
}
