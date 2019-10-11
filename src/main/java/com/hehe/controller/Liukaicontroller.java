package com.hehe.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: Liukaicontroller <br/>
 * Description: <br/>
 * date: 2019/10/11 16:32<br/>
 *
 * @author me<br />
 * @since JDK 1.8
 */
@Api("瞎几把搞得玩的")
@RestController
public class Liukaicontroller {
    @RequestMapping(value ="/xjbw" ,produces ="text/plain")
    @ApiOperation("瞎几把玩的")
    public String xjbw(){
        return "xjbw";
    }

}
