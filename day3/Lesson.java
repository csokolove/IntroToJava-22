public class Lesson {
    String teacherName;
    String day;

    public Lesson(String teacher, String dayName) {
        teacherName = teacher;
        day = dayName;
    }

    public static void main(String[] args) {
        Lesson myLesson = new Lesson("Charlie", "Wednesday");
        System.out.println(myLesson.day);
    }
}
