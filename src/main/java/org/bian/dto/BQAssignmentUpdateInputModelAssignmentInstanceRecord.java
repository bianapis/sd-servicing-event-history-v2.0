package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAssignmentUpdateInputModelAssignmentInstanceRecord
 */
public class BQAssignmentUpdateInputModelAssignmentInstanceRecord   {
  private String dateTimeLocation = null;

  private Object servicingPositionActivityReport = null;

  private String servicingPositionActivityStatistics = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Key dates and times associated with the assignment (e.g. start, end, break duration, available/idle time) 
   * @return dateTimeLocation
  **/

  public String getDateTimeLocation() {
    return dateTimeLocation;
  }

  public void setDateTimeLocation(String dateTimeLocation) {
    this.dateTimeLocation = dateTimeLocation;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Log of servicing activity at that position during the session (e.g. contacts, sales, issues, breaks) 
   * @return servicingPositionActivityReport
  **/

  public Object getServicingPositionActivityReport() {
    return servicingPositionActivityReport;
  }

  public void setServicingPositionActivityReport(Object servicingPositionActivityReport) {
    this.servicingPositionActivityReport = servicingPositionActivityReport;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Accumulated statistics during the session (e.g. average contact time, wait time, service utilization, facility usage) 
   * @return servicingPositionActivityStatistics
  **/

  public String getServicingPositionActivityStatistics() {
    return servicingPositionActivityStatistics;
  }

  public void setServicingPositionActivityStatistics(String servicingPositionActivityStatistics) {
    this.servicingPositionActivityStatistics = servicingPositionActivityStatistics;
  }


}

