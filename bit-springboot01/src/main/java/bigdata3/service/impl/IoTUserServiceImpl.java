package bigdata3.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bigdata3.dao.IoTUserDao;
import bigdata3.domain.IoTUser;
import bigdata3.domain.IoTUser;
import bigdata3.service.IoTUserService;

@Service
public class IoTUserServiceImpl implements IoTUserService {
  @Autowired IoTUserDao userDao;
  
  public List<IoTUser> list(int pageNo, int pageSize) {
    HashMap<String,Object> valueMap = new HashMap<>();
    valueMap.put("startIndex", (pageNo - 1) * pageSize);
    valueMap.put("pageSize", pageSize);
    
    return userDao.selectList(valueMap);
  }
  
  public IoTUser get(String email) {
    return userDao.selectOne(email);
  }
  
  public IoTUser getByEmailPassword(String email, String password) throws Exception {
    HashMap<String,Object> valueMap = new HashMap<>();
    valueMap.put("email", email);
    valueMap.put("password", password);
    
    return userDao.selectOneByEmailPassword(valueMap);
  }
  
  public void add(IoTUser user) throws Exception {
    memberDao.insert(user);
    userDao.insert(user);
    this.insertPhoto(user.getNo(), user.getPhotoList()); // 강사 사진 추가
  }
  
  public void update(IoTUser user) throws Exception {
    int count = memberDao.update(user);
    if (count < 1) {
      throw new Exception(user.getNo() + "번 강사를 찾을 수 없습니다.");
    }
    
    count = userDao.update(user);
    if (count < 1) {
      throw new Exception(user.getNo() + "번 강사를 찾을 수 없습니다.");
    }
    
    // 강사 사진 갱신
    userDao.deletePhoto(user.getNo()); // 강사의 모든 사진을 지운다.
    this.insertPhoto(user.getNo(), user.getPhotoList()); // 강사 사진 추가
  }
  
  private void insertPhoto(int userNo, List<String> photoPathList) {
    HashMap<String,Object> valueMap = new HashMap<>();
    valueMap.put("userNo", userNo);
    
    for (String photoPath : photoPathList) {
      valueMap.put("photoPath", photoPath);
      userDao.insertPhoto(valueMap);
    }
  }
  
  public void remove(int no) throws Exception {
    userDao.deletePhoto(no);
    int count = userDao.delete(no);
    if (count < 1) {
      throw new Exception(no + "번 강사를 찾을 수 없습니다.");
    }
    
    try {
      count = memberDao.delete(no);
    } catch (Exception e) {}
  }
}







