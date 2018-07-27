class Solution807 {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
            int[] lrSkyline=new int[grid.length];
	        int[] tbSkyline=new int[grid.length];
	        
	        for(int i=0; i<grid.length; i++){
	        	lrSkyline[i]=grid[i][0];
	            for(int j=0; j<grid.length-1; j++){
	                if(lrSkyline[i] < grid[i][j+1])
	                    lrSkyline[i] = grid[i][j+1];
	            }
	        }
	        for(int j=0; j<grid.length; j++){
	        	tbSkyline[j]=grid[0][j];
	            for(int i=0; i<grid.length-1; i++){
	                if(tbSkyline[j] < grid[i+1][j])
	                    tbSkyline[j]=grid[i+1][j];
	            }
	        }
	     
	        int count=0;
	        for(int i=0; i<grid.length; i++){
	            for(int j=0; j<grid.length; j++){
	                count+= lrSkyline[i] < tbSkyline[j] ? (lrSkyline[i]-grid[i][j]) : (tbSkyline[j]-grid[i][j]);
	            }
	        }
	        return count;

    }
}