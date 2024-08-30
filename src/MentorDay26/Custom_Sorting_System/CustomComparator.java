package MentorDay26.Custom_Sorting_System;

import java.util.Comparator;

public class CustomComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int gradeComparison = Integer.compare(o2.getGrade(), o1.getGrade());
        if (gradeComparison != 0) {
            return gradeComparison;
        } else {
            return o1.getName().compareTo(o2.getName());
        }
//        if (o1.getGrade()==o2.getGrade()){
//            return o1.getName().compareTo(o2.getName());
//        }
//        return Integer.compare(o2.getGrade(), o1.getGrade());
    }
}