package com.company.appendix;

public class Student extends Person {

    private String studentID;
    private float GPA;

    public Student(String studentID, float GPA){
        super();
        this.studentID = studentID;
        this.GPA = GPA;
    }

    public String getStudentID(){
        return studentID;
    }

    public float getGPA(){
        return GPA;
    }

    public void setGPA(float GPA){
        this.GPA = GPA;
    }

//    private String oneAttribute;
//    public void setOneAttribute(String oneAttribute){
//        this.oneAttribute = oneAttribute;
//    }

    @Override
    public boolean equals(Object obj){
        Student stu = (Student)obj;
        return studentID == stu.getStudentID();
    }
}
