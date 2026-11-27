package ie.tudublin

class Sudoku {
    private var iterations = 0
    private val maxIterations = 2_000_000

    fun solve(board: Array<IntArray>): Boolean {
        iterations = 0
        return solveRecursive(board)
    }

    private fun solveRecursive(board: Array<IntArray>): Boolean {
        if (iterations++ > maxIterations) return false
        for (row in 0 until 9) {
            for (col in 0 until 9) {
                if (board[row][col] == 0) {
                    for (num in 1..9) {
                        if (isValid(board, row, col, num)) {
                            board[row][col] = num
                            if (solveRecursive(board)) return true
                            board[row][col] = 0
                        }
                    }
                    return false
                }
            }
        }
        return true
    }

    private fun isValid(board: Array<IntArray>, row: Int, col: Int, num: Int): Boolean {
        for (i in 0 until 9) {
            if (board[row][i] == num || board[i][col] == num) return false
        }
        val startRow = row - row % 3
        val startCol = col - col % 3
        for (i in 0 until 3) {
            for (j in 0 until 3) {
                if (board[startRow + i][startCol + j] == num) return false
            }
        }
        return true
    }
}
