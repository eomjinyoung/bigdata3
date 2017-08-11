package bigdata3.service;

import java.util.List;

import bigdata3.domain.ClassRoom;

public interface ClassRoomService {
  List<ClassRoom> list(int pageNo, int pageSize) throws Exception;
}







