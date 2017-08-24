package bitcamp.bigdata3.app01;

import android.os.Parcel;
import android.os.Parcelable;

// 객체를 Intent에 담아서 다른 액티비티로 보내려면
// 그 객체는 Parcelable 인터페이스의 구현체여야 한다.
public class Member implements Parcelable {
    int no;
    String name;
    String email;
    String password;

    @Override
    public String toString() {
        return "Member{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Member() {}

    public Member(int no, String name, String email, String password) {
        this.no = no;
        this.name = name;
        this.email = email;
        this.password = password;
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
    }

    public static final Parcelable.Creator<Member> CREATOR
            = new Parcelable.Creator<Member>() {
        public Member createFromParcel(Parcel in) {
            Member member = new Member();
            member.setNo(in.readInt());
            member.setName(in.readString());
            member.setEmail(in.readString());
            member.setPassword(in.readString());
            return member;
        }

        public Member[] newArray(int size) {
            return new Member[size];
        }
    };
}
