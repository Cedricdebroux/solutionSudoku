package be.technifutur.sudoku.controler;

import be.technifutur.sudoku.model.InvalidValueSudokuException;
import be.technifutur.sudoku.model.OutOfSudokuException;
import be.technifutur.sudoku.model.SudokuModel9x9;

import javax.swing.*;

public class SudokuInitControler {

    SudokuModel model;

    public void setSudoku(SudokuModel model) {
        this.model = model;
    }

    public SudokuModel getSudoku() {
        return model;
    }

    public void request(String s) {
        String[] tab = s.split("\\.");
        int val1 = Integer.parseInt(tab[0]);
        int val2 = Integer.parseInt(tab[1]);
        char val3 = tab[2].charAt(0);
        try {
            model.setValue(val1-1,val2-1,val3);
        }catch(OutOfSudokuException | InvalidValueSudokuException e) {
            throw new RuntimeException(e);
        }
        System.out.println(val3);
    }

}

