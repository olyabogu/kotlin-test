//import static com.kotlinplayground.CourseKt.printName;
//import static com.kotlinplayground.CourseKt.printNameFrom;

public class InvokeKotlinFromJava {
    public static void main(String[] args) {
        var course = new com.kotlinplayground.Course(
                1,
                "Build RestFul APis using SpringBoot and Kotlin", "Dilip"
//                com.kotlinplayground.CourseCategory.DESIGN
        );
        course.noOfCourses = 11;
        System.out.println("noOfCourses " + course.noOfCourses);

        System.out.println("course: " + course);

//        printName();
//        printName("abc");
//        com.kotlinplayground.CourseUtils.printNameFrom();
//        com.kotlinplayground.CourseUtils.printNameFrom("abc");
        com.kotlinplayground.Course.Companion.printNameFromCourse("abc");
        com.kotlinplayground.Course.printNameFromCourse("abc");
        com.kotlinplayground.Authenticate.INSTANCE.authenticate("Olga", "abc");
        com.kotlinplayground.Authenticate.authenticate("Olga", "abc");
    }
}
