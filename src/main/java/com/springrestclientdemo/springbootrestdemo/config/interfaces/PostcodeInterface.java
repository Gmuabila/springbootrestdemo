package com.springrestclientdemo.springbootrestdemo.config.interfaces;

import com.springrestclientdemo.springbootrestdemo.domain.LongiLatiResult;

public interface PostcodeInterface {
    LongiLatiResult getLongitudeLat(String postcode);
}
