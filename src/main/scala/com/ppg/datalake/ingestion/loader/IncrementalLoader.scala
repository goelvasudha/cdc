package com.ppg.datalake.ingestion.loader

import com.ppg.datalake.ingestion.DataValidator
import com.ppg.datalake.ingestion.writer.TextWriter

object IncrementalLoader {

  def load(): Boolean = {
    val doIncrementalLoad = checkIncrementalLoad()
    if(doIncrementalLoad) {
      DataValidator.validateAndWrite(TextWriter)
    }
    doIncrementalLoad
  }

  // Decides if Incremental loading needs to be done
  private def isIncrementalLoad(): Boolean = ???

  // Decides if Incremental load is for more than one day
  private def isIncEqualToOne(): Boolean = ???

  // TODO: Add condition for incremental load
  private def checkIncrementalLoad(): Boolean = {
    isIncrementalLoad() && isIncEqualToOne()
  }
}
