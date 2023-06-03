package mypackage;

import java.util.ArrayList;
import java.util.Collections;
 
class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	@Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

   
}






public class ComparableDemo 
	{
	    public static void main(String[] args) {
			
		
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("John", 25));
        students.add(new Student("Jane", 22));
        students.add(new Student("Jim", 30));

        //Collections.sort(students);
                        
            students.stream().sorted((e1,e2)->e1.getName().
        		   compareTo(e2.getName())).forEach(System.out::println);;
			/*
			 * for (Student student : students) { System.out.println(student.getName() + " "
			 * + student.getAge()); }
			 */
	 }
}
