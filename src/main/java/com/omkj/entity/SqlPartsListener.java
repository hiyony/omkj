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
public class SqlPartsListener implements EntityListener<SqlParts> {

    @Override
    public void preInsert(SqlParts entity, PreInsertContext<SqlParts> context) {
    }

    @Override
    public void preUpdate(SqlParts entity, PreUpdateContext<SqlParts> context) {
    }

    @Override
    public void preDelete(SqlParts entity, PreDeleteContext<SqlParts> context) {
    }

    @Override
    public void postInsert(SqlParts entity, PostInsertContext<SqlParts> context) {
    }

    @Override
    public void postUpdate(SqlParts entity, PostUpdateContext<SqlParts> context) {
    }

    @Override
    public void postDelete(SqlParts entity, PostDeleteContext<SqlParts> context) {
    }
}