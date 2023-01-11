package idv.alvin.bean;

import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data
public class Transcript {
    private List<Course> courseList;

    public Transcript(Course... courses) {
        this.courseList = Arrays.asList(courses);
    }
}
