package matrixStudy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SudokuSolver {

	public static void main(String[] args) {
		char[][] board = {
		                  {'8','3','.','.','7','.','.','.','.'},
		                  {'6','.','.','1','9','5','.','.','.'},
		                  {'.','9','8','.','.','.','.','6','.'},
		                  {'8','.','.','.','6','.','.','.','3'},
		                  {'4','.','.','8','.','3','.','.','1'},
		                  {'7','.','.','.','2','.','.','.','6'},
		                  {'.','6','.','.','.','.','2','8','.'},
		                  {'.','.','.','4','1','9','.','.','5'},
		                  {'.','.','.','.','8','.','.','7','9'}
		                };
		
		System.out.println(isValidSudoku(board));
	}
	
public static boolean isValidSudoku(char[][] board) {
        
        for(int i = 0; i < board.length; ++i) {
            if(hasDuplicate(board, i, i+1, 0, board[0].length)){
                return false;
            }
        }
        
        for(int j = 0; j < board[0].length; ++j) {
            if(hasDuplicate(board, 0, board.length, j, j+1)){
                return false;
            }
        }
        
        int section = (int) Math.sqrt(board.length);
        for(int p = 0; p < section; ++p){
            for(int q = 0; q < section; ++q){
                if(hasDuplicate(board, section*p, section*p+1, section*q, section*q+1)){
                    return false;
                }
            }
        }
        
        return true;
    }
    
    public static boolean hasDuplicate(char[][] board, int row_str, int row_end, int col_str, int col_end) {
        List<Boolean> isPresent = new ArrayList<Boolean>(Collections.nCopies(board.length + 1,false));
        
        for(int i = row_str; i < row_end; ++i){
            for(int j = col_str; j < col_end; ++j) {
                if(board[i][j] != '.'){
                	if(isPresent.get(Character.getNumericValue(board[i][j]))){
                        return true;
                	}
                	isPresent.set(Character.getNumericValue(board[i][j]),true);
                }
                  
                //System.out.println("Setting true for: " + Character.getNumericValue(board[i][j]));
                
            }
        }
        return false;
    }
	
	
}
