package be.technifutur.sudoku.model;

import be.technifutur.sudoku.controler.SudokuModel;

public class SudokuModel4x4 extends AbstractSudoku {

    public static final int EMPTY_VALUE = 0;

    public int getLineSize() {
        return 4;
    }

    public int getColumnSize() {
        return 4;
    }
    protected boolean isValidValue(char n){
        return n > '0' && n <= (4 +'0');
    };

    @Override
    protected boolean isPositionValid(int line, int column) {
        return line >= 0
                && line < 4
                && column >= 0
                && column < 4;
    }

}

