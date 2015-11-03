
package com.zywu.mvn.pojo;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 分页查询请求
 * 
 * <p>SplitPageRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SplitPageRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pageNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pageSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="isReturnCount" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SplitPageRequest", namespace = "http://api.hardly.cc/splitpage", propOrder = {
    "pageNo",
    "pageSize",
    "isReturnCount"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-11-02T05:24:14+08:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class SplitPageRequest {

    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-11-02T05:24:14+08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected int pageNo;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-11-02T05:24:14+08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected int pageSize;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-11-02T05:24:14+08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected boolean isReturnCount;

    /**
     * 获取pageNo属性的值。
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-11-02T05:24:14+08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public int getPageNo() {
        return pageNo;
    }

    /**
     * 设置pageNo属性的值。
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-11-02T05:24:14+08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPageNo(int value) {
        this.pageNo = value;
    }

    /**
     * 获取pageSize属性的值。
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-11-02T05:24:14+08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public int getPageSize() {
        return pageSize;
    }

    /**
     * 设置pageSize属性的值。
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-11-02T05:24:14+08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPageSize(int value) {
        this.pageSize = value;
    }

    /**
     * 获取isReturnCount属性的值。
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-11-02T05:24:14+08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public boolean isIsReturnCount() {
        return isReturnCount;
    }

    /**
     * 设置isReturnCount属性的值。
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-11-02T05:24:14+08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setIsReturnCount(boolean value) {
        this.isReturnCount = value;
    }

}
