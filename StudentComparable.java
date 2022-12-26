

package comparable;

public class StudentComparable implements Comparable
{
    int rollno;
    String name;
    int age;
    StudentComparable(int rollno, String name, int age){
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }


    @Override
    public int compareTo(Object obj) {
        StudentComparable st = (StudentComparable) obj;
        if (age== st.age)
            return 0;
        else if (age > st.age)
            return 1;
        else
            return -1;
    }
}