package com.jar.dao;

import com.jar.domain.Comment;

import java.util.List;

/**
 * Created by zhuzw_000 on 2015/8/21.
 */
public interface CommentDao {

    void add(Comment comment);

    List<Comment> show(int articleId);

}
