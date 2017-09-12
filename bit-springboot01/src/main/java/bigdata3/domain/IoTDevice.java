package bigdata3.domain;

public class IoTDevice {
  long no;
  String email;
  String serialNo;
  
  public IoTDevice() {}
  
  public IoTDevice(long no, String email, String serialNo) {
    this.no = no;
    this.email = email;
    this.serialNo = serialNo;
  }

  public long getNo() {
    return no;
  }

  public void setNo(long no) {
    this.no = no;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getSerialNo() {
    return serialNo;
  }

  public void setSerialNo(String serialNo) {
    this.serialNo = serialNo;
  }
  
  
}
