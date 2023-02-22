import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args){
        ArrayList ob1 = new ArrayList();
        ob1.add(1);
        ob1.add(2);
        ob1.add(3);
        ob1.add(4);
        ob1.add(5);
        for(Object o:ob1)
        System.out.println(o+",");
        ArrayList ob2 = new ArrayList();
        ob2.add(3);
        ob2.add(4);
        ob2.add(4);
        ob2.add(5);
        ob2.add(6);
        System.out.println("obj2 contains");
        for(Object o:ob1)
        System.out.println(o+",");
        // ob1.remove(obj2);
        ob1.removeAll(ob2);
        ob1.addAll(ob2);
        System.out.println("obj1 contains");
        for(Object o:ob1)
        System.out.println(o+",");
        
        //rewoke the duipliacte value from array list
        
        for(int i=0;i<ob1.size();i++)
        {
            if(ob1.indexOf(ob1.get(i))==ob1.lastIndexOf(ob1.get(i)))
            {
                ob1.remove(ob1.lastIndexOf(ob1.get(i)));
                i--;
            }
        }
        System.out.println("obj1 contains_________________");



        for(Object o:ob1)
        System.out.println(o+",");


        
    }
}