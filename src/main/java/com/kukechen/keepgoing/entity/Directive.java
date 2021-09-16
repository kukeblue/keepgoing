package com.kukechen.keepgoing.entity;
import org.immutables.value.Value;
import javax.annotation.Nullable;

@Value.Immutable
public abstract class Directive {
    @Nullable
    public abstract Long getId();
    public abstract String getName();
    public abstract String getDescription();
    public abstract String getCode();
    public abstract String getArguments();
}
