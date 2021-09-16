package com.kukechen.keepgoing.controller;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.kukechen.keepgoing.entity.*;
import com.kukechen.keepgoing.service.DirectiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.immutables.value.Value;

@RestController
public class DirectiveController {

    @Autowired
    DirectiveService directiveService;

    @PutMapping("/directive")
    public ResponseTemplate add(@RequestBody DirectiveCreatedRequest request) {
        try {
            final var directive = ImmutableDirective
                    .builder()
                    .arguments(request.getArguments())
                    .code(request.getCode())
                    .description(request.getDescription())
                    .name(request.getName()).build();
            directiveService.saveDirective(directive);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseTemplate.buildFailureResponse();
        }
        return ResponseTemplate.buildSuccessResponse();
    }

    @GetMapping("/directives")
    public ResponseTemplate getDirectives() {
        try {
            final var directives = directiveService.getDirectives();
            return ImmutableResponseTemplate.builder().code(0).data(directives).build();
        } catch (Exception e) {
            e.printStackTrace();
            return ImmutableResponseTemplate.buildFailureResponse();
        }
    }

    @DeleteMapping("/directives/{id}")
    public void deleteDirective(@PathVariable("id") int id) {
        try {
            directiveService.deleteDirective(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Value.Immutable
    @JsonDeserialize(as = ImmutableDirectiveCreatedRequest.class)
    public static abstract class DirectiveCreatedRequest {
        public abstract String getName();

        public abstract String getDescription();

        public abstract String getCode();

        public abstract String getArguments();
    }
}


