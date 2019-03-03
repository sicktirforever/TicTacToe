package TicTacToe;

public class Board {

    public enum Mark{
        MARK_X{
            @Override
            public String toString() {
                return "X";
            }
        },
        MARK_0{
            @Override
            public String toString() {
                return "0";
            }
        },
        MARK_EMPTY{
            @Override
            public String toString() {
                return "-";
            }
        };
    }


    private Mark table [][];

    Board(){
        table = new Mark[3][3];
        for (int i = 0; i < 3; i++){

            for (int j = 0; j< 3; j++){

                table[i][j] = Mark.MARK_EMPTY;
            }
        }

    }

    @Override
    public String toString(){
        StringBuilder aux = new StringBuilder("");
        for (int i = 0; i < 3; ++i) {

            for (int j = 0; j < 3; ++j)

                aux.append(table[ i ][ j ].toString()).append(" ");
                aux.append("\n");

        }
        return aux.toString();

    }

    public boolean move(int row, int col, Mark m){


                if (table[row][col] == Mark.MARK_EMPTY){
                    table[row][col] = m;
                    return true;
                }


        return false;
    }

    public boolean isGameOver(int row, int col){

        boolean isOver = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                if (table[i][j] == Mark.MARK_EMPTY){
                    isOver = false;
                }
            }
        }
        if (getWinner(row,col) != Mark.MARK_EMPTY){
            return true;
        }
        return isOver;
    }

    public Mark getWinner(int row, int col){

        if (table[row][0] != Mark.MARK_EMPTY && table[row][0] == table[row][1] && table[row][0] == table[row][2]){
            return table[row][col];
        }

        if (table[0][col] != Mark.MARK_EMPTY && table[0][col] == table[1][col] && table[0][col] == table[2][col]){
            return table[row][col];
        }

        if (table[0][0] != Mark.MARK_EMPTY && table[0][0] == table[1][1] && table[0][0] == table[2][2]){
            return table[row][col];
        }

        if (table[2][0] != Mark.MARK_EMPTY && table[2][0] == table[1][1] && table[2][0] == table[0][2]){
            return table[row][col];
        }

        return Mark.MARK_EMPTY;

    }

}
