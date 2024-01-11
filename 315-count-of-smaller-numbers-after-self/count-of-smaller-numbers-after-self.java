class Solution {
    public List<Integer> countSmaller(int[] nums) {

        List<Integer> arr=new ArrayList<Integer>();
        List<Integer> res=new ArrayList<Integer>();
        int l=nums.length;

        for(int i=0;i<nums.length;i++){
            arr.add(nums[i]);
        }

        Collections.sort(arr);

        for(int i=0;i<nums.length-1;i++){

            int index = getFirstIndex(arr, nums[i]);

            // System.out.println("arr array nums i "+nums[i]+" m:"+index);
            // for(int j=0;j<arr.size();j++){
            //     System.out.print(arr.get(j)+" ");
            // }
            // System.out.println();
            
            res.add(index);

            arr.remove(index);

            
        }

        res.add(0);

        return(res);
        
    }

    public int getFirstIndex(List<Integer> arr,int n){

        int f=0;
        int l=arr.size()-1;
        int m=0;
        while(f<=l){

            m=(f+l)/2;

            if(arr.get(m)==n && (m-1<0 || arr.get(m-1)<n)){
                break;
            }
            else if(arr.get(m)<n){
                f=m+1;
            }
            else{
                l=m-1;
            }

        }

        return(m);

    }
}