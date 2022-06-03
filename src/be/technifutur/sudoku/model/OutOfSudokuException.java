package be.technifutur.sudoku.model;

public class OutOfSudokuException extends SudokuException {
    private int line;
    private int column;
    public OutOfSudokuException(int line, int column, String message) {

        super(message);
        this.line = line;
        this.column = column;
    }

    public OutOfSudokuException() {

    }


    public int getColumn() {

        return column;
    }

    public int getLine() {

        return line;
    }
}
