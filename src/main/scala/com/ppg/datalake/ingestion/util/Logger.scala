package com.ppg.datalake.ingestion.util

import com.typesafe.config.Config
import com.ppg.datalake.ingestion.util.AppConfig._
import org.apache.log4j.PropertyConfigurator
import org.slf4j.LoggerFactory

class Logger(className: String) {

  private val config = getConfig(CommonModule)
  PropertyConfigurator.configure(config.getString("log4jfilepath"))

  @transient private val log = LoggerFactory.getLogger(className) // Is there a reason for transient???

  def info(x: Any) {
    log.info(x.toString)
  }

  def info(caller: String, x: Any) {
    log.info(caller + " : " + x.toString)
  }

  def debug(x: Any) {
    log.debug(x.toString)
  }

  def debug(caller: String, x: Any) {
    log.debug(caller + " : " + x.toString)
  }

  def error(errormsg : String, exc: Throwable){
    log.error(errormsg, exc)
  }

}

object Logger {
  def apply(className: String)(implicit config: Config): Logger = new Logger(className)
}