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
public class FortunemasterListener implements EntityListener<Fortunemaster> {

    @Override
    public void preInsert(Fortunemaster entity, PreInsertContext<Fortunemaster> context) {
    }

    @Override
    public void preUpdate(Fortunemaster entity, PreUpdateContext<Fortunemaster> context) {
    }

    @Override
    public void preDelete(Fortunemaster entity, PreDeleteContext<Fortunemaster> context) {
    }

    @Override
    public void postInsert(Fortunemaster entity, PostInsertContext<Fortunemaster> context) {
    }

    @Override
    public void postUpdate(Fortunemaster entity, PostUpdateContext<Fortunemaster> context) {
    }

    @Override
    public void postDelete(Fortunemaster entity, PostDeleteContext<Fortunemaster> context) {
    }
}