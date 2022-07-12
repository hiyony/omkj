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
public class SaveListener implements EntityListener<Save> {

    @Override
    public void preInsert(Save entity, PreInsertContext<Save> context) {
    }

    @Override
    public void preUpdate(Save entity, PreUpdateContext<Save> context) {
    }

    @Override
    public void preDelete(Save entity, PreDeleteContext<Save> context) {
    }

    @Override
    public void postInsert(Save entity, PostInsertContext<Save> context) {
    }

    @Override
    public void postUpdate(Save entity, PostUpdateContext<Save> context) {
    }

    @Override
    public void postDelete(Save entity, PostDeleteContext<Save> context) {
    }
}