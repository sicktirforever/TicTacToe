package TicTacToe;

public class Player {

    private String name;
    private Board.Mark symbol;

    public Player(String name, Board.Mark symbol){
        this.name = name;
        this.symbol = symbol;
    }

    @Override
    public String toString(){
        return name + " joaca cu simbolul " + symbol;
    }

    public boolean isSymbolMine(Board.Mark m){
        return m == symbol;
    }
}
