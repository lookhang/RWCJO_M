package rwcjom.awit.com.rwcjo_m.dao;

import rwcjom.awit.com.rwcjo_m.dao.DaoSession;
import de.greenrobot.dao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table SITE_NEWS.
 */
public class SiteNews {

    private String siteid;
    private String sitecode;
    private String sitename;
    private String startsite;
    private String endsite;
    private String sitetype;
    /** Not-null value. */
    private String f_sectionid;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient SiteNewsDao myDao;

    private SecNews secNews;
    private String secNews__resolvedKey;


    public SiteNews() {
    }

    public SiteNews(String siteid) {
        this.siteid = siteid;
    }

    public SiteNews(String siteid, String sitecode, String sitename, String startsite, String endsite, String sitetype, String f_sectionid) {
        this.siteid = siteid;
        this.sitecode = sitecode;
        this.sitename = sitename;
        this.startsite = startsite;
        this.endsite = endsite;
        this.sitetype = sitetype;
        this.f_sectionid = f_sectionid;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getSiteNewsDao() : null;
    }

    public String getSiteid() {
        return siteid;
    }

    public void setSiteid(String siteid) {
        this.siteid = siteid;
    }

    public String getSitecode() {
        return sitecode;
    }

    public void setSitecode(String sitecode) {
        this.sitecode = sitecode;
    }

    public String getSitename() {
        return sitename;
    }

    public void setSitename(String sitename) {
        this.sitename = sitename;
    }

    public String getStartsite() {
        return startsite;
    }

    public void setStartsite(String startsite) {
        this.startsite = startsite;
    }

    public String getEndsite() {
        return endsite;
    }

    public void setEndsite(String endsite) {
        this.endsite = endsite;
    }

    public String getSitetype() {
        return sitetype;
    }

    public void setSitetype(String sitetype) {
        this.sitetype = sitetype;
    }

    /** Not-null value. */
    public String getF_sectionid() {
        return f_sectionid;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setF_sectionid(String f_sectionid) {
        this.f_sectionid = f_sectionid;
    }

    /** To-one relationship, resolved on first access. */
    public SecNews getSecNews() {
        String __key = this.f_sectionid;
        if (secNews__resolvedKey == null || secNews__resolvedKey != __key) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            SecNewsDao targetDao = daoSession.getSecNewsDao();
            SecNews secNewsNew = targetDao.load(__key);
            synchronized (this) {
                secNews = secNewsNew;
            	secNews__resolvedKey = __key;
            }
        }
        return secNews;
    }

    public void setSecNews(SecNews secNews) {
        if (secNews == null) {
            throw new DaoException("To-one property 'f_sectionid' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.secNews = secNews;
            f_sectionid = secNews.getSectid();
            secNews__resolvedKey = f_sectionid;
        }
    }

    /** Convenient call for {@link AbstractDao#delete(Object)}. Entity must attached to an entity context. */
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.delete(this);
    }

    /** Convenient call for {@link AbstractDao#update(Object)}. Entity must attached to an entity context. */
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.update(this);
    }

    /** Convenient call for {@link AbstractDao#refresh(Object)}. Entity must attached to an entity context. */
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.refresh(this);
    }

}
