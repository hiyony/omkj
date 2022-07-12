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
public class SqlImplementationInfoListener implements EntityListener<SqlImplementationInfo> {

    @Override
    public void preInsert(SqlImplementationInfo entity, PreInsertContext<SqlImplementationInfo> context) {
    }

    @Override
    public void preUpdate(SqlImplementationInfo entity, PreUpdateContext<SqlImplementationInfo> context) {
    }

    @Override
    public void preDelete(SqlImplementationInfo entity, PreDeleteContext<SqlImplementationInfo> context) {
    }

    @Override
    public void postInsert(SqlImplementationInfo entity, PostInsertContext<SqlImplementationInfo> context) {
    }

    @Override
    public void postUpdate(SqlImplementationInfo entity, PostUpdateContext<SqlImplementationInfo> context) {
    }

    @Override
    public void postDelete(SqlImplementationInfo entity, PostDeleteContext<SqlImplementationInfo> context) {
    }
}