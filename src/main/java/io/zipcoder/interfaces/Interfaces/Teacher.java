package io.zipcoder.interfaces.Interfaces;

/**
 * filename:
 * project: interfaces-1
 * author: https://github.com/vvmk
 * date: 2/27/18
 */
public interface Teacher {
    void teach(Learner learner, double numberOfHours);

    void lecture(Learner[] learners, double numberOfHours);
}
