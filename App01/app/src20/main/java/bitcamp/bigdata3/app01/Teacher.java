package bitcamp.bigdata3.app01;

import org.json.JSONArray;
import org.json.JSONObject;

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

    public static Teacher valueOf(JSONObject jsonObject) throws Exception {
        Teacher teacher = new Teacher();

        teacher.setNo(jsonObject.getInt("no"));
        teacher.setName(jsonObject.getString("name"));
        teacher.setTel(jsonObject.getString("tel"));
        teacher.setEmail(jsonObject.getString("email"));
        teacher.setHomepage(jsonObject.getString("homepage"));
        teacher.setFacebook(jsonObject.getString("facebook"));
        teacher.setTwitter(jsonObject.getString("twitter"));

        ArrayList<String> photoList = new ArrayList<>();
        JSONArray array = jsonObject.getJSONArray("photoList");
        for (int i = 0; i < array.length(); i++) {
            photoList.add(array.getString(i));
        }
        teacher.setPhotoList(photoList);

        return teacher;
    }
}





