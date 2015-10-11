package com.jar.service;

import com.jar.domain.Comment;

import java.util.List;

/**
 * Created by zhuzw_000 on 2015/8/21.
 */
public interface CommentService {

    void add(Comment comment);

    List<Comment> show(int articleId);

}
