package be.technifutur.sudoku.model;

public class InvalidValueSudokuException extends SudokuException {
    private char value;
    public InvalidValueSudokuException(char value, String message) {
        super(message);
        this.value = value;
    }

    public InvalidValueSudokuException() {

    }

    public char getvalue() {
        return value;
    }
}
