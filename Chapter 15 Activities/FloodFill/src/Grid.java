public class Grid
{
    private static final int SIZE = 10;
    int[][] pixels = new int[SIZE][SIZE];
    
    private int[][] grid = new int[10][10];

   

    /**
     * Flood fill, starting with the given row and column.
    */
    public void floodfill(int row, int column)
    {
        // Stack for rows and columns
        java.util.Stack<Integer> rowStack = new java.util.Stack<>();
        java.util.Stack<Integer> colStack = new java.util.Stack<>();

        // Counter to fill the grid in order
        int count = 1;

        // Push the starting position
        rowStack.push(row);
        colStack.push(column);

        // Repeat until stack is empty
        while (!rowStack.isEmpty()) {
            int r = rowStack.pop();
            int c = colStack.pop();

            // Check bounds and if not filled
            if (r >= 0 && r < SIZE && c >= 0 && c < SIZE && pixels[r][c] == 0) {
                // Fill the cell with the current count
                pixels[r][c] = count;
                count++;

                // Push unfilled neighbors (N, E, S, W)
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