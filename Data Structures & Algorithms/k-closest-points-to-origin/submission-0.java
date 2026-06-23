class Solution {
    public double calcDistance(int[] points){
        double dist=0;
        dist=(points[0]*points[0])+(points[1]*points[1]);
        dist=Math.pow(dist,0.5);
        return dist;
    }
    
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<DistDTO> minHeap=new PriorityQueue<>((t1,t2)->(Double.compare(t1.getDist(),t2.getDist())));
        for(int[] point:points){
            double dist=calcDistance(point);
            DistDTO dto=new DistDTO(dist,point);
            minHeap.offer(dto);
        }
        int[][] res=new int[k][2];
        int i=0;
        while(k>0 && minHeap.size()>0){
            DistDTO dto=minHeap.poll();
            res[i]=dto.getPoint();
            i++;k--;
        }
        return res;
    }
}
public class DistDTO{
     public double distance;
    public int[] point;
    public DistDTO(double distance,int[] point){
        this.distance=distance;
        this.point=point;
    }
    public double getDist(){
        return distance;
    }
    public int[] getPoint(){
        return this.point;
    }
}
