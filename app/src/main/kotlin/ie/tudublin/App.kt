package ie.tudublin

import java.io.File

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("Usage: sudoku <path-to-board-file>")
        return
    }
    val file = File(args[0])
    if (!file.exists()) {
        println("File not found: ${args[0]}")
        return
    }
    val board = Array(9) { IntArray(9) }
    try {
        val lines = file.readLines()
        for (i in 0 until 9) {
            val numbers = lines[i].trim().split(" ").filter { it.isNotEmpty() }
            for (j in 0 until 9) {
                board[i][j] = numbers[j].toInt()
            }
        }
    } catch (e: Exception) {
        println("Invalid board format in file.")
        return
    }
    println("Input Board:")
    printBoard(board)
    val sudoku = Sudoku()
    val solved = sudoku.solve(board)
    if (solved) {
        println("\nSolved Board:")
        printBoard(board)
    } else {
        println("\nCould not find a solution within a reasonable time.")
    }
}

fun printBoard(board: Array<IntArray>) {
    for (row in board) println(row.joinToString(" "))
}
