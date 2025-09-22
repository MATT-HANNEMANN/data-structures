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
        public void floodFill(int startRow, int startCol) {
        Stack<Pair> stack = new Stack<>();
        int fillValue = 1;
        stack.push(new Pair(startRow, startCol));
        while (!stack.isEmpty()) 
            {
                Pair p = stack.pop();
                int r = p.row, c = p.col;
                if (r >= 0 && r < 10 && c >= 0 && c < 10 && grid[r][c] == 0) 
                {
                    grid[r][c] = fillValue++;
                    stack.push(new Pair(r-1, c)); // north
                    stack.push(new Pair(r+1, c)); // south
                    stack.push(new Pair(r, c-1)); // west
                    stack.push(new Pair(r, c+1)); // east
                }
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
