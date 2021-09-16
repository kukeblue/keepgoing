package com.kukechen.keepgoing.mapper;


import com.kukechen.keepgoing.entity.Directive;
import com.kukechen.keepgoing.entity.ImmutableDirective;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface DirectiveMapper {
    public void saveDirective(Directive directive);

    @Select("SELECT * FROM directives")
    public List<ImmutableDirective> findDirectives();

    @Select("DELETE FROM directives WHERE id = #{id}")
    public void deleteDirectiveById(@Param("id") int id);
}
