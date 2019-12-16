package com.bdqn.provider.mapper;

import com.bdqn.common.domain.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    @Results(id = "userMap", value = {
            @Result(column = "id", property = "id"),
            @Result(column = "name", property = "name"),
            @Result(column = "age", property = "age"),
            @Result(column = "sex", property = "sex")})
    @Select("SELECT * FROM u_user")
    List<User> getAll();

    @Select("SELECT * FROM u_user t WHERE t.id = #{id}")
    @ResultMap("userMap")
    User getOne(Long id);
}
