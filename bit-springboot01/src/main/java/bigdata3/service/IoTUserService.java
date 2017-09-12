package bigdata3.service;

import java.util.List;

import bigdata3.domain.IoTUser;

public interface IoTUserService {
  List<IoTUser> list(int pageNo, int pageSize);
  IoTUser getByEmailPassword(String email, String password);
  void add(IoTUser user);
  IoTUser get(String email);
  void updateToken(IoTUser user);
  void remove(String email);
}
