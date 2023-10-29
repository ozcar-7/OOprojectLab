public class Student extends Person
{
    private static int numCourses = 2;
    private String courses[];
    private int grades[];
    private int nextCourse = 0;
    

    public Student(String name, String address)
        {
            super(name, address);
            this.courses = new String[numCourses];
            this.grades = new int[numCourses];
        }

    public void addCourseGrade(String course, int grades)
        {
            this.courses[nextCourse] = course;
            this.grades[nextCourse++] = grades;
    
        }
    
    public void printGrades()
        {
            System.out.println("Student: " + super.getName() + "(" + super.getAddress() + ")" + courses[0] + ":" + grades[0] + " " + courses[1] + ":" + grades[1]);
        }
    
    public double getAverageGrade()
        {
            return (grades[0] + grades[1])  /  2;
        }


    
}
