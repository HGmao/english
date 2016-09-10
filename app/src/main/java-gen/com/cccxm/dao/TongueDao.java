package com.cccxm.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "TONGUE".
*/
public class TongueDao extends AbstractDao<Tongue, Long> {

    public static final String TABLENAME = "TONGUE";

    /**
     * Properties of entity Tongue.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Lib_id = new Property(1, int.class, "lib_id", false, "LIB_ID");
        public final static Property En = new Property(2, String.class, "en", false, "EN");
        public final static Property Ch = new Property(3, String.class, "ch", false, "CH");
        public final static Property Next = new Property(4, long.class, "next", false, "NEXT");
        public final static Property Progress = new Property(5, int.class, "progress", false, "PROGRESS");
    }


    public TongueDao(DaoConfig config) {
        super(config);
    }
    
    public TongueDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"TONGUE\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"LIB_ID\" INTEGER NOT NULL ," + // 1: lib_id
                "\"EN\" TEXT NOT NULL ," + // 2: en
                "\"CH\" TEXT NOT NULL ," + // 3: ch
                "\"NEXT\" INTEGER NOT NULL ," + // 4: next
                "\"PROGRESS\" INTEGER NOT NULL );"); // 5: progress
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"TONGUE\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Tongue entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getLib_id());
        stmt.bindString(3, entity.getEn());
        stmt.bindString(4, entity.getCh());
        stmt.bindLong(5, entity.getNext());
        stmt.bindLong(6, entity.getProgress());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Tongue entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getLib_id());
        stmt.bindString(3, entity.getEn());
        stmt.bindString(4, entity.getCh());
        stmt.bindLong(5, entity.getNext());
        stmt.bindLong(6, entity.getProgress());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Tongue readEntity(Cursor cursor, int offset) {
        Tongue entity = new Tongue( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getInt(offset + 1), // lib_id
            cursor.getString(offset + 2), // en
            cursor.getString(offset + 3), // ch
            cursor.getLong(offset + 4), // next
            cursor.getInt(offset + 5) // progress
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Tongue entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setLib_id(cursor.getInt(offset + 1));
        entity.setEn(cursor.getString(offset + 2));
        entity.setCh(cursor.getString(offset + 3));
        entity.setNext(cursor.getLong(offset + 4));
        entity.setProgress(cursor.getInt(offset + 5));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Tongue entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Tongue entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Tongue entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
