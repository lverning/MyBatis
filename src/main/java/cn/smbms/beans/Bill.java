package cn.smbms.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author： 吕二宁
 * @date： 2021-11-17 17:17
 */



public class Bill {
    private int id;
   private String billCode;
   private String productName;
   private String productDesc;
   private String productUnit;
   private int productCount;
   private int totalPrice;
   private int isPayment;
   private int createdBy;
   private Date creationDate;
   private int modifyBy;
   private Date modifyDate;
   private int providerId;

   private Prodvider prodvider;

    public Bill() {
    }

   public Bill(int id, String billCode, String productName, String productDesc, String productUnit, int productCount, int totalPrice, int isPayment, int createdBy, Date creationDate, int modifyBy, Date modifyDate, int providerId, Prodvider prodvider) {
      this.id = id;
      this.billCode = billCode;
      this.productName = productName;
      this.productDesc = productDesc;
      this.productUnit = productUnit;
      this.productCount = productCount;
      this.totalPrice = totalPrice;
      this.isPayment = isPayment;
      this.createdBy = createdBy;
      this.creationDate = creationDate;
      this.modifyBy = modifyBy;
      this.modifyDate = modifyDate;
      this.providerId = providerId;
      this.prodvider = prodvider;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getBillCode() {
      return billCode;
   }

   public void setBillCode(String billCode) {
      this.billCode = billCode;
   }

   public String getProductName() {
      return productName;
   }

   public void setProductName(String productName) {
      this.productName = productName;
   }

   public String getProductDesc() {
      return productDesc;
   }

   public void setProductDesc(String productDesc) {
      this.productDesc = productDesc;
   }

   public String getProductUnit() {
      return productUnit;
   }

   public void setProductUnit(String productUnit) {
      this.productUnit = productUnit;
   }

   public int getProductCount() {
      return productCount;
   }

   public void setProductCount(int productCount) {
      this.productCount = productCount;
   }

   public int getTotalPrice() {
      return totalPrice;
   }

   public void setTotalPrice(int totalPrice) {
      this.totalPrice = totalPrice;
   }

   public int getIsPayment() {
      return isPayment;
   }

   public void setIsPayment(int isPayment) {
      this.isPayment = isPayment;
   }

   public int getCreatedBy() {
      return createdBy;
   }

   public void setCreatedBy(int createdBy) {
      this.createdBy = createdBy;
   }

   public Date getCreationDate() {
      return creationDate;
   }

   public void setCreationDate(Date creationDate) {
      this.creationDate = creationDate;
   }

   public int getModifyBy() {
      return modifyBy;
   }

   public void setModifyBy(int modifyBy) {
      this.modifyBy = modifyBy;
   }

   public Date getModifyDate() {
      return modifyDate;
   }

   public void setModifyDate(Date modifyDate) {
      this.modifyDate = modifyDate;
   }

   public int getProviderId() {
      return providerId;
   }

   public void setProviderId(int providerId) {
      this.providerId = providerId;
   }

   public Prodvider getProdvider() {
      return prodvider;
   }

   public void setProdvider(Prodvider prodvider) {
      this.prodvider = prodvider;
   }

   @Override
   public String toString() {
      return "Bill{" +
              "id=" + id +
              ", billCode='" + billCode + '\'' +
              ", productName='" + productName + '\'' +
              ", productDesc='" + productDesc + '\'' +
              ", productUnit='" + productUnit + '\'' +
              ", productCount=" + productCount +
              ", totalPrice=" + totalPrice +
              ", isPayment=" + isPayment +
              ", createdBy=" + createdBy +
              ", creationDate=" + creationDate +
              ", modifyBy=" + modifyBy +
              ", modifyDate=" + modifyDate +
              ", providerId=" + providerId +
              ", prodvider=" + prodvider +
              '}';
   }
}
