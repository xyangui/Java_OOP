package com.company.generics;

public interface Categoriser<In, Out> {
    Out categorise(In input);
}
