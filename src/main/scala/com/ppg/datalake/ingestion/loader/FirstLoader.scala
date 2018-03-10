package com.ppg.datalake.ingestion.loader

import com.ppg.datalake.ingestion.DataValidator
import com.ppg.datalake.ingestion.writer.TextWriter

object FirstLoader {

  def load(): Boolean = {
    val doFirstLoad = checkFirstLoad()
    if(doFirstLoad) {
      DataValidator.validateAndWrite(TextWriter)
    }
    doFirstLoad
  }

  // TODO: Add condition for first load
  private def checkFirstLoad(): Boolean = ???
}
