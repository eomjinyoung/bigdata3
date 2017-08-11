package bigdata3.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bigdata3.dao.ClassRoomDao;
import bigdata3.domain.ClassRoom;
import bigdata3.domain.Teacher;
import bigdata3.service.ClassRoomService;

@Service
public class ClassRoomServiceImpl implements ClassRoomService {
  @Autowired ClassRoomDao classRoomDao;
  
  public List<ClassRoom> list(int pageNo, int pageSize) throws Exception {
    HashMap<String,Object> valueMap = new HashMap<>();
    valueMap.put("startIndex", (pageNo - 1) * pageSize);
    valueMap.put("pageSize", pageSize);
    
    return classRoomDao.selectList(valueMap);
  }
  
  public void add(ClassRoom classRoom) throws Exception {
    classRoomDao.insert(classRoom);
  }
}







