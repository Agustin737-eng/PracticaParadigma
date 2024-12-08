package model.domain;

public class Sesion {
    private Date dsince;
    private Date duntil;
    
    private User user;
    private TPV tpv;
       
    public Sesion() {
    }

    public Date getDsince() {
        return dsince;
    }

    public void setDsince(Date dsince) {
        this.dsince = dsince;
    }

    public Date getDuntil() {
        return duntil;
    }

    public void setDuntil(Date duntil) {
        this.duntil = duntil;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public TPV getTpv() {
        return tpv;
    }

    public void setTpv(TPV tpv) {
        this.tpv = tpv;
    }
    
}
