package com.zjut.designpattern.proxy.protection;

/**
 * @author zjxjwxk
 * @date 2020/7/31 11:32 下午
 */
public interface PersonBean {

    String getName();

    String getGender();

    String getInterests();

    int getHotOrNotRating();

    void setName(String name);

    void setGender(String gender);

    void setInterests(String interests);

    void setHotOrNotRating(int rating);
}
