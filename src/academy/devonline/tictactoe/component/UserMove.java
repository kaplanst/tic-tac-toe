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

import java.util.Scanner;

/**
 * @author Stan K
 * link link.com
 */
public class UserMove extends Move {
    public void make(final GameTable gameTable) {
        String number;
        char ch;
        Scanner console = new Scanner(System.in);
        while (true) {
            while (true) {
                System.out.println("Please, type number between 1 and 9");
                number = console.nextLine();
                ch = number.charAt(0);
                if (ch >= '1' && ch <= '9') break;
            }

            Cell cell = convert(Character.getNumericValue(ch));
            if (gameTable.isEmpty(cell)) {
                gameTable.setSign(cell, 'X');
                break;
            } else System.out.println("This cell is not free.");
        }
    }
}