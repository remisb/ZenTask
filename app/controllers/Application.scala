package controllers

import play.api._
import play.api.mvc._
import play.templates.{BaseScalaTemplate, Format}

object Application extends Controller {
  import RepresentResult.representationOk

  def index = Action {implicit request =>
    representationOk(views.html.index("Your new application is ready."), "test")
  }

}
