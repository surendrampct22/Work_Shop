package com.org.oop;

public class AggregationCollege {
    String collageName;
    AggregationStudent student;
    public AggregationCollege(String collageName,AggregationStudent student){
        this.collageName=collageName;
        this.student=student;
    }
    public void display(){
        System.out.println("Collage Name : "+collageName);
        System.out.println("Student Name : "+student.name);
        System.out.println("Student Id : "+student.id);
    }
}
