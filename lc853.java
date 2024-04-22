lass Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        double[] timeArr=new double[target];//creating a whole array of size target
        int res=0;
        for(int i =0;i<position.length;i++){
            timeArr[position[i]]=(double)(target-position[i])/speed[i];//calculating time to reach destination
        }
        double prev=0.0;
        for(int i=target-1;i>=0;i--){
            double cur=timeArr[i];
            if(cur>prev){   //if cur is greater than prev i.e. if lower postion taking more time to reach destination then it wont meet one ahead of it.
                prev=cur;
                res++;
            }
        }
        return res;
        
    }
}