package StudentProffessorTest;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

import com.techlabs.studentProfessor.Branch;
import com.techlabs.studentProfessor.ISalaridEmployee;
import com.techlabs.studentProfessor.Preson;
import com.techlabs.studentProfessor.Proffesor;
import com.techlabs.studentProfessor.Student;

public class Main {
	public static void main(String[] args) {

		Student s1 = new Student(101, "abc", "10sep1996", Branch.COMPUTER);
		Proffesor p1 = new Proffesor(101, "pqr", "1dec1985", 12000);

		StudetntInfo(s1);
		proffesorInfo(p1);

	}

	public static void StudetntInfo(Student s) {
		System.out.println("Name:" + s.getId());
		System.out.println("Address:" + s.getAddress());
		System.out.println("Dob:" + s.getDob());
		System.out.println("Branch:" + s.getBrach());
		System.out.println("");

	}

	public static void proffesorInfo(Proffesor p) {
		System.out.println("Name:" + p.getId());
		System.out.println("Address:" + p.getAddress());
		System.out.println("Dob:" + p.getDob());
		System.out.println("Salary:" + p.calsal());
	}

}
