public class pair{

    public static void setpair(int n[]){
        int top=0;
        for(int i=0;i<n.length;i++){
            int curr=n[i];
            for(int j=i+1;j<n.length;j++){
System.out.println("("+curr+","+n[j]+")");
top++;
            }
        }
        System.out.println("total pairs are:"+top);
        System.out.print(" ");
    }
    public static void main(String args[]){
        int n[]={2,4,6,8,10,12};
        setpair(n);
    }
}