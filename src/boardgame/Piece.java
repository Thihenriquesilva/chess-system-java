package boardgame;

public class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    //Somente classes dentro do mesmo pacote e sub-classes podem acessar esse método
    protected Board getBoard() {
        return board;
    }



}
