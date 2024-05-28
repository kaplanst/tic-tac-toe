/*
 *    Copyright 2024 Stan Kaplan
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package academy.devonline.tictactoe.component;

import academy.devonline.tictactoe.model.Cell;
import academy.devonline.tictactoe.model.GameTable;

/**
 * @author Stan K
 * link link.com
 */
public class WinnerVerifier {
    public boolean isUserWin(final GameTable gameTable) {

        return isWinner(gameTable, 'X');
    }

    public boolean isComputerWin(final GameTable gameTable) {

        return isWinner(gameTable, 'O');
    }

    private boolean isWinner(GameTable gameTable, char sign) {
        for (int i = 0; i < 3; i++) {
            int row = 0;
            for (int j = 0; j < 3; j++) {
                Cell cell = new Cell(i, j);
                if (gameTable.getSign(cell) == sign) {
                    row++;
                }
            }
            if (row == 3) return true;
        }
        for (int i = 0; i < 3; i++) {
            int col = 0;
            for (int j = 0; j < 3; j++) {
                Cell cell = new Cell(j, i);
                if (gameTable.getSign(cell) == sign) {
                    col++;
                }
            }
            if (col == 3) return true;
        }
        int diagonal1 = 0;
        int diagonal2 = 0;
        for (int i = 0; i < 3; i++) {
            Cell cell1 = new Cell(i, i);
            Cell cell2 = new Cell(2 - i, i);
            if (gameTable.getSign(cell1) == sign) diagonal1++;
            if (gameTable.getSign(cell2) == sign) diagonal2++;
        }
        if (diagonal1 == 3 || diagonal2 == 3) return true;

        return false;
    }
}
