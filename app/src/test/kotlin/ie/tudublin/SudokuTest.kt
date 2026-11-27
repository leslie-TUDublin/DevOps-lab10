package ie.tudublin

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class SudokuTest {
    @Test fun testValidBoard1() {
        val board = arrayOf(
            intArrayOf(5, 3, 0, 0, 7, 0, 0, 0, 0),
            intArrayOf(6, 0, 0, 1, 9, 5, 0, 0, 0),
            intArrayOf(0, 9, 8, 0, 0, 0, 0, 6, 0),
            intArrayOf(8, 0, 0, 0, 6, 0, 0, 0, 3),
            intArrayOf(4, 0, 0, 8, 0, 3, 0, 0, 1),
            intArrayOf(7, 0, 0, 0, 2, 0, 0, 0, 6),
            intArrayOf(0, 6, 0, 0, 0, 0, 2, 8, 0),
            intArrayOf(0, 0, 0, 4, 1, 9, 0, 0, 5),
            intArrayOf(0, 0, 0, 0, 8, 0, 0, 7, 9)
        )
        val sudoku = Sudoku()
        assertTrue(sudoku.solve(board))
    }
    @Test fun testValidBoard2() {
        val board = arrayOf(
            intArrayOf(0, 0, 0, 2, 6, 0, 7, 0, 1),
            intArrayOf(6, 8, 0, 0, 7, 0, 0, 9, 0),
            intArrayOf(1, 9, 0, 0, 0, 4, 5, 0, 0),
            intArrayOf(8, 2, 0, 1, 0, 0, 0, 4, 0),
            intArrayOf(0, 0, 4, 6, 0, 2, 9, 0, 0),
            intArrayOf(0, 5, 0, 0, 0, 3, 0, 2, 8),
            intArrayOf(0, 0, 9, 3, 0, 0, 0, 7, 4),
            intArrayOf(0, 4, 0, 0, 5, 0, 0, 3, 6),
            intArrayOf(7, 0, 3, 0, 1, 8, 0, 0, 0)
        )
        val sudoku = Sudoku()
        assertTrue(sudoku.solve(board))
    }
    @Test fun testInvalidBoard() {
        val board = arrayOf(
            intArrayOf(5, 5, 0, 0, 7, 0, 0, 0, 0),
            intArrayOf(6, 0, 0, 1, 9, 5, 0, 0, 0),
            intArrayOf(0, 9, 8, 0, 0, 0, 0, 6, 0),
            intArrayOf(8, 0, 0, 0, 6, 0, 0, 0, 3),
            intArrayOf(4, 0, 0, 8, 0, 3, 0, 0, 1),
            intArrayOf(7, 0, 0, 0, 2, 0, 0, 0, 6),
            intArrayOf(0, 6, 0, 0, 0, 0, 2, 8, 0),
            intArrayOf(0, 0, 0, 4, 1, 9, 0, 0, 5),
            intArrayOf(0, 0, 0, 0, 8, 0, 0, 7, 9)
        )
        val sudoku = Sudoku()
        assertFalse(sudoku.solve(board))
    }
}
