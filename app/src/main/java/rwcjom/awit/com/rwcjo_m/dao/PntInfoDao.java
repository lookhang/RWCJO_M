package rwcjom.awit.com.rwcjo_m.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import rwcjom.awit.com.rwcjo_m.dao.PntInfo;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table PNT_INFO.
*/
public class PntInfoDao extends AbstractDao<PntInfo, String> {

    public static final String TABLENAME = "PNT_INFO";

    /**
     * Properties of entity PntInfo.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Pointid = new Property(0, String.class, "pointid", true, "POINTID");
        public final static Property Pointnum = new Property(1, String.class, "pointnum", false, "POINTNUM");
        public final static Property Designvalue = new Property(2, String.class, "designvalue", false, "DESIGNVALUE");
        public final static Property Designremark = new Property(3, String.class, "designremark", false, "DESIGNREMARK");
        public final static Property Inbuiltdate = new Property(4, String.class, "inbuiltdate", false, "INBUILTDATE");
        public final static Property Seatcode = new Property(5, String.class, "seatcode", false, "SEATCODE");
        public final static Property Remark = new Property(6, String.class, "remark", false, "REMARK");
        public final static Property Pointcode = new Property(7, String.class, "pointcode", false, "POINTCODE");
        public final static Property Name = new Property(8, String.class, "name", false, "NAME");
        public final static Property Objstate = new Property(9, String.class, "objstate", false, "OBJSTATE");
        public final static Property F_faceid = new Property(10, String.class, "f_faceid", false, "F_FACEID");
    };


    public PntInfoDao(DaoConfig config) {
        super(config);
    }
    
    public PntInfoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'PNT_INFO' (" + //
                "'POINTID' TEXT PRIMARY KEY NOT NULL ," + // 0: pointid
                "'POINTNUM' TEXT," + // 1: pointnum
                "'DESIGNVALUE' TEXT," + // 2: designvalue
                "'DESIGNREMARK' TEXT," + // 3: designremark
                "'INBUILTDATE' TEXT," + // 4: inbuiltdate
                "'SEATCODE' TEXT," + // 5: seatcode
                "'REMARK' TEXT," + // 6: remark
                "'POINTCODE' TEXT," + // 7: pointcode
                "'NAME' TEXT," + // 8: name
                "'OBJSTATE' TEXT," + // 9: objstate
                "'F_FACEID' TEXT);"); // 10: f_faceid
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'PNT_INFO'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, PntInfo entity) {
        stmt.clearBindings();
 
        String pointid = entity.getPointid();
        if (pointid != null) {
            stmt.bindString(1, pointid);
        }
 
        String pointnum = entity.getPointnum();
        if (pointnum != null) {
            stmt.bindString(2, pointnum);
        }
 
        String designvalue = entity.getDesignvalue();
        if (designvalue != null) {
            stmt.bindString(3, designvalue);
        }
 
        String designremark = entity.getDesignremark();
        if (designremark != null) {
            stmt.bindString(4, designremark);
        }
 
        String inbuiltdate = entity.getInbuiltdate();
        if (inbuiltdate != null) {
            stmt.bindString(5, inbuiltdate);
        }
 
        String seatcode = entity.getSeatcode();
        if (seatcode != null) {
            stmt.bindString(6, seatcode);
        }
 
        String remark = entity.getRemark();
        if (remark != null) {
            stmt.bindString(7, remark);
        }
 
        String pointcode = entity.getPointcode();
        if (pointcode != null) {
            stmt.bindString(8, pointcode);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(9, name);
        }
 
        String objstate = entity.getObjstate();
        if (objstate != null) {
            stmt.bindString(10, objstate);
        }
 
        String f_faceid = entity.getF_faceid();
        if (f_faceid != null) {
            stmt.bindString(11, f_faceid);
        }
    }

    /** @inheritdoc */
    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public PntInfo readEntity(Cursor cursor, int offset) {
        PntInfo entity = new PntInfo( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // pointid
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // pointnum
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // designvalue
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // designremark
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // inbuiltdate
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // seatcode
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // remark
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // pointcode
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // name
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // objstate
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10) // f_faceid
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, PntInfo entity, int offset) {
        entity.setPointid(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setPointnum(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setDesignvalue(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setDesignremark(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setInbuiltdate(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setSeatcode(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setRemark(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setPointcode(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setName(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setObjstate(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setF_faceid(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
     }
    
    /** @inheritdoc */
    @Override
    protected String updateKeyAfterInsert(PntInfo entity, long rowId) {
        return entity.getPointid();
    }
    
    /** @inheritdoc */
    @Override
    public String getKey(PntInfo entity) {
        if(entity != null) {
            return entity.getPointid();
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
