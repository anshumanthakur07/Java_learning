public class ContinueDemo {
    public static void main(String[] rk)
    {
        String str="she saw a ship in the sea!";
        int size=str.length();
        int count=0;
        for(int i=0;i<size;i++)
        {
            if(str.charAt(i)!='s')
            continue;
            count++;
        }
        System.out.println("Number of s in "+str+"="+count);
    }
    
}
