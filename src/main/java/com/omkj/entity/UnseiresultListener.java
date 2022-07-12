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
public class UnseiresultListener implements EntityListener<Unseiresult> {

    @Override
    public void preInsert(Unseiresult entity, PreInsertContext<Unseiresult> context) {
    }

    @Override
    public void preUpdate(Unseiresult entity, PreUpdateContext<Unseiresult> context) {
    }

    @Override
    public void preDelete(Unseiresult entity, PreDeleteContext<Unseiresult> context) {
    }

    @Override
    public void postInsert(Unseiresult entity, PostInsertContext<Unseiresult> context) {
    }

    @Override
    public void postUpdate(Unseiresult entity, PostUpdateContext<Unseiresult> context) {
    }

    @Override
    public void postDelete(Unseiresult entity, PostDeleteContext<Unseiresult> context) {
    }
}