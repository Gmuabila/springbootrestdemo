package com.springrestclientdemo.springbootrestdemo.domain;

public class Result {
    private String postcode;
    private Integer quality;
    private Integer eastings;
    private Integer northings;
    private String country;
    private String nhsHa;
    private Double longitude;
    private Double latitude;
    private String europeanElectoralRegion;
    private String primaryCareTrust;
    private String region;
    private String lsoa;
    private String msoa;
    private String incode;
    private String outcode;
    private String parliamentaryConstituency;
    private String adminDistrict;
    private String parish;
    private Object adminCounty;
    private String adminWard;
    private Object ced;
    private String ccg;
    private String nuts;
    private Codes codes;

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public Integer getQuality() {
        return quality;
    }

    public void setQuality(Integer quality) {
        this.quality = quality;
    }

    public Integer getEastings() {
        return eastings;
    }

    public void setEastings(Integer eastings) {
        this.eastings = eastings;
    }

    public Integer getNorthings() {
        return northings;
    }

    public void setNorthings(Integer northings) {
        this.northings = northings;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNhsHa() {
        return nhsHa;
    }

    public void setNhsHa(String nhsHa) {
        this.nhsHa = nhsHa;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public String getEuropeanElectoralRegion() {
        return europeanElectoralRegion;
    }

    public void setEuropeanElectoralRegion(String europeanElectoralRegion) {
        this.europeanElectoralRegion = europeanElectoralRegion;
    }

    public String getPrimaryCareTrust() {
        return primaryCareTrust;
    }

    public void setPrimaryCareTrust(String primaryCareTrust) {
        this.primaryCareTrust = primaryCareTrust;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getLsoa() {
        return lsoa;
    }

    public void setLsoa(String lsoa) {
        this.lsoa = lsoa;
    }

    public String getMsoa() {
        return msoa;
    }

    public void setMsoa(String msoa) {
        this.msoa = msoa;
    }

    public String getIncode() {
        return incode;
    }

    public void setIncode(String incode) {
        this.incode = incode;
    }

    public String getOutcode() {
        return outcode;
    }

    public void setOutcode(String outcode) {
        this.outcode = outcode;
    }

    public String getParliamentaryConstituency() {
        return parliamentaryConstituency;
    }

    public void setParliamentaryConstituency(String parliamentaryConstituency) {
        this.parliamentaryConstituency = parliamentaryConstituency;
    }

    public String getAdminDistrict() {
        return adminDistrict;
    }

    public void setAdminDistrict(String adminDistrict) {
        this.adminDistrict = adminDistrict;
    }

    public String getParish() {
        return parish;
    }

    public void setParish(String parish) {
        this.parish = parish;
    }

    public Object getAdminCounty() {
        return adminCounty;
    }

    public void setAdminCounty(Object adminCounty) {
        this.adminCounty = adminCounty;
    }

    public String getAdminWard() {
        return adminWard;
    }

    public void setAdminWard(String adminWard) {
        this.adminWard = adminWard;
    }

    public Object getCed() {
        return ced;
    }

    public void setCed(Object ced) {
        this.ced = ced;
    }

    public String getCcg() {
        return ccg;
    }

    public void setCcg(String ccg) {
        this.ccg = ccg;
    }

    public String getNuts() {
        return nuts;
    }

    public void setNuts(String nuts) {
        this.nuts = nuts;
    }

    public Codes getCodes() {
        return codes;
    }

    public void setCodes(Codes codes) {
        this.codes = codes;
    }

    @Override
    public String toString() {
        return "Result{" +
                "postcode='" + postcode + '\'' +
                ", quality=" + quality +
                ", eastings=" + eastings +
                ", northings=" + northings +
                ", country='" + country + '\'' +
                ", nhsHa='" + nhsHa + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", europeanElectoralRegion='" + europeanElectoralRegion + '\'' +
                ", primaryCareTrust='" + primaryCareTrust + '\'' +
                ", region='" + region + '\'' +
                ", lsoa='" + lsoa + '\'' +
                ", msoa='" + msoa + '\'' +
                ", incode='" + incode + '\'' +
                ", outcode='" + outcode + '\'' +
                ", parliamentaryConstituency='" + parliamentaryConstituency + '\'' +
                ", adminDistrict='" + adminDistrict + '\'' +
                ", parish='" + parish + '\'' +
                ", adminCounty=" + adminCounty +
                ", adminWard='" + adminWard + '\'' +
                ", ced=" + ced +
                ", ccg='" + ccg + '\'' +
                ", nuts='" + nuts + '\'' +
                ", codes=" + codes +
                '}';
    }
}
