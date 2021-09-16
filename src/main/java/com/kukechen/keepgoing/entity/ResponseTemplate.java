package com.kukechen.keepgoing.entity;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import javax.annotation.Nullable;

@Value.Immutable
@JsonSerialize(as = ImmutableResponseTemplate.class)
@JsonDeserialize(as = ImmutableResponseTemplate.class)
public abstract class ResponseTemplate {
    public abstract int getCode();
    @Nullable
    public abstract Object getData();
    @Value.Default
    public String getMessage() {
        return "";
    };

    public static ResponseTemplate buildSuccessResponse() {
        return ImmutableResponseTemplate.builder()
                .code(0)
                .message("success")
                .build();
    }

    public static ResponseTemplate buildFailureResponse() {
        return ImmutableResponseTemplate.builder()
                .code(-1)
                .message("failure")
                .build();
    }
}
