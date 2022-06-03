package be.technifutur.sudoku.model;

import be.technifutur.sudoku.controler.SudokuModel;

public abstract class AbstractSudoku implements SudokuModel {

    char [][]tab = new char [getLineSize()][getColumnSize()];
    public abstract int getLineSize();
    public abstract int getColumnSize();
    @Override
    public final void setValue(int line, int column, char value) throws OutOfSudokuException, InvalidValueSudokuException  {
        if (!isPositionValid (line, column)){
            throw new OutOfSudokuException(line, column, "Votre position n'est pas dans le sudoku");
        } else if (!isValidValue(value)) {
            throw new InvalidValueSudokuException(value, "veuillez choisir une autre valeur !!!!! comprise entre : 1 et "+line);
        }
        tab [line][column] = value;
    }

    protected abstract boolean isPositionValid(int line, int column);
    protected abstract boolean isValidValue(char n);



    @Override
    public final char getValue(int line, int column) {
        return tab[line][column];
    }
    public final boolean isEmpty(int line, int column) {
        return tab[line][column] == EMPTY_VALUE;
    }
}
