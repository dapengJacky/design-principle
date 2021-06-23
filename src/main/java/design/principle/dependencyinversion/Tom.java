package design.principle.dependencyinversion;

/**
 * Created by Jacky on 2020/2/16.
 */
public class Jacky {
//    public void studyJavaCourse(){
//        System.out.println("Jacky正在学习Java课程");
//    }
//
//    public void studyPythonCourse(){
//        System.out.println("Jacky正在学习Python课程");
//    }
//
//    public void studyAICourse(){
//        System.out.println("Jacky正在学习AI课程");
//    }

//    public void study(ICourse course){
//        course.study();
//    }

    private ICourse iCourse;

//    public Jacky(ICourse iCourse) {
//        this.iCourse = iCourse;
//    }

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void study(){
        iCourse.study();
    }
}
