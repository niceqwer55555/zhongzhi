public class One {
    public static void main(String args[]){
        int i,s=0;
        for (i=1;i<=100;i++)
        {
            if(i%3==0)
                continue;
            s+=i;

        }
        System.out.println("s="+s);
    }
}
