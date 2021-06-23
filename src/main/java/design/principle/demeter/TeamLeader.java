package design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jacky on 2020/2/16.
 */
public class TeamLeader {

    public void commandCheckNumber(Employee employee){
        employee.checkNumberOfCourses();
    }
}
