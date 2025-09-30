package Iterator;

import java.util.ArrayList;
import java.util.List;

public class StudentCourse {
    private final String name;
    private final List<Course> courses = new ArrayList<>();

    public StudentCourse(String name) { this.name = name; }
    public String getName() { return name; }

    public void enroll(Course course) {
        courses.add(course);
    }

    public CourseIterator iterator() {
        return new CourseListIterator(courses);
    }

    // Concrete iterator
    private static class CourseListIterator implements CourseIterator {
        private final List<Course> courses;
        private int index = 0;

        public CourseListIterator(List<Course> courses) {
            this.courses = courses;
        }

        @Override
        public boolean hasNext() {
            return index < courses.size();
        }

        @Override
        public Course next() {
            return courses.get(index++);
        }
    }
}

