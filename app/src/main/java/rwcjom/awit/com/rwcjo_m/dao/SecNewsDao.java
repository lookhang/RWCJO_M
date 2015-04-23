package rwcjom.awit.com.rwcjo_m.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import rwcjom.awit.com.rwcjo_m.dao.SecNews;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table SEC_NEWS.
*/
public class SecNewsDao extends AbstractDao<SecNews, String> {

    public static final String TABLENAME = "SEC_NEWS";

    /**
     * Properties of entity SecNews.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Sectid = new Property(0, String.class, "sectid", true, "SECTID");
        public final static Property Sectcode = new Property(1, String.class, "sectcode", false, "SECTCODE");
        public final static Property Sectname = new Property(2, String.class, "sectname", false, "SECTNAME");
    };

    private DaoSession daoSession;


    public SecNewsDao(DaoConfig config) {
        super(config);
    }
    
    public SecNewsDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'SEC_NEWS' (" + //
                "'SECTID' TEXT PRIMARY KEY NOT NULL ," + // 0: sectid
                "'SECTCODE' TEXT," + // 1: sectcode
                "'SECTNAME' TEXT);"); // 2: sectname
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'SEC_NEWS'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, SecNews entity) {
        stmt.clearBindings();
 
        String sectid = entity.getSectid();
        if (sectid != null) {
            stmt.bindString(1, sectid);
        }
 
        String sectcode = entity.getSectcode();
        if (sectcode != null) {
            stmt.bindString(2, sectcode);
        }
 
        String sectname = entity.getSectname();
        if (sectname != null) {
            stmt.bindString(3, sectname);
        }
    }

    @Override
    protected void attachEntity(SecNews entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    /** @inheritdoc */
    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public SecNews readEntity(Cursor cursor, int offset) {
        SecNews entity = new SecNews( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // sectid
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // sectcode
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2) // sectname
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, SecNews entity, int offset) {
        entity.setSectid(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setSectcode(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setSectname(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
     }
    
    /** @inheritdoc */
    @Override
    protected String updateKeyAfterInsert(SecNews entity, long rowId) {
        return entity.getSectid();
    }
    
    /** @inheritdoc */
    @Override
    public String getKey(SecNews entity) {
        if(entity != null) {
            return entity.getSectid();
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
