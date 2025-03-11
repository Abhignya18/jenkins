import java.util.*;
import java.lang.*;
public class Main
{
  <T extends Number> list<T> findevenNumbers (List<T> list)
 { 
   List<T> Num=new ArrayList<>();
   for ( T even:list)
   {
     if(even.intValue()%2==0)
     Num.add(even);
   }
 return Num;
}
public static void main(String [] s)
{
  List<Integer> intlist=List.of(2,3,4,5,6);
  List<Double> doublelist=List.of(3.5,1.2,4.4,6.7);
  Main obj=new Main();
  List<T> evenintegers=obj.findevenNumbers(intlist);
  List<T> evendoubles=obj.findevenNumbers(doublelist); 
  System.out.println("EVEN Integers"+evenintegers);
  System.out.println("Even double "+evendoubles);
}
}