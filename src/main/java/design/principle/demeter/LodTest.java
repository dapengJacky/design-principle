package design.principle.demeter;

/**
 * Created by Jacky on 2020/2/16.
 */
public class LodTest {

    public static void main(String[] args) {
        TeamLeader teamLeader = new TeamLeader();
        Employee employee = new Employee();
        teamLeader.commandCheckNumber(employee);
    }
}
