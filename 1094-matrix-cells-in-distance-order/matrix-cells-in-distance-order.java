class Solution {
    public int[][] allCellsDistOrder(int height, int width, int yCenter, int xCenter) {
        int maxDistance = Math.max(yCenter, height - yCenter) + Math.max(xCenter, width - xCenter);

        ArrayList<int[]> result = new ArrayList<>();
        result.add(new int[]{yCenter, xCenter});

        for (int distance = 1; distance <= maxDistance; distance++) {
            addCellsInDiagonal(height, width, distance, xCenter, yCenter - distance, result, -1, 1);
            addCellsInDiagonal(height, width, distance, xCenter - distance, yCenter, result, 1, 1);
            addCellsInDiagonal(height, width, distance, xCenter, yCenter + distance, result, 1, -1);
            addCellsInDiagonal(height, width, distance, xCenter + distance, yCenter, result, -1, -1);
        }

        return result.toArray(new int[][]{});
    }

    private static void addCellsInDiagonal(int height, int width, int distance, int x, int y, ArrayList<int[]> result, int xIncrement, int yIncrement) 
    {
        for (int i = distance; i > 0; i--) {
            if (isWithinBounds(x, y, width, height)) {
                result.add(new int[]{y, x});
            }
            x += xIncrement;
            y += yIncrement;
        }
    }

    private static boolean isWithinBounds(int x, int y, int width, int height) {
        return x >= 0 && y >= 0 && x < width && y < height;
    }
}