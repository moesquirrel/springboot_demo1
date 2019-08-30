package cn.yaya.mapper;

import cn.yaya.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {
    List<User> findAll();
}
