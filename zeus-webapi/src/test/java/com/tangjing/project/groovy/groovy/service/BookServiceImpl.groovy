package com.tangjing.project.groovy.groovy.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * Created by jack on 2017/4/15.
 */
@Service
class BookServiceImpl implements BookService {
    @Autowired
    com.tangjing.project.groovy.groovy.dao.mapper.BookMapper bookMapper

    List<com.tangjing.project.groovy.groovy.model.Book> findByState(String state) {
        bookMapper.findByState(state)
    }


    List<com.tangjing.project.groovy.groovy.model.Book> findAll() {
        bookMapper.findAll()
    }

    com.tangjing.project.groovy.groovy.model.Book insert(com.tangjing.project.groovy.groovy.model.Book book) {
        bookMapper.insert(book)
    }

}