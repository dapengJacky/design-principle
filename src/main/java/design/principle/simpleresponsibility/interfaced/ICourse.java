package design.principle.simpleresponsibility.interfaced;

/**
 * Created by Jacky on 2020/2/16.
 */
public interface ICourse {

    String getCourseName();
    byte[] getCourseVideo();

    void studyCourse();
    void refundCourse();
}
