class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
            int m = arr.length , n = arr[0].length;
            int i = 0 , j = n - 1;
            while(i<m && j>=0){
                if(arr[i][j] > target) j--;
                else if(arr[i][j] < target) i++;
                else return true;
            }
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[0].length;j++){
        //         if(arr[i][j]==target) return true;
        //     }
        // }
        return false;
    }
}