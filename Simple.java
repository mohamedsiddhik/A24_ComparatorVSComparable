

package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Simple
{
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        arrayList.add(new StudentComparable(101,"vijay",23));
        arrayList.add(new StudentComparable(105,"ajay",28));
        arrayList.add(new StudentComparable(108,"bhuvi",21));

        Collections.sort(arrayList);
        Iterator itr = arrayList.iterator();
        while (itr.hasNext()){
            StudentComparable st = (StudentComparable) itr.next();
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
    }
}