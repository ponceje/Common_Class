import java.util.Arrays;
import java.util.Objects;

class Student{
    String name;
    int id;
    String[] snack;

    public Student(String name, int id, String[] snack) {
        this.name = name;
        this.id = id;
        this.snack = snack;
    }

    public String getName() {
        return name;
    }

    public String[] getSnack() {
        return snack;
    }

    @Override
    public boolean equals(Object o) { //override the equal for this object to get the correct result
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                Objects.equals(name, student.name) &&
                Arrays.equals(snack, student.snack);
    }

    @Override
    public int hashCode() { //same with hashcode have created override for this object
        int result = Objects.hash(name, id);
        result = 31 * result + Arrays.hashCode(snack);
        return result;
    }
}

class Main {

    public static void main(String[] args) {
        String[] snacklist1 = {"Apple","Orange"};
        String[] snacklist2 = {"JunkFood","Ramen","Milktea"};

        Student student1 = new Student("JM",123,snacklist1);
        Student student2 = new Student("JM",123,snacklist1);
        Student student3 = new Student("jeyEm",123,snacklist2);
        System.out.println("--toString--");
        System.out.println(student1.toString()); //converts object into string with 'toString'
        System.out.println("--hashCode--");
        System.out.println(student1.hashCode()); //coverts object into a specific variable with 'hashCode'
        System.out.println("--equals--");
        System.out.println("Comparing student1 and student2 :"+student1.equals(student2));//compare 2 objects with object class 'equals', output should be true
        System.out.println("Comparing student1 and student3 :"+student1.equals(student3));//output should be false
        System.out.println("--charAt--");
        System.out.println("index (1) of student's name :"+student1.getName().charAt(1));//with 'charAt' it will get the character from the corresponding index of the string
        System.out.println("--equals--");
        System.out.println("comparing name of student1 and student2 :" +student1.getName().equals(student2.getName()));//compare 2 strings with string class 'equals',output should be true
        System.out.println("comparing name of student1 and student2 :" +student1.getName().equals(student3.getName()));//output should be false
        System.out.println("--equalsIgnoreCase--");
        System.out.println("comparing name of student1 and 'jm' :"+student1.getName().equalsIgnoreCase("jm"));//it will ignore the case and output should be true

        System.out.println("--Array traverse in forloop--");
        // Print all the array elements
        for (String element: student3.getSnack()) {//with new method on looping for array with only it's element
            System.out.println(element);
        }

    }

}