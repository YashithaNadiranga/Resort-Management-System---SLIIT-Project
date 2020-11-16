/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Yashitha nadiranga <your.name at your.org>
 */
public class Cottage {
    private String bid;
    private String cid;
    private String noa;
    private String noc;
    private String din;
    private String dout;
    private String cottage;
    private String room;

    public Cottage() {
    }

    public Cottage(String bid, String cid, String noa, String noc, String din, String dout, String cottage, String room) {
        this.bid = bid;
        this.cid = cid;
        this.noa = noa;
        this.noc = noc;
        this.din = din;
        this.dout = dout;
        this.cottage = cottage;
        this.room = room;
    }
    
    

    /**
     * @return the bid
     */
    public String getBid() {
        return bid;
    }

    /**
     * @param bid the bid to set
     */
    public void setBid(String bid) {
        this.bid = bid;
    }

    /**
     * @return the cid
     */
    public String getCid() {
        return cid;
    }

    /**
     * @param cid the cid to set
     */
    public void setCid(String cid) {
        this.cid = cid;
    }

    /**
     * @return the noa
     */
    public String getNoa() {
        return noa;
    }

    /**
     * @param noa the noa to set
     */
    public void setNoa(String noa) {
        this.noa = noa;
    }

    /**
     * @return the noc
     */
    public String getNoc() {
        return noc;
    }

    /**
     * @param noc the noc to set
     */
    public void setNoc(String noc) {
        this.noc = noc;
    }

    /**
     * @return the din
     */
    public String getDin() {
        return din;
    }

    /**
     * @param din the din to set
     */
    public void setDin(String din) {
        this.din = din;
    }

    /**
     * @return the dout
     */
    public String getDout() {
        return dout;
    }

    /**
     * @param dout the dout to set
     */
    public void setDout(String dout) {
        this.dout = dout;
    }

    /**
     * @return the cottage
     */
    public String getCottage() {
        return cottage;
    }

    /**
     * @param cottage the cottage to set
     */
    public void setCottage(String cottage) {
        this.cottage = cottage;
    }

    /**
     * @return the room
     */
    public String getRoom() {
        return room;
    }

    /**
     * @param room the room to set
     */
    public void setRoom(String room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Cottage{" + "bid=" + bid + ", cid=" + cid + ", noa=" + noa + ", noc=" + noc + ", din=" + din + ", dout=" + dout + ", cottage=" + cottage + ", room=" + room + '}';
    }
    
    
}
