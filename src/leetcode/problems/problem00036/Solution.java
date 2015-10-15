package leetcode.problems.problem00036;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

public class Solution {

    private static final int DIMENSION = 9;

    public boolean isValidSudoku(char[][] board) {
        if (board == null) {
            return false;
        } else if (board.length != DIMENSION && board[0].length != DIMENSION) {
            return false;
        }

        List<Set<Character>> rows = initializeList();
        List<Set<Character>> columns = initializeList();
        List<Set<Character>> boxes = initializeList();

        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                char character = board[i][j];
                if (!Character.isDigit(character)) {
                    continue;
                }
                if (!check(character, i, rows)
                    || !check(character, j, columns)
                    || !check(character, getBoxIndex(i, j), boxes)) {
                    return false;
                }
            }
        }

        return true;
    }

    private List<Set<Character>> initializeList() {
        List<Set<Character>> result = new ArrayList<>();
        IntStream.rangeClosed(1, DIMENSION).forEach(i -> {
            result.add(new HashSet<>());
        });
        return result;
    }

    private boolean check(char character, int index, List<Set<Character>> group) {
        Set<Character> groupMember = group.get(index);
        if (groupMember.contains(character)) {
            return false;
        }
        groupMember.add(character);
        return true;
    }

    private int getBoxIndex(int rowIndex, int columnIndex) {
        int bound = (int) Math.sqrt(DIMENSION);
        int result = 0;

        for (int i = 1; i <= bound; i++) {
            if (columnIndex < bound * i) {
                result = i - 1;
                break;
            }
        }

        for (int i = 1; i <= bound; i++) {
            if (rowIndex < bound * i) {
                result += bound * (i - 1);
                break;
            }
        }

        return result;
    }
}
