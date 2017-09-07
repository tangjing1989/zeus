package com.tangjing.project.groovy.groovy.dao.mapper

import org.apache.ibatis.annotations.*

@Mapper
public interface BookMapper {
    @Select("select * from book where state = #{state}")
    List<com.tangjing.project.groovy.groovy.model.Book> findByState(@Param("state") String state);

    @Select("select * from book")
    List<com.tangjing.project.groovy.groovy.model.Book> findAll();

    @Insert("insert into book set name = #{b.name}, author = #{b.author}, isbn = #{b.isbn}, inDate = #{b.inDate}, outDate = #{b.outDate}, press = #{b.press}, state = #{b.state}" )
    @Options(useGeneratedKeys = true, keyProperty = "id")
    //使用@Options注解的userGeneratedKeys 和keyProperty属性让数据库产生auto_increment（自增长）列的值，然后将生成的值设置到输入参数对象的属性中。
    com.tangjing.project.groovy.groovy.model.Book insert(@Param("b") com.tangjing.project.groovy.groovy.model.Book book) throws RuntimeException;

}
