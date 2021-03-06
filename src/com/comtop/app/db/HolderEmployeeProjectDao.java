package com.comtop.app.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table HOLDER_EMPLOYEE_PROJECT.
*/
public class HolderEmployeeProjectDao extends AbstractDao<HolderEmployeeProject, Long> {

    public static final String TABLENAME = "HOLDER_EMPLOYEE_PROJECT";

    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property HolderEmployeeId = new Property(1, String.class, "holderEmployeeId", false, "HOLDER_EMPLOYEE_ID");
        public final static Property ProjectId = new Property(2, String.class, "projectId", false, "PROJECT_ID");
        public final static Property ProjectName = new Property(3, String.class, "projectName", false, "PROJECT_NAME");
        public final static Property ProjectType = new Property(4, Integer.class, "projectType", false, "PROJECT_TYPE");
    };


    public HolderEmployeeProjectDao(DaoConfig config) {
        super(config);
    }
    
    public HolderEmployeeProjectDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String sql = "CREATE TABLE " + (ifNotExists? "IF NOT EXISTS ": "") + "'HOLDER_EMPLOYEE_PROJECT' (" + //
                "'_id' INTEGER PRIMARY KEY ASC ," + // 0: id
                "'HOLDER_EMPLOYEE_ID' TEXT," + // 1: holderEmployeeId
                "'PROJECT_ID' TEXT," + // 2: projectId
                "'PROJECT_NAME' TEXT," + // 3: projectName
                "'PROJECT_TYPE' INTEGER);"; // 4: projectType
        db.execSQL(sql);
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'HOLDER_EMPLOYEE_PROJECT'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, HolderEmployeeProject entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String holderEmployeeId = entity.getHolderEmployeeId();
        if (holderEmployeeId != null) {
            stmt.bindString(2, holderEmployeeId);
        }
 
        String projectId = entity.getProjectId();
        if (projectId != null) {
            stmt.bindString(3, projectId);
        }
 
        String projectName = entity.getProjectName();
        if (projectName != null) {
            stmt.bindString(4, projectName);
        }
 
        Integer projectType = entity.getProjectType();
        if (projectType != null) {
            stmt.bindLong(5, projectType);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public HolderEmployeeProject readEntity(Cursor cursor, int offset) {
        HolderEmployeeProject entity = new HolderEmployeeProject( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // holderEmployeeId
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // projectId
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // projectName
            cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4) // projectType
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, HolderEmployeeProject entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setHolderEmployeeId(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setProjectId(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setProjectName(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setProjectType(cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4));
     }
    
    @Override
    protected Long updateKeyAfterInsert(HolderEmployeeProject entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(HolderEmployeeProject entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
