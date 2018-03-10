package com.ppg.datalake.ingestion

import com.ppg.datalake.ingestion.loader.{FirstLoader, IncrementalLoader}
import com.ppg.datalake.ingestion.util.Logger

object CDCWorkflow extends App {
  // TODO: Add code to load all configs and setup spark env

  val logger = Logger(this.getClass.getName)

  override def main(args: Array[String]): Unit = {
    logger.info("DataValidation: Logging started for " + args(0))

    if(!FirstLoader.load()) {
      DynamicSchemaGenerator.changeSchema()
      if(!IncrementalLoader.load()) {
        DeltaImplementer.implement()
      }
    }

  }
}
