public class Teacher extends Person {
    private static int numCourses = 2;
    private String courses[] = new String[numCourses]; 
    private int nextCourse = 0;

    public Teacher(String name, String address) {
        super(name, address);
    }

    public boolean addCourse(String course) {
        if (nextCourse < numCourses) {
            courses[nextCourse] = course;
            nextCourse++;
            return true;
        }
        return false;
    }

    public boolean removeCourse(String course) {
        for (int i = 0; i < nextCourse; i++) {
            if (courses[i].equals(course)) {
                
                for (int j = i; j < nextCourse - 1; j++) {
                    courses[j] = courses[j + 1];
                }
                courses[nextCourse - 1] = null; 
                nextCourse--;
                return true;
            }
        }
        return false;
    }
}