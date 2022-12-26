

package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ComparatorExample
{
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Student(101,"vijay",23));
        arrayList.add(new Student(106,"ajay",27));
        arrayList.add(new Student(105,"jai",25));
        arrayList.add(new Student(103,"bhuvi",29));

        System.out.println("-------------------------------------------");
        System.out.println("Sorting by name...");
        Collections.sort(arrayList, new NameComparator());
        Iterator itr = arrayList.iterator();
        while (itr.hasNext()){
            Student st = (Student) itr.next();
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
        System.out.println("-------------------------------------------");
        System.out.println("Sorting by age...");
        Collections.sort(arrayList, new AgeComparator());
        Iterator itr2 = arrayList.iterator();
        while (itr2.hasNext()){
            Student st = (Student) itr2.next();
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
    }
}