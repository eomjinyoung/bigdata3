package bigdata3.dao;

import java.util.List;

import bigdata3.domain.Teacher;

public interface BoardDao {
  List<Teacher> selectList(int pageNo, int pageSize) throws Exception;  
  Teacher selectOne(int no) throws Exception;
  Teacher selectOneByEmailPassword(String email, String password) throws Exception;
  int insert(Teacher teacher) throws Exception;
  int delete(int no) throws Exception;
  int update(Teacher teacher) throws Exception;
  void insertPhoto(int no, List<String> photoList) throws Exception;
  List<String> selectPhotoList(int teacherNo) throws Exception;
  void deletePhoto(int teacherNo) throws Exception;
}





