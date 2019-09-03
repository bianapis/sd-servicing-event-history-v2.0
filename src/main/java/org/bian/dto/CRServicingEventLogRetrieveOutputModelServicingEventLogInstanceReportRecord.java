package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRServicingEventLogRetrieveOutputModelServicingEventLogInstanceReportRecord
 */
public class CRServicingEventLogRetrieveOutputModelServicingEventLogInstanceReportRecord   {
  private String servicingEventLogInstanceReportData = null;

  private String servicingEventLogInstanceReportType = null;

  private Object servicingEventLogInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return servicingEventLogInstanceReportData
  **/

  public String getServicingEventLogInstanceReportData() {
    return servicingEventLogInstanceReportData;
  }

  public void setServicingEventLogInstanceReportData(String servicingEventLogInstanceReportData) {
    this.servicingEventLogInstanceReportData = servicingEventLogInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return servicingEventLogInstanceReportType
  **/

  public String getServicingEventLogInstanceReportType() {
    return servicingEventLogInstanceReportType;
  }

  public void setServicingEventLogInstanceReportType(String servicingEventLogInstanceReportType) {
    this.servicingEventLogInstanceReportType = servicingEventLogInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return servicingEventLogInstanceReport
  **/

  public Object getServicingEventLogInstanceReport() {
    return servicingEventLogInstanceReport;
  }

  public void setServicingEventLogInstanceReport(Object servicingEventLogInstanceReport) {
    this.servicingEventLogInstanceReport = servicingEventLogInstanceReport;
  }


}

