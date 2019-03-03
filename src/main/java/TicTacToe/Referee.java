package TicTacToe;

abstract class Referee  implements Readable{

    private Board table;
    private Player player1;
    private Player player2;
    private boolean xTurn;

    public Referee(Player player1, Player player2){
        table = new Board();
        this.player1 = player1;
        this.player2 = player2;
        this.xTurn = true;
    }


    @Override
    public String toString(){
        return player1 + " vs " + player2;
    }


    public Player start(){
            int coord[];
        while(true){

            coord = getCoord();
            table.move(coord[0], coord[1], xTurn ? Board.Mark.MARK_X : Board.Mark.MARK_0);

            if (table.isGameOver(coord[0],coord[1])){
                break;
            }

            if (xTurn == true){
                xTurn = false;

            }
            else {
                xTurn = true;
            }

            System.out.println(table);
        }

        Board.Mark aux = table.getWinner(coord[ 0 ],coord[ 1 ]);

        if (player1.isSymbolMine(aux)){

            return player1;
        }

        if (player2.isSymbolMine(aux)) {


            return player2;
        }
        return null;
        }

    }



