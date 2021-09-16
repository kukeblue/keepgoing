package com.kukechen.keepgoing.service;

import com.kukechen.keepgoing.entity.Directive;
import com.kukechen.keepgoing.entity.ImmutableDirective;
import com.kukechen.keepgoing.mapper.DirectiveMapper;
import com.kukechen.keepgoing.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DirectiveService {

    @Autowired
    private DirectiveMapper directiveMapper;

    public void saveDirective(ImmutableDirective directive) {
        directiveMapper.saveDirective(directive);
    }

    public List<ImmutableDirective> getDirectives() {
        return directiveMapper.findDirectives();
    }

    public void deleteDirective(int id) {
        directiveMapper.deleteDirectiveById(id);
    }
}
