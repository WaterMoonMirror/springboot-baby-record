package com.wondersgroup.springbootbabyrecord.common.org.n3r.idworker;

public interface RandomCodeStrategy {
    void init();

    int prefix();

    int next();

    void release();
}
