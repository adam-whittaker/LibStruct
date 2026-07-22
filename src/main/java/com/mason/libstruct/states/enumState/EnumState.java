package com.mason.libstruct.states.enumState;

public interface EnumState<T extends Enum<T>> extends EnumQuery<T>{

    void setState(T state);

}
