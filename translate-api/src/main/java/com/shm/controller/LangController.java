package com.shm.controller;


import com.shm.common.R;
import com.shm.entity.Lang;
import com.shm.service.LangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 关注公众号：MarkerHub
 * @since 2020-12-17
 */
@RestController
@RequestMapping("/lang")
@CrossOrigin
public class LangController {

    @Autowired
    private LangService langService;

    /**
     * 获取全部语言名称与代码
     * @return
     */
    @GetMapping("all")
    public R langAll(){
        List<Lang> langs = langService.getBaseMapper().selectList(null);
        return R.succ(200,"操作成功",langs);
    }

}
