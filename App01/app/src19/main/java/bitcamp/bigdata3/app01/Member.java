package bitcamp.bigdata3.app01;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

public class Member implements Parcelable {
    int no;
    String name;
    String tel;
    String email;
    String password;
    List<String> photoList;

    @Override
    public String toString() {
        return "Member{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", photoList=" + photoList +
                '}';
    }

    public Member() {}

    public Member(int no, String name, String email, ArrayList<String> photoList) {
        this.no = no;
        this.name = name;
        this.email = email;
        this.photoList = photoList;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getPhotoList() {
        return photoList;
    }

    public void setPhotoList(List<String> photoList) {
        this.photoList = photoList;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        // 소화물(Parcel) 객체에 데이터를 담을 때 개발자가 순서를 정해 담으면 된다.
        // 다만 받는 쪽에서 꺼낼 때 담은 순서대로 꺼내야 한다.
        dest.writeInt(this.no);
        dest.writeString(this.name);
        dest.writeString(this.email);
        dest.writeString(this.password);
        dest.writeList(this.getPhotoList());
    }

    public static final Creator<Member> CREATOR
            = new Creator<Member>() {
        public Member createFromParcel(Parcel in) {
            Member member = new Member();
            member.setNo(in.readInt());
            member.setName(in.readString());
            member.setEmail(in.readString());
            member.setPassword(in.readString());

            ArrayList<String> photoList = new ArrayList<>();
            in.readList(photoList, String.class.getClassLoader());

            member.setPhotoList(photoList);

            return member;
        }

        public Member[] newArray(int size) {
            return new Member[size];
        }
    };
}
