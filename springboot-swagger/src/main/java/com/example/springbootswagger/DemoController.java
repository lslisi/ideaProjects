package com.example.springbootswagger;

import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import sun.rmi.runtime.Log;

import java.util.HashMap;
import java.util.Map;

@Api(description = "用户接口")
@RestController
@RequestMapping("/demoController")
public class DemoController {
    @ApiOperation(value = "新增用户" ,  notes="新增注册")
    @RequestMapping(value="/createUser",method=RequestMethod.POST,consumes= MediaType.APPLICATION_JSON_VALUE)
    public Map<Integer ,Object> createUser(@RequestBody User user){
        System.out.println("createUser:::"+user.toString());
        Map<Integer ,Object> result= new HashMap<Integer,Object>();
        result.put(HttpStatus.OK.value(), "新增成功.");
        return result;
    }

    @ApiOperation(value = "修改用户" ,  notes="修改用户")
    @ApiParam("HELLO")
    @RequestMapping(value="/updateUser",method=RequestMethod.POST,consumes= MediaType.APPLICATION_JSON_VALUE)
    public Map<Integer ,Object> updateUser(@RequestBody User user){
        System.out.println("updateUser:::"+user.toString());
        Map<Integer ,Object> result= new HashMap<Integer,Object>();
        result.put(HttpStatus.OK.value(), "修改成功.");
        return result;
    }

    @ApiOperation(value = "删除用户" ,  notes="删除用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户标识", required = true, paramType = "query", dataType = "String")
    })
    @RequestMapping(value="/deleteUser",method=RequestMethod.DELETE)
    public Map<Integer ,Object> deleteUser(@RequestParam("userId") String userId){
        System.out.println("deleteUser:::"+userId);
        Map<Integer ,Object> result= new HashMap<Integer,Object>();
        result.put(HttpStatus.OK.value(), "删除成功.");
        return result;
    }


}
