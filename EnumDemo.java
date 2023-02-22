// public class EnumDemo {
//     public enum Season{SUMMER,WINTER,SPRING}
//     public static void main(String[] rk)
//     {
//         Season s[]=Season.values();
//         for(int i=0;i<s.length;i++)
//         {
//             System.out.println(s[i]);
//         }
//         Season k= Season.WINTER;
//         switch(k)
//         {
//             case SUMMER:
//             System.out.println("summer season");
//             break;
//             case WINTER:
//             System.out.println("winter season");
//             break;
//             case SPRING:
//             System.out.println("spring season");
//             break;

//         }
//     }
// }

// enum Season{SUMMER,WINTER,SPRING}
// public class EnumDemo {
//     public static void main(String[] rk)
//     {
//         Season s[]=Season.values();
//         for(int i=0;i<s.length;i++)
//         {
//             System.out.println(s[i]);
//         }
//         Season k= Season.WINTER;
//         switch(k)
//         {
//             case SUMMER:
//             System.out.println("summer season");
//             break;
//             case WINTER:
//             System.out.println("winter season");
//             break;
//             case SPRING:
//             System.out.println("spring season");
//             break;

//         }
//     }
// }

// public class EnumDemo {
//     public static void main(String[] rk)
//     {
//         enum Season {SUMMER,WINTER,SPRING}//can not make enum inside a main
//         Season s[]=Season.values();
//         for(int i=0;i<s.length;i++)
//         {
//             System.out.println(s[i]);
//         }
//         Season k= Season.WINTER;
//         switch(k)
//         {
//             case SUMMER:
//             System.out.println("summer season");
//             break;
//             case WINTER:
//             System.out.println("winter season");
//             break;
//             case SPRING:
//             System.out.println("spring season");
//             break;

//         }
//     }
// }


// public class EnumDemo {
//     private enum mwd
//     {
//         january(31),february(28),march(31);
//         int days;
//         mwd(int a)
//         {
//             days=a;
//         }
//     }
   
    
//     public static void main(String[] argu) {
//         for(int j=0;j<3;j++)
//         {

        
//         enum fol
//         {
//             color,red,white;
              
//         }
//         fol s[]=fol.values();
//         for(int i=0;i<s.length;i++)
//         {
//      System.out.println(s[i]);
//         }

//     }
        
//         for(mwd q:mwd.values())
//         {
//             System.out.println(q.days);
//         }
        
//     }
    
// }
