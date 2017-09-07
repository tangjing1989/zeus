package com.tangjing.project.groovy.groovy.service

interface BookService {
    List<com.tangjing.project.groovy.groovy.model.Book> findByState(String state)

    List<com.tangjing.project.groovy.groovy.model.Book> findAll()

    com.tangjing.project.groovy.groovy.model.Book insert(com.tangjing.project.groovy.groovy.model.Book book)
}
