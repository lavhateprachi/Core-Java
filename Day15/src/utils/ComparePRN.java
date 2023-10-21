package utils;

import java.util.Comparator;

import com.acts.core.Student;

public class ComparePRN implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		if(o1.getMarks()<(o2.getMarks()))
			return -1;
		if(o1.getMarks()>(o2.getMarks()))
			return 1;
		return 0;
	}

}
