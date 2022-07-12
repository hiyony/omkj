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
public class OmikujiiListener implements EntityListener<Omikujii> {

    @Override
    public void preInsert(Omikujii entity, PreInsertContext<Omikujii> context) {
    }

    @Override
    public void preUpdate(Omikujii entity, PreUpdateContext<Omikujii> context) {
    }

    @Override
    public void preDelete(Omikujii entity, PreDeleteContext<Omikujii> context) {
    }

    @Override
    public void postInsert(Omikujii entity, PostInsertContext<Omikujii> context) {
    }

    @Override
    public void postUpdate(Omikujii entity, PostUpdateContext<Omikujii> context) {
    }

    @Override
    public void postDelete(Omikujii entity, PostDeleteContext<Omikujii> context) {
    }
}