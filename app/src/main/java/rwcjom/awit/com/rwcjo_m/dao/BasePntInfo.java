package rwcjom.awit.com.rwcjo_m.dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table BASE_PNT_INFO.
 */
public class BasePntInfo {

    private String siteid;
    private String sitename;
    private String sitecode;
    private String sitehigh;
    private String sitenum;
    private String sitevar;

    public BasePntInfo() {
    }

    public BasePntInfo(String siteid) {
        this.siteid = siteid;
    }

    public BasePntInfo(String siteid, String sitename, String sitecode, String sitehigh, String sitenum, String sitevar) {
        this.siteid = siteid;
        this.sitename = sitename;
        this.sitecode = sitecode;
        this.sitehigh = sitehigh;
        this.sitenum = sitenum;
        this.sitevar = sitevar;
    }

    public String getSiteid() {
        return siteid;
    }

    public void setSiteid(String siteid) {
        this.siteid = siteid;
    }

    public String getSitename() {
        return sitename;
    }

    public void setSitename(String sitename) {
        this.sitename = sitename;
    }

    public String getSitecode() {
        return sitecode;
    }

    public void setSitecode(String sitecode) {
        this.sitecode = sitecode;
    }

    public String getSitehigh() {
        return sitehigh;
    }

    public void setSitehigh(String sitehigh) {
        this.sitehigh = sitehigh;
    }

    public String getSitenum() {
        return sitenum;
    }

    public void setSitenum(String sitenum) {
        this.sitenum = sitenum;
    }

    public String getSitevar() {
        return sitevar;
    }

    public void setSitevar(String sitevar) {
        this.sitevar = sitevar;
    }

}
