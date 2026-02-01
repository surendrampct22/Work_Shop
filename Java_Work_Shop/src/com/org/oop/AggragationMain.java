package com.org.oop;

public class AggragationMain {

    public static void main(String[] args) {
//         Student is a part of college but college is not a part of student here
//         we can say student object is not dependent on college object
        AggregationStudent student = new AggregationStudent(101, "Surendra Pratap SIngh");
        AggregationCollege college = new AggregationCollege("Engineering College", student);
        college.display();
    }
}
