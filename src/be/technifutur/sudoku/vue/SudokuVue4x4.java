package be.technifutur.sudoku.vue;

import be.technifutur.sudoku.model.SudokuModel4x4;

public class SudokuVue4x4 {
    public String getGrilleVide() {
        return """
                +------+-----+
                | . .  | . . |
                | . .  | . . |
                +------+-----+
                | . .  | . . |
                | . .  | . . |
                +------+-----+
                """;
    }

    public String getGrille(SudokuModel4x4 sudo) {
        String format = getGrilleVide().replace(".","%s");
        Character[] tableau = new Character[16];
        int pos = 0;
        for (int lig = 0; lig < 4; lig++){
            for (int col = 0; col < 4; col++){

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
