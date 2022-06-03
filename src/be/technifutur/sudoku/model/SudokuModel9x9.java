package be.technifutur.sudoku.model;

import be.technifutur.sudoku.controler.SudokuModel;

public class SudokuModel9x9 extends AbstractSudoku  {

    public static final int EMPTY_VALUE = 0 ;

    public int getLineSize() {
        return 9;
    }

    public int getColumnSize() {
        return 9;
    }
    protected boolean isValidValue(char n){
        return n > '0' && n <= (9 +'0');
    };

    @Override
    protected boolean isPositionValid(int line, int column) {
        return line >= 0
                && line < 9
                && column >= 0
                && column < 9;
    }


}
