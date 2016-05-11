package controllers

import javax.inject.Inject

import play.api._
import play.api.mvc._

class Marketing @Inject() extends Controller {
  def about = Action {
    Ok(views.html.marketing.about("About us"))
  }
}