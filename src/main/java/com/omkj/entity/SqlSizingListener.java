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
public class SqlSizingListener implements EntityListener<SqlSizing> {

    @Override
    public void preInsert(SqlSizing entity, PreInsertContext<SqlSizing> context) {
    }

    @Override
    public void preUpdate(SqlSizing entity, PreUpdateContext<SqlSizing> context) {
    }

    @Override
    public void preDelete(SqlSizing entity, PreDeleteContext<SqlSizing> context) {
    }

    @Override
    public void postInsert(SqlSizing entity, PostInsertContext<SqlSizing> context) {
    }

    @Override
    public void postUpdate(SqlSizing entity, PostUpdateContext<SqlSizing> context) {
    }

    @Override
    public void postDelete(SqlSizing entity, PostDeleteContext<SqlSizing> context) {
    }
}