package com.jk.controller.user;

import com.jk.entity.user.User;
import com.jk.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 张燕敏 on 2017/8/18.
 */

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;


    //   查询
    @RequestMapping("selectUserList")
    public ModelAndView selectUserList(){
        List<User> listUser = userService.selectUserList();
        ModelAndView mv = new ModelAndView();
        mv.addObject("list",listUser);
        mv.setViewName("user/showList");
        return mv;
    }


    // 新增跳转

    @RequestMapping("toAddUser")
    public String toAddUser(){
        return "user/addUser";
    }


    // 新增

    @RequestMapping("insertUser")
    public String insertUser(User user) {
        if (user.getUserId() == 0) {
            this.userService.insertUser(user);
        } else {
             userService.updateUser(user);
        }
        return "redirect:selectUserList.jhtml";
    }

    // 删除

    @RequestMapping("deleteUserById")
    public String  deleteUserById(User user){
        this.userService.deleteUserById(user);
        return "redirect:selectUserList.jhtml";
    }

    // 修改回显
    @RequestMapping("huiXianById")
    public ModelAndView huiXianById(User user) {
        user = this.userService.huiXianById(user.getUserId());
        ModelAndView mv = new ModelAndView();
        mv.addObject("user", user);
        mv.setViewName("user/addUser");
        return mv;

    }

//------------------------------------------------------------------------------------------


    // 静态化 查询
    @RequestMapping("selectUserListTemp")
    public String selectUserListTemp(Model model){
        List<User> list = userService.selectUserList();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("list", list);
        model.addAttribute("map", map);
        return "user/userList";
    }

    //  新增跳转

    @RequestMapping("toAddPage")
    String toAddPage(){
        return "user/addUser";
    }


    // 静态化 新增
    @RequestMapping("insertUserTemp")
    public String insertUserTemp(User user ){
        userService.insertUser(user);
        return "redirect:selectUserListTemp.jhtml";
    }

    // 静态化 修改
    @RequestMapping("updateUserTemp")
    public String updateUserTemp(User user ){
        userService.updateUser(user);
        return "redirect:selectUserListTemp.jhtml";
    }

    // 修改回显
    @RequestMapping("huiXianByIdTemp")
    public ModelAndView huiXianByIdTemp(User user){
        user = this.userService.huiXianById(user.getUserId());
        ModelAndView mv = new ModelAndView();
        mv.addObject("user",user);
        mv.setViewName("user/updateUser");
        return mv;
    }


    // 静态化 删除
    @RequestMapping("deleteUserByIdTemp")
    public String  deleteUserByIdTemp(User user){
        this.userService.deleteUserById(user);
        return "redirect:selectUserListTemp.jhtml";
    }

}
