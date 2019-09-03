package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSessionRetrieveOutputModelSessionInstanceReport
 */
public class BQSessionRetrieveOutputModelSessionInstanceReport   {
  private Object sessionInstanceReportRecord = null;

  private String sessionInstanceReportType = null;

  private String sessionInstanceReportParameters = null;

  private Object sessionInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return sessionInstanceReportRecord
  **/

  public Object getSessionInstanceReportRecord() {
    return sessionInstanceReportRecord;
  }

  public void setSessionInstanceReportRecord(Object sessionInstanceReportRecord) {
    this.sessionInstanceReportRecord = sessionInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return sessionInstanceReportType
  **/

  public String getSessionInstanceReportType() {
    return sessionInstanceReportType;
  }

  public void setSessionInstanceReportType(String sessionInstanceReportType) {
    this.sessionInstanceReportType = sessionInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return sessionInstanceReportParameters
  **/

  public String getSessionInstanceReportParameters() {
    return sessionInstanceReportParameters;
  }

  public void setSessionInstanceReportParameters(String sessionInstanceReportParameters) {
    this.sessionInstanceReportParameters = sessionInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return sessionInstanceReport
  **/

  public Object getSessionInstanceReport() {
    return sessionInstanceReport;
  }

  public void setSessionInstanceReport(Object sessionInstanceReport) {
    this.sessionInstanceReport = sessionInstanceReport;
  }


}

