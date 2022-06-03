package be.technifutur.sudoku.vue;

import be.technifutur.sudoku.model.SudokuModel9x9;

public class SudokuVue9x9 {
    public String getGrilleVide() {
        return """
                +-------+-------+-------+
                | . . . | . . . | . . . |
                | . . . | . . . | . . . |
                | . . . | . . . | . . . |
                +-------+-------+-------+
                | . . . | . . . | . . . |
                | . . . | . . . | . . . |
                | . . . | . . . | . . . |
                +-------+-------+-------+
                | . . . | . . . | . . . |
                | . . . | . . . | . . . |
                | . . . | . . . | . . . |
                +-------+-------+-------+
                """;
    }

    public String getGrille(SudokuModel9x9 sudo) {
        String format = getGrilleVide().replace(".","%s");
        Character[] tableau = new Character[81];
        int pos = 0;
        for (int lig = 0; lig < 9; lig++){
            for (int col = 0; col < 9; col++){

                if (sudo.isEmpty(lig, col)){
                    tableau[pos] = '.';
                }else {
                    tableau[pos] = sudo.getValue(lig, col);
                }
                pos++;
            }
        }
        return String.format(format, (Object[]) tableau);
    }
}
