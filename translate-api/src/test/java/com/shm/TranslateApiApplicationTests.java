package com.shm;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shm.baidu.TransApi;
import com.shm.entity.Lang;
import com.shm.mapper.LangMapper;
import com.shm.pojo.Trans;
import com.shm.pojo.TransResult;

import com.shm.service.LangService;
import com.shm.service.impl.TransService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.List;

@SpringBootTest
class TranslateApiApplicationTests {

    @Autowired
    TransApi transApi;

    @Autowired
    TransService transService;

    @Autowired
    LangService langService;


    @Test
    void contextLoads() throws IOException {
//        String transResult = transApi.getTransResult("结束了", "auto", "en");
//        System.out.println(transResult);

        Trans trans = new Trans()
        .setQuery("Hello").setFrom("auto").setTo("kor");

        TransResult result = transService.result(trans);
        System.out.println(result);
    }

    @Test
    void langTest(){
        Lang byId = langService.getById(1);
        System.out.println(byId);

        BaseMapper<Lang> baseMapper = langService.getBaseMapper();
        List<Lang> langs = baseMapper.selectList(null);
        System.out.println(langs);
    }

}
