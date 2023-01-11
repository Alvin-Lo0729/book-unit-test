package idv.alvin.service;

import idv.alvin.bean.Course;
import idv.alvin.bean.Transcript;

import java.util.List;

public class ScholarshipService {
    public int calculate(Transcript transcript) {
        List<Course> courseList = transcript.getCourseList();
        if (courseList.isEmpty()) {
            return 0;
        }

        int total = courseList.size();
        int achieved = 0;
        for (Course course : courseList) {
            if (course.getScore() >= 80) {
                achieved++;
            }
        }
        double rate = (double) achieved / total;
        if (rate >= (double) 1 / 2) {
            return 10_000;
        } else if (rate >= (double) 1 / 3) {
            return 5_000;
        } else {
            return 0;
        }
    }
}
