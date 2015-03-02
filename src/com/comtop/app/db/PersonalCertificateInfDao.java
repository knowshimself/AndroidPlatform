package com.comtop.app.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table PERSONAL_CERTIFICATE_INF.
*/
public class PersonalCertificateInfDao extends AbstractDao<PersonalCertificateInf, Long> {

    public static final String TABLENAME = "PERSONAL_CERTIFICATE_INF";

    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property HolderCertificateId = new Property(1, String.class, "holderCertificateId", false, "HOLDER_CERTIFICATE_ID");
        public final static Property IdCardNo = new Property(2, String.class, "idCardNo", false, "ID_CARD_NO");
        public final static Property UserName = new Property(3, String.class, "userName", false, "USER_NAME");
        public final static Property ContractorName = new Property(4, String.class, "contractorName", false, "CONTRACTOR_NAME");
        public final static Property Sex = new Property(5, Integer.class, "sex", false, "SEX");
        public final static Property Blacked = new Property(6, Integer.class, "blacked", false, "BLACKED");
        public final static Property BlackedDate = new Property(7, java.util.Date.class, "blackedDate", false, "BLACKED_DATE");
        public final static Property BlackedRemark = new Property(8, String.class, "blackedRemark", false, "BLACKED_REMARK");
    };


    public PersonalCertificateInfDao(DaoConfig config) {
        super(config);
    }
    
    public PersonalCertificateInfDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String sql = "CREATE TABLE " + (ifNotExists? "IF NOT EXISTS ": "") + "'PERSONAL_CERTIFICATE_INF' (" + //
                "'_id' INTEGER PRIMARY KEY ASC ," + // 0: id
                "'HOLDER_CERTIFICATE_ID' TEXT," + // 1: holderCertificateId
                "'ID_CARD_NO' TEXT," + // 2: idCardNo
                "'USER_NAME' TEXT," + // 3: userName
                "'CONTRACTOR_NAME' TEXT," + // 4: contractorName
                "'SEX' INTEGER," + // 5: sex
                "'BLACKED' INTEGER," + // 6: blacked
                "'BLACKED_DATE' INTEGER," + // 7: blackedDate
                "'BLACKED_REMARK' TEXT);"; // 8: blackedRemark
        db.execSQL(sql);
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'PERSONAL_CERTIFICATE_INF'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, PersonalCertificateInf entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String holderCertificateId = entity.getHolderCertificateId();
        if (holderCertificateId != null) {
            stmt.bindString(2, holderCertificateId);
        }
 
        String idCardNo = entity.getIdCardNo();
        if (idCardNo != null) {
            stmt.bindString(3, idCardNo);
        }
 
        String userName = entity.getUserName();
        if (userName != null) {
            stmt.bindString(4, userName);
        }
 
        String contractorName = entity.getContractorName();
        if (contractorName != null) {
            stmt.bindString(5, contractorName);
        }
 
        Integer sex = entity.getSex();
        if (sex != null) {
            stmt.bindLong(6, sex);
        }
 
        Integer blacked = entity.getBlacked();
        if (blacked != null) {
            stmt.bindLong(7, blacked);
        }
 
        java.util.Date blackedDate = entity.getBlackedDate();
        if (blackedDate != null) {
            stmt.bindLong(8, blackedDate.getTime());
        }
 
        String blackedRemark = entity.getBlackedRemark();
        if (blackedRemark != null) {
            stmt.bindString(9, blackedRemark);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public PersonalCertificateInf readEntity(Cursor cursor, int offset) {
        PersonalCertificateInf entity = new PersonalCertificateInf( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // holderCertificateId
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // idCardNo
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // userName
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // contractorName
            cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5), // sex
            cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6), // blacked
            cursor.isNull(offset + 7) ? null : new java.util.Date(cursor.getLong(offset + 7)), // blackedDate
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8) // blackedRemark
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, PersonalCertificateInf entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setHolderCertificateId(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setIdCardNo(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setUserName(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setContractorName(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setSex(cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5));
        entity.setBlacked(cursor.isNull(offset + 6) ? null : cursor.getInt(offset + 6));
        entity.setBlackedDate(cursor.isNull(offset + 7) ? null : new java.util.Date(cursor.getLong(offset + 7)));
        entity.setBlackedRemark(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
     }
    
    @Override
    protected Long updateKeyAfterInsert(PersonalCertificateInf entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(PersonalCertificateInf entity) {
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