package com.shm.controller;

import com.shm.common.R;
import com.shm.pojo.Trans;
import com.shm.pojo.TransResult;

import com.shm.service.impl.TransService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags = "翻译管理")
@RestController
//解决跨域
@CrossOrigin
public class TranslateController {

    @Autowired
    private TransService transService;

    @ApiModelProperty("翻译")
    @PostMapping("/trans")
    public R transl(@RequestBody Trans trans){
        System.out.println(trans);
        TransResult result = transService.result(trans);
        return R.succ(200,"操作成功",result);
    }
}
