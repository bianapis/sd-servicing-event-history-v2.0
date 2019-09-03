package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRServicingEventLogRetrieveInputModelServicingEventLogInstanceReportRecord
 */
public class CRServicingEventLogRetrieveInputModelServicingEventLogInstanceReportRecord   {
  private String servicingEventLogInstanceReportReference = null;

  private String servicingEventLogInstanceReportType = null;

  private String servicingEventLogInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return servicingEventLogInstanceReportReference
  **/

  public String getServicingEventLogInstanceReportReference() {
    return servicingEventLogInstanceReportReference;
  }

  public void setServicingEventLogInstanceReportReference(String servicingEventLogInstanceReportReference) {
    this.servicingEventLogInstanceReportReference = servicingEventLogInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return servicingEventLogInstanceReportParameters
  **/

  public String getServicingEventLogInstanceReportParameters() {
    return servicingEventLogInstanceReportParameters;
  }

  public void setServicingEventLogInstanceReportParameters(String servicingEventLogInstanceReportParameters) {
    this.servicingEventLogInstanceReportParameters = servicingEventLogInstanceReportParameters;
  }


}

