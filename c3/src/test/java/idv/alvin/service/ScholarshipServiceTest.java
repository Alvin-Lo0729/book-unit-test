package idv.alvin.service;

import idv.alvin.bean.Course;
import idv.alvin.bean.Transcript;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ScholarshipServiceTest {
    @Test
    @DisplayName("測試沒有資料的狀態")
    public void NO_courses() {
        ScholarshipService service = new ScholarshipService();
        int actual = service.calculate(new Transcript());
        Assertions.assertEquals(0, actual);
    }

    @Test
    @DisplayName("測試有資料的狀態")
    public void full_scholarship() {
        ScholarshipService service = new ScholarshipService();
        int actual = service.calculate(new Transcript(
                new Course("Algorithm", 70),
                new Course("Computer Internet", 80),
                new Course("Operating System", 90)
        ));
        Assertions.assertEquals(10000, actual);
    }
}
