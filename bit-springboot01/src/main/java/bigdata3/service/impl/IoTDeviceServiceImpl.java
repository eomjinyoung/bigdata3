package bigdata3.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bigdata3.dao.IoTDeviceDao;
import bigdata3.domain.IoTDevice;
import bigdata3.service.IoTDeviceService;

@Service
public class IoTDeviceServiceImpl implements IoTDeviceService {
  @Autowired IoTDeviceDao deviceDao;
  
  public List<IoTDevice> list(int pageNo, int pageSize) {
    HashMap<String,Object> valueMap = new HashMap<>();
    valueMap.put("startIndex", (pageNo - 1) * pageSize);
    valueMap.put("pageSize", pageSize);
    
    return deviceDao.selectList(valueMap);
  }
  
  public IoTDevice get(String email) {
    return deviceDao.selectOne(email);
  }
  
  public IoTDevice getByEmailPassword(String email, String password) {
    HashMap<String,Object> valueMap = new HashMap<>();
    valueMap.put("email", email);
    valueMap.put("password", password);
    
    return deviceDao.selectOneByEmailPassword(valueMap);
  }
  
  public void add(IoTDevice user) {
    deviceDao.insert(user);
  }
  
  public void updateToken(IoTDevice user) {
    deviceDao.updateToken(user);
  }
  
  public void remove(String email) {
    deviceDao.delete(email);
  }
}







