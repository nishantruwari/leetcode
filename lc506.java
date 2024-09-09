class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] str=new String[score.length];

        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);

        for(int i:score){
            pq.add(i);
        }

        for(int i=0;i<score.length;i++){
            int target=pq.poll();
            for(int j=0;j<score.length;j++){
                if(target==score[j]){
                    if(i==0){
                        str[j]="Gold Medal";
                    }else if(i==1){
                        str[j]="Silver Medal";
                    }else if(i==2){
                        str[j]="Bronze Medal";
                    }else {
                        str[j]=""+(i+1);
                    }
                }
            }
        }
        return str;

        
    }
}
