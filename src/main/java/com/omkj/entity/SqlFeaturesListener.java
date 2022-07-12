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
public class SqlFeaturesListener implements EntityListener<SqlFeatures> {

    @Override
    public void preInsert(SqlFeatures entity, PreInsertContext<SqlFeatures> context) {
    }

    @Override
    public void preUpdate(SqlFeatures entity, PreUpdateContext<SqlFeatures> context) {
    }

    @Override
    public void preDelete(SqlFeatures entity, PreDeleteContext<SqlFeatures> context) {
    }

    @Override
    public void postInsert(SqlFeatures entity, PostInsertContext<SqlFeatures> context) {
    }

    @Override
    public void postUpdate(SqlFeatures entity, PostUpdateContext<SqlFeatures> context) {
    }

    @Override
    public void postDelete(SqlFeatures entity, PostDeleteContext<SqlFeatures> context) {
    }
}