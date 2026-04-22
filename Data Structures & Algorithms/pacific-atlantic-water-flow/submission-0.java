class Solution {

    class Pair{
        int row;
        int col;

        Pair(int row, int col){
            this.row = row;
            this.col = col;
        }
    }

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        
        Queue<Pair> pacific = new LinkedList<>();
        Queue<Pair> atlantic = new LinkedList<>();

        int rows = heights.length;
        int cols = heights[0].length;

        int[][] avisited = new int[rows][cols];
        int[][] bvisited = new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(i==0 || j== 0){
                    pacific.add(new Pair(i,j));
                    avisited[i][j]=1;
                }
                if(i== rows-1 || j== cols-1){
                    atlantic.add(new Pair(i,j));
                    bvisited[i][j]=1;
                }
            }
        }

        bfs(heights, pacific, avisited);
        bfs(heights, atlantic, bvisited);
        List<List<Integer>> result = new ArrayList<>();

        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(avisited[i][j] == 1 && bvisited[i][j] ==1){
                    List<Integer> coo = new ArrayList<>();
                    coo.add(i);
                    coo.add(j);
                    result.add(coo);
                }
            }
        }
        return result;
    }


    void bfs(int[][] heights, Queue<Pair> pacific, int[][] visited){
        int[][] directions = new int[][]{
            {0,1},
            {1,0},
            {0,-1},
            {-1,0}
        };

        int rows = heights.length;
        int cols = heights[0].length;

        while(!pacific.isEmpty()){
            Pair current = pacific.poll();
            int cRow = current.row;
            int cCol = current.col;
            
            for(int[] direction:directions){
                int nRow = current.row+direction[0];
                int nCol = current.col+direction[1];
                
                if(nRow >=0 && nRow <rows
                && nCol >=0 && nCol<cols &&
                heights[cRow][cCol] <= heights[nRow][nCol]
                && visited[nRow][nCol] !=1){
                    visited[nRow][nCol] =1;
                    pacific.add(new Pair(nRow,nCol));
                }
        }
    }



    }
}
