package com.ppg.datalake.ingestion

import com.ppg.datalake.ingestion.writer.DataWriter

object DataValidator {

  //TODO: add parameters to method
  private def validate() = ???

  //TODO: add parameters to method that you want to add to DataValidator#validate
  def validateAndWrite(writer: DataWriter) = {
    validate()
    writer.write()
  }
}
