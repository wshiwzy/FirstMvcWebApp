
package com.zywu.mvn.pojo;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 员工列表请求
 * 
 * <p>EmployeeListRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="EmployeeListRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="splitRequest" type="{http://api.hardly.cc/splitpage}SplitPageRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeeListRequest", propOrder = {
    "splitRequest"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-11-02T05:24:14+08:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class EmployeeListRequest {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-11-02T05:24:14+08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected SplitPageRequest splitRequest;

    /**
     * 获取splitRequest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SplitPageRequest }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-11-02T05:24:14+08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public SplitPageRequest getSplitRequest() {
        return splitRequest;
    }

    /**
     * 设置splitRequest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SplitPageRequest }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-11-02T05:24:14+08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setSplitRequest(SplitPageRequest value) {
        this.splitRequest = value;
    }

}
