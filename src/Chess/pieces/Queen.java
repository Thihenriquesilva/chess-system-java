package Chess.pieces;

import Chess.ChessPiece;
import Chess.Color;
import boardgame.Board;
import boardgame.Position;

public class Queen extends ChessPiece {
    public Queen(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "Q";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

        Position p = new Position(0,0);

        //Verificar acima de peça
        p.setValues(position.getRow() -1, position.getColumn());
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
            p.setRow(p.getRow()-1);

        }
        if(getBoard().positionExists(p) && isThereOponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }

        //Verificar a esquerda
        p.setValues(position.getRow(), position.getColumn() - 1);
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
            p.setColumn(p.getColumn()-1);

        }
        if(getBoard().positionExists(p) && isThereOponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }

        //Verificar a direita
        p.setValues(position.getRow(), position.getColumn() + 1);
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
            p.setColumn(p.getColumn()+1);

        }
        if(getBoard().positionExists(p) && isThereOponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }

        //Verificar abaixo da peça
        p.setValues(position.getRow() +1, position.getColumn());
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
            p.setRow(p.getRow()+1);

        }
        if(getBoard().positionExists(p) && isThereOponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }

        //Nw
        p.setValues(position.getRow() -1, position.getColumn()-1);
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
            p.setValues(p.getRow()-1,p.getColumn()-1);

        }
        if(getBoard().positionExists(p) && isThereOponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }

        //Ne
        p.setValues(position.getRow()-1, position.getColumn()+1);
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
            p.setValues(p.getRow()-1,p.getColumn()+1);
        }
        if(getBoard().positionExists(p) && isThereOponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }

        //Se
        p.setValues(position.getRow()+1, position.getColumn() + 1);
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
            p.setValues(p.getRow()+1,p.getColumn()+1);

        }
        if(getBoard().positionExists(p) && isThereOponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }

        //Sw
        p.setValues(position.getRow() +1, position.getColumn()-1);
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
            p.setValues(p.getRow()+1, p.getColumn()-1);

        }
        if(getBoard().positionExists(p) && isThereOponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }

        return mat;
    }
}
