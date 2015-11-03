
package com.zywu.mvn.pojo;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 分页查询返回
 * 
 * <p>SplitPageResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SplitPageResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pageNo" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="recordCount" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="pageCount" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SplitPageResponse", namespace = "http://api.hardly.cc/splitpage", propOrder = {
    "pageNo",
    "recordCount",
    "pageCount"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-11-02T05:24:14+08:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class SplitPageResponse {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-11-02T05:24:14+08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Object pageNo;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-11-02T05:24:14+08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Object recordCount;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-11-02T05:24:14+08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Object pageCount;

    /**
     * 获取pageNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-11-02T05:24:14+08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Object getPageNo() {
        return pageNo;
    }

    /**
     * 设置pageNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-11-02T05:24:14+08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPageNo(Object value) {
        this.pageNo = value;
    }

    /**
     * 获取recordCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-11-02T05:24:14+08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Object getRecordCount() {
        return recordCount;
    }

    /**
     * 设置recordCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-11-02T05:24:14+08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setRecordCount(Object value) {
        this.recordCount = value;
    }

    /**
     * 获取pageCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-11-02T05:24:14+08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Object getPageCount() {
        return pageCount;
    }

    /**
     * 设置pageCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-11-02T05:24:14+08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPageCount(Object value) {
        this.pageCount = value;
    }

}
