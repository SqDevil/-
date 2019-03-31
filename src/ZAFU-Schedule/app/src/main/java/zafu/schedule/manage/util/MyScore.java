package zafu.schedule.manage.util;

import java.io.Serializable;

/*
 * JavaBean成绩类
 */
public class MyScore implements Serializable{
          public String getMy_class() {
                    return my_class;
          }

          public void setMy_class(String my_class) {
                    this.my_class = my_class;
          }

          public String getMy_Score() {
                    return my_score;
          }

          public void setMy_score(String my_score) {
                    this.my_score = my_score;
          }

          private String my_class;
          private String my_score;
}

