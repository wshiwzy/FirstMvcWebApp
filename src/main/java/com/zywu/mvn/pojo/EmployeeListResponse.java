
package com.zywu.mvn.pojo;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 员工列表返回
 * 
 * <p>EmployeeListResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="EmployeeListResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="employees" type="{http://api.hardly.cc/employee/employeemodel}EmployeeModel" maxOccurs="unbounded"/>
 *         &lt;element name="splitRequest" type="{http://api.hardly.cc/splitpage}SplitPageResponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeeListResponse", propOrder = {
    "employees",
    "splitRequest"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-11-02T05:24:14+08:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class EmployeeListResponse {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-11-02T05:24:14+08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<Employee> employees;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-11-02T05:24:14+08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected SplitPageResponse splitRequest;

    /**
     * Gets the value of the employees property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employees property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmployees().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Employe }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-11-02T05:24:14+08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<Employee> getEmployees() {
        if (employees == null) {
            employees = new ArrayList<Employee>();
        }
        return this.employees;
    }

    /**
     * 获取splitRequest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SplitPageResponse }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-11-02T05:24:14+08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public SplitPageResponse getSplitRequest() {
        return splitRequest;
    }

    /**
     * 设置splitRequest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SplitPageResponse }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2015-11-02T05:24:14+08:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setSplitRequest(SplitPageResponse value) {
        this.splitRequest = value;
    }

}
