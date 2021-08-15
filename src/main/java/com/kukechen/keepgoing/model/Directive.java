package com.kukechen.keepgoing.model;
import org.immutables.value.Value;

@Value.Immutable
public abstract class Directive {
    abstract String getName();
    abstract String getDec();
    abstract String getCode();
    abstract String getArguments();
}
