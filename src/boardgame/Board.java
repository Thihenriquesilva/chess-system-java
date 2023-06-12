package boardgame;

public class Board {
    private  int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    //Método para retornar a peça a partir da linha e coluna
    public Piece piece(int row, int column){
        return pieces[row][column];
    }

    //Método para retornar a peça a partir da posição
    public Piece piece(Position position){
        return pieces[position.getRow()][position.getColumn()];
    }

    public void placePiece(Piece piece, Position position){
        //Piece está declarada no tabuleiro
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }



}
