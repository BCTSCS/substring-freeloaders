/*
 * Represents a course
 */
public class Course {
  
    private String courseCode;    // The course code for a course formatted as "courseName-courseNumber"
  
    /*
     * Sets courseCode to the specified course code
     */
    public Course(String courseCode) {
      this.courseCode = courseCode;
    }
  
    /*
     * Returns the course code
     */
    public String getCourseCode() {
      return courseCode;
    }
  
    /*
     * Returns a substring containing the course number
     */
    public String getCourseNumber() {
      /* ----------------------------------- TO DO -----------------------------------
       * ✅ Use the substring() method to return a substring containing the course
       * code from the courseCode instance variable.
       * -----------------------------------------------------------------------------
       */
      int index = courseCode.indexOf("-");
      return courseCode.substring(index+1);
    }
    
  }