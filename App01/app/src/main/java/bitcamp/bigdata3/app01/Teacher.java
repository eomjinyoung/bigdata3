package bitcamp.bigdata3.app01;

import java.util.ArrayList;

/**
 * Created by bit11 on 2017-08-30.
 */

public class Teacher extends Member {
    String homepage;
    String facebook;
    String twitter;

    @Override
    public String toString() {
        return "Teacher{" +
                "homepage='" + homepage + '\'' +
                ", facebook='" + facebook + '\'' +
                ", twitter='" + twitter + '\'' +
                '}' + super.toString();
    }

    public Teacher() {}

    public Teacher(int no, String name, String email, ArrayList<String> photoList) {
        super(no, name, email, photoList);
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }
}





