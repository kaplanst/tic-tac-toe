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

import java.util.Random;

/**
 * @author Stan K
 * link link.com
 */
public class ComputerMove extends Move {

    public void make(GameTable gameTable) {
        while (true) {
            int number = new Random().nextInt(9) + 1;
            Cell cell = convert(number);
            if (gameTable.isEmpty(cell)) {
                gameTable.setSign(cell, 'O');
                break;
            }
        }
    }
}
