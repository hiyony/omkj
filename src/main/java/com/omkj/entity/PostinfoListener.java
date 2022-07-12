package com.omkj.entity;

import org.seasar.doma.jdbc.entity.EntityListener;
import org.seasar.doma.jdbc.entity.PostDeleteContext;
import org.seasar.doma.jdbc.entity.PostInsertContext;
import org.seasar.doma.jdbc.entity.PostUpdateContext;
import org.seasar.doma.jdbc.entity.PreDeleteContext;
import org.seasar.doma.jdbc.entity.PreInsertContext;
import org.seasar.doma.jdbc.entity.PreUpdateContext;

/**
 * 
 */
public class PostinfoListener implements EntityListener<Postinfo> {

    @Override
    public void preInsert(Postinfo entity, PreInsertContext<Postinfo> context) {
    }

    @Override
    public void preUpdate(Postinfo entity, PreUpdateContext<Postinfo> context) {
    }

    @Override
    public void preDelete(Postinfo entity, PreDeleteContext<Postinfo> context) {
    }

    @Override
    public void postInsert(Postinfo entity, PostInsertContext<Postinfo> context) {
    }

    @Override
    public void postUpdate(Postinfo entity, PostUpdateContext<Postinfo> context) {
    }

    @Override
    public void postDelete(Postinfo entity, PostDeleteContext<Postinfo> context) {
    }
}