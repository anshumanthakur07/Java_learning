import java.io.File;
import java.io.IOException;

class filedemo
{
    public static void main(String args[]) throws IOException
    {
        //    File ob1=new File("D:\\LPU 4th Semester\\CSE310\\java_program\\file1.txt");
        //    ob1.createNewFile();
        // //    ob1.delete();
        //    File ob2=new File("D:\\LPU 4th Semester\\CSE310\\java_program\\file2renamed.txt");
        //    ob1.renameTo(ob2);
           File ob3=new File("D:\\LPU 4th Semester\\CSE310\\java_program\\K21PD.txt");
           ob3.createNewFile();
             File f[]=ob3.listFiles();
             for(File k:f)
             {
                if(k.getName().endsWith(".class"))
                k.delete();
             }
    }
}