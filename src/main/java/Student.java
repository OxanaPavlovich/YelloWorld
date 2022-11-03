import java.util.Arrays;

public class Student {
  String surname;
  int name;
  int[]mark={9,8,7};
    int averageMark;

    @Override
    public String toString() {
        return "Student{" +
                "surname='" + surname + '\'' +
                ", name=" + name +
                ", mark=" + Arrays.toString(mark) +
                ", averageMark=" + averageMark +
                '}';
    }

    public void Student(String surname, int name, int[] mark, int averageMark) {
        this.name = name;
        this.surname = surname;
        this.mark = mark;
        this.averageMark=averageMark;
        for (int i = 0; i < mark.length; i++) {
            averageMark  /= mark.length;
            System.out.println( averageMark );
        }

    }
}



