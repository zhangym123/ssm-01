package com.jk.mapper.user;

import com.jk.entity.user.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Created by 张燕敏 on 2017/8/18.
 */
public interface UserMapper {

    @Select("select t_id as \"userId\", t_account as \"userAccount\" from t_user")
    List<User> selectUserList();



    @Insert("insert into t_user (t_id,t_account)"
            +"values (t_user_sql.nextval,#{userAccount})"
    )
    void insertUser(User user);



    @Delete("delete from t_user where t_id=#{userId}")
    void deleteUserById(User user);




    @Select("select " +
            "t_id as \"userId\", " +
            "t_account as \"userAccount\" " +
            "from t_user where t_id=#{userId}")
    User huiXianById(int userId);




    @Update("update t_user set t_account = #{userAccount}" +
            "where t_id = #{userId}")
    void updateUser(User user);


}
