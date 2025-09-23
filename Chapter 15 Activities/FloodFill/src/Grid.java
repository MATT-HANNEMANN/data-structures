    // Simple class to hold a pair of integers (row, column)
    private static class Pair {
        int row, col;
        Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
public class Grid
{
    private static final int SIZE = 10;
    int[][] pixels = new int[SIZE][SIZE];
    

   

    /**
     * Flood fill, starting with the given row and column.
    */

    public void floodfill(int row, int column)
    {
        java.util.Stack<Integer> rowStack = new java.util.Stack<>();
        java.util.Stack<Integer> colStack = new java.util.Stack<>();
        int count = 1;

        Pair start = new Pair(row, column);
        rowStack.push(start.row);
        colStack.push(start.col);

        
        while (!rowStack.isEmpty()) {
            int r = rowStack.pop();
            int c = colStack.pop();
            if (r >= 0 && r < SIZE && c >= 0 && c < SIZE && pixels[r][c] == 0) {
                pixels[r][c] = count;
                count++;

                rowStack.push(r - 1); colStack.push(c);     // North
                rowStack.push(r);     colStack.push(c + 1); // East
                rowStack.push(r + 1); colStack.push(c);     // South
                rowStack.push(r);     colStack.push(c - 1); // West
            }
        }
    }

    @Override
    public String toString()
    {
        String r = "";
        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
                r = r + String.format("%4d", pixels[i][j]);
            r = r + "\n";
        }
        return r;
    }
   
}