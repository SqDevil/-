package zafu.schedule.manage.model;

public class Room {
          private String teacher;
          private String courseName;
          private String classRoom;
          private int startTime;
          private int countTime;

          public String getTeacher() {
                    return teacher;
          }

          public void setTeacher(String teacher) {
                    this.teacher = teacher;
          }

          public int getStartTime() {
                    return startTime;
          }

          public void setStartTime(int startTime) {
                    this.startTime = startTime;
          }

          public String getCourseName() {
                    return courseName;
          }

          public void setCourseName(String courseName) {
                    this.courseName = courseName;
          }

          public int getCountTime() {
                    return countTime;
          }

          public void setCountTime(int countTime) {
                    this.countTime = countTime;
          }

          public String getClassRoom() {
                    return classRoom;
          }

          public void setClassRoom(String classRoom) {
                    this.classRoom = classRoom;
          }


}
