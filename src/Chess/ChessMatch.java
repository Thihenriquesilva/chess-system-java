package Chess;

import boardgame.Board;

//Responsável pelas regras do Jogo
public class ChessMatch {
    private Board board;
    public ChessMatch(){
        board = new Board(8,8);
    }

    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        //Percorrer a matriz do Board
        for(int i = 0; i < board.getRows(); i++){
            for (int j = 0; j < board.getColumns(); j++){
                //DownCast das peças.
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return mat;
    }
}
