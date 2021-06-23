package design.principle.simpleresponsibility.interfaced;

/**
 * Created by Jacky on 2020/2/16.
 */
public class CourseImpl implements ICourseInfo,ICourseManager {
    public String getCourseName() {
        return null;
    }

    public byte[] getCourseVideo() {
        return new byte[0];
    }

    public void studyCourse() {

    }

    public void refundCourse() {

    }
}
