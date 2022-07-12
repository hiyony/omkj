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
public class PracticeListener implements EntityListener<Practice> {

    @Override
    public void preInsert(Practice entity, PreInsertContext<Practice> context) {
    }

    @Override
    public void preUpdate(Practice entity, PreUpdateContext<Practice> context) {
    }

    @Override
    public void preDelete(Practice entity, PreDeleteContext<Practice> context) {
    }

    @Override
    public void postInsert(Practice entity, PostInsertContext<Practice> context) {
    }

    @Override
    public void postUpdate(Practice entity, PostUpdateContext<Practice> context) {
    }

    @Override
    public void postDelete(Practice entity, PostDeleteContext<Practice> context) {
    }
}