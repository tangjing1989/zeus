package com.tangjing.project.groovy.groovy.controller

import com.alibaba.fastjson.JSON
import com.alibaba.fastjson.serializer.SerializerFeature
import com.tangjing.project.java.model.SysUser
import io.swagger.annotations.ApiOperation
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.util.StringUtils
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody

/**
 * Created by jack on 2017/4/15.
 */
@Controller
class BookController {

    @Autowired
    com.tangjing.project.groovy.groovy.service.BookService bookService;

    @GetMapping("/book")
    @ResponseBody
    @ApiOperation(value = "获取所有的书籍", httpMethod = "GET",consumes="application/json", response = SysUser.class, notes = "根据状态获取书")
    List<com.tangjing.project.groovy.groovy.model.Book> findByState(@RequestParam(value = "state", required = false) String state) {
        if (StringUtils.isEmpty(state)) {
            List<com.tangjing.project.groovy.groovy.model.Book> all = bookService.findAll()
            println(JSON.toJSONString(all,SerializerFeature.PrettyFormat,SerializerFeature.WriteMapNullValue))
//            println(new JsonOutput().toJson(all))
            bookService.findAll()
        } else {
            bookService.findByState(state)
        }
    }

    @GetMapping("/bookPage")
    @ApiOperation(value = "获取所有的书籍", httpMethod = "GET",consumes="application/json", response = SysUser.class, notes = "获取书")
    String findAll(Model model) {
        List<com.tangjing.project.groovy.groovy.model.Book> books = bookService.findAll()
        model.addAttribute("books", books)
        "book/list"
    }


}
