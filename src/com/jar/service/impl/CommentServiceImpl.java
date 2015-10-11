package com.jar.service.impl;

import com.jar.dao.CommentDao;
import com.jar.domain.Comment;
import com.jar.service.CommentService;

import java.util.List;

/**
 * Created by zhuzw_000 on 2015/8/21.
 */
public class CommentServiceImpl implements CommentService {

    private CommentDao commentDao;

    public void setCommentDao(CommentDao commentDao) {
        this.commentDao = commentDao;
    }

    public void add(Comment comment) {
        commentDao.add(comment);
    }

    public List<Comment> show(int articleId) {
        return commentDao.show(articleId);
    }
}
