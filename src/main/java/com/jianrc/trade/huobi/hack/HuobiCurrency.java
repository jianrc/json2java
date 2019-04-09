
package com.jianrc.trade.huobi.hack;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HuobiCurrency {

    @SerializedName("currency_addr_with_tag")
    @Expose
    private Boolean currencyAddrWithTag;
    @SerializedName("fast_confirms")
    @Expose
    private Integer fastConfirms;
    @SerializedName("safe_confirms")
    @Expose
    private Integer safeConfirms;
    @SerializedName("tags")
    @Expose
    private String tags;
    @SerializedName("currency_code")
    @Expose
    private String currencyCode;
    @SerializedName("visible")
    @Expose
    private Boolean visible;
    @SerializedName("white_enabled")
    @Expose
    private Boolean whiteEnabled;
    @SerializedName("country_disabled")
    @Expose
    private Boolean countryDisabled;
    @SerializedName("deposit_enabled")
    @Expose
    private Boolean depositEnabled;
    @SerializedName("withdraw_enabled")
    @Expose
    private Boolean withdrawEnabled;
    @SerializedName("withdraw_min_amount")
    @Expose
    private String withdrawMinAmount;
    @SerializedName("fee_type")
    @Expose
    private String feeType;
    @SerializedName("weight")
    @Expose
    private Integer weight;
    @SerializedName("show_precision")
    @Expose
    private String showPrecision;
    @SerializedName("withdraw_precision")
    @Expose
    private Integer withdrawPrecision;
    @SerializedName("deposit_min_amount")
    @Expose
    private String depositMinAmount;
    @SerializedName("quote_currency")
    @Expose
    private Boolean quoteCurrency;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("display_name")
    @Expose
    private String displayName;
    @SerializedName("deposit_desc")
    @Expose
    private String depositDesc;
    @SerializedName("withdraw_desc")
    @Expose
    private String withdrawDesc;
    @SerializedName("suspend_visible_desc")
    @Expose
    private String suspendVisibleDesc;
    @SerializedName("suspend_deposit_desc")
    @Expose
    private String suspendDepositDesc;
    @SerializedName("suspend_withdraw_desc")
    @Expose
    private String suspendWithdrawDesc;
    @SerializedName("currency_addr_oneoff")
    @Expose
    private Boolean currencyAddrOneoff;
    @SerializedName("blockchains")
    @Expose
    private String blockchains;

    public Boolean getCurrencyAddrWithTag() {
        return currencyAddrWithTag;
    }

    public void setCurrencyAddrWithTag(Boolean currencyAddrWithTag) {
        this.currencyAddrWithTag = currencyAddrWithTag;
    }

    public Integer getFastConfirms() {
        return fastConfirms;
    }

    public void setFastConfirms(Integer fastConfirms) {
        this.fastConfirms = fastConfirms;
    }

    public Integer getSafeConfirms() {
        return safeConfirms;
    }

    public void setSafeConfirms(Integer safeConfirms) {
        this.safeConfirms = safeConfirms;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public Boolean getWhiteEnabled() {
        return whiteEnabled;
    }

    public void setWhiteEnabled(Boolean whiteEnabled) {
        this.whiteEnabled = whiteEnabled;
    }

    public Boolean getCountryDisabled() {
        return countryDisabled;
    }

    public void setCountryDisabled(Boolean countryDisabled) {
        this.countryDisabled = countryDisabled;
    }

    public Boolean getDepositEnabled() {
        return depositEnabled;
    }

    public void setDepositEnabled(Boolean depositEnabled) {
        this.depositEnabled = depositEnabled;
    }

    public Boolean getWithdrawEnabled() {
        return withdrawEnabled;
    }

    public void setWithdrawEnabled(Boolean withdrawEnabled) {
        this.withdrawEnabled = withdrawEnabled;
    }

    public String getWithdrawMinAmount() {
        return withdrawMinAmount;
    }

    public void setWithdrawMinAmount(String withdrawMinAmount) {
        this.withdrawMinAmount = withdrawMinAmount;
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getShowPrecision() {
        return showPrecision;
    }

    public void setShowPrecision(String showPrecision) {
        this.showPrecision = showPrecision;
    }

    public Integer getWithdrawPrecision() {
        return withdrawPrecision;
    }

    public void setWithdrawPrecision(Integer withdrawPrecision) {
        this.withdrawPrecision = withdrawPrecision;
    }

    public String getDepositMinAmount() {
        return depositMinAmount;
    }

    public void setDepositMinAmount(String depositMinAmount) {
        this.depositMinAmount = depositMinAmount;
    }

    public Boolean getQuoteCurrency() {
        return quoteCurrency;
    }

    public void setQuoteCurrency(Boolean quoteCurrency) {
        this.quoteCurrency = quoteCurrency;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDepositDesc() {
        return depositDesc;
    }

    public void setDepositDesc(String depositDesc) {
        this.depositDesc = depositDesc;
    }

    public String getWithdrawDesc() {
        return withdrawDesc;
    }

    public void setWithdrawDesc(String withdrawDesc) {
        this.withdrawDesc = withdrawDesc;
    }

    public String getSuspendVisibleDesc() {
        return suspendVisibleDesc;
    }

    public void setSuspendVisibleDesc(String suspendVisibleDesc) {
        this.suspendVisibleDesc = suspendVisibleDesc;
    }

    public String getSuspendDepositDesc() {
        return suspendDepositDesc;
    }

    public void setSuspendDepositDesc(String suspendDepositDesc) {
        this.suspendDepositDesc = suspendDepositDesc;
    }

    public String getSuspendWithdrawDesc() {
        return suspendWithdrawDesc;
    }

    public void setSuspendWithdrawDesc(String suspendWithdrawDesc) {
        this.suspendWithdrawDesc = suspendWithdrawDesc;
    }

    public Boolean getCurrencyAddrOneoff() {
        return currencyAddrOneoff;
    }

    public void setCurrencyAddrOneoff(Boolean currencyAddrOneoff) {
        this.currencyAddrOneoff = currencyAddrOneoff;
    }

    public String getBlockchains() {
        return blockchains;
    }

    public void setBlockchains(String blockchains) {
        this.blockchains = blockchains;
    }

}
