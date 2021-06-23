package design.principle.dependencyinversion;

/**
 * Created by Jacky on 2020/2/16.
 */
public class DipTest {

    public static void main(String[] args) {
        //=====  V1  ========
//        Jacky tom = new Jacky();
//        tom.studyJavaCourse();
//        tom.studyPythonCourse();
//        tom.studyAICourse();


        //=====  V2  ========
//        Jacky tom = new Jacky();
//        tom.study(new JavaCourse());
//        tom.study(new PythonCourse());


        //=====  V3  ========
//        Jacky tom = new Jacky(new JavaCourse());
//        tom.study();


        //=====  V4  ========
        Jacky tom = new Jacky();
        tom.setiCourse(new JavaCourse());
        tom.study();
    }
}
