package com.springcore.annotationLifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class annotationLifecycle {
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "annotationLifecycle{" +
                "subject='" + subject + '\'' +
                '}';
    }

    public annotationLifecycle() {
        super();
    }
    @PostConstruct
    public void init(){
        System.out.println("Starting method");
    }

    @PreDestroy
    public void end(){
        System.out.println("ending method");
    }
}
