package massivedecks.controllers

import java.net.URLEncoder
import java.nio.charset.StandardCharsets
import javax.inject.{Inject, Singleton}

import scala.concurrent.Future

import play.api.http.ContentTypes._
import play.api.http.HttpErrorHandler
import play.api.mvc.Results._
import play.api.mvc._
import play.api.Logger
import massivedecks.Config

@Singleton
class ErrorHandler @Inject()(getConfig: Config.Factory) extends HttpErrorHandler {
}
