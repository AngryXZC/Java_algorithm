package imook_algorithm.sort;

/**
 * @author xzc
 * @date 2024/3/4 23 21:10
 * @description
 */
public class Student implements Comparable<Student>{

    private String name;
    private int score;

    public Student(String name, int score){
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(Student another){
        if(this.score < another.score)
            return -1;
        else if(this.score == another.score)
            return 0;
        return 1;
    }

    @Override
    public boolean equals(Object student){

        if(this == student)
            return true;

        if(student == null)
            return false;

        if(this.getClass() != student.getClass())
            return false;

        Student another = (Student)student;
        return this.name.equals(another.name);
    }

    @Override
    public String toString(){
        return "Student(name: " + name + ", score: " + Integer.toString(score) + ")";
    }
}
