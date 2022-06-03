package be.technifutur.sudoku.model;

import be.technifutur.sudoku.controler.SudokuModel;

public class SamouraiSudokuModel implements SudokuModel {
    char[][] tab = new char[21][21];
    public static final char EMPTY_VALUE = 0;
    public static final char IS_NOTVALID_VALUE = 'E';

    public int getLineSize() {
        return 21;
    }

    public int getColumnSize() {
        return 21;
    }

    protected boolean isValidValue(char n) {
        return n > '0' && n <= (9 + '0');
    }

    ;

    public final void setValue(int line, int column, char value) throws OutOfSudokuException, InvalidValueSudokuException {
        if (!isValid(line, column)) {
            throw new OutOfSudokuException(line, column, "Votre position n'est pas dans le sudoku");
        } else if (!isValidValue(value)) {
            throw new InvalidValueSudokuException(value, "veuillez choisir une autre valeur !!!!! comprise entre : 1 et " + line);
        }
        tab[line][column] = value;
    }

    public SamouraiSudokuModel() {
        for (int longueur = 0; longueur < 6; longueur++) {
            for (int larg = 0; larg < 3; larg++) {
                tab[0 + longueur][9 + larg] = IS_NOTVALID_VALUE;
                tab[9 + larg][0 + longueur] = IS_NOTVALID_VALUE;
                tab[15 + longueur][9 + larg] = IS_NOTVALID_VALUE;
                tab[9 + larg][15 + longueur] = IS_NOTVALID_VALUE;
            }
        }
    }

    public boolean isEmpty(int line, int column) {
        if (tab[line][column] == EMPTY_VALUE || tab[line][column] == IS_NOTVALID_VALUE) {
            return true;
        }
        return false;
    }

    public boolean isValid(int line, int column) {
        return line >= 0
                && line < 21
                && column >= 0
                && column < 21
                && tab[line][column] != IS_NOTVALID_VALUE;
    }


    public char getValue(int line, int column) {
        return tab[line][column];
    }
}
