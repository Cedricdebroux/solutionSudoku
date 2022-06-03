package be.technifutur.sudoku.controler;

import be.technifutur.sudoku.model.InvalidValueSudokuException;
import be.technifutur.sudoku.model.OutOfSudokuException;

public interface SudokuModel {
    int EMPTY_VALUE = 0;

    void setValue(int line, int column, char value) throws OutOfSudokuException, InvalidValueSudokuException;

    char getValue(int line, int column);
}
