package rwcjom.awit.com.rwcjo_m.dao;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;


// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig secNewsDaoConfig;
    private final DaoConfig siteNewsDaoConfig;
    private final DaoConfig faceNewsDaoConfig;

    private final SecNewsDao secNewsDao;
    private final SiteNewsDao siteNewsDao;
    private final FaceNewsDao faceNewsDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        secNewsDaoConfig = daoConfigMap.get(SecNewsDao.class).clone();
        secNewsDaoConfig.initIdentityScope(type);

        siteNewsDaoConfig = daoConfigMap.get(SiteNewsDao.class).clone();
        siteNewsDaoConfig.initIdentityScope(type);

        faceNewsDaoConfig = daoConfigMap.get(FaceNewsDao.class).clone();
        faceNewsDaoConfig.initIdentityScope(type);


        secNewsDao = new SecNewsDao(secNewsDaoConfig, this);
        siteNewsDao = new SiteNewsDao(siteNewsDaoConfig, this);
        faceNewsDao = new FaceNewsDao(faceNewsDaoConfig, this);

        registerDao(SecNews.class, secNewsDao);
        registerDao(SiteNews.class, siteNewsDao);
        registerDao(FaceNews.class, faceNewsDao);
    }
    
    public void clear() {
        secNewsDaoConfig.getIdentityScope().clear();
        siteNewsDaoConfig.getIdentityScope().clear();
        faceNewsDaoConfig.getIdentityScope().clear();
    }

    public SecNewsDao getSecNewsDao() {
        return secNewsDao;
    }

    public SiteNewsDao getSiteNewsDao() {
        return siteNewsDao;
    }

    public FaceNewsDao getFaceNewsDao() {
        return faceNewsDao;
    }


}