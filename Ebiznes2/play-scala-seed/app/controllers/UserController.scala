package controllers

import javax.inject._
//import models.{Category, CategoryRepository, Product, ProductRepository}
import play.api.data.Form
import play.api.data.Forms._
import play.api.mvc._
import scala.concurrent.{ExecutionContext, Future}
import scala.util.{Failure, Success}
/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class UserController @Inject()(cc: MessagesControllerComponents)(implicit ec: ExecutionContext) extends MessagesAbstractController(cc) {

  def getUsers: Action[AnyContent] = Action.async { implicit request =>
    Future {
      Ok("getUser ok")
    }
  }

  def getUser(id: Long): Action[AnyContent] = Action.async { implicit request =>
    Future{
      Ok("getUser(id) ok")
    }
  }

  def delete(id: Long): Action[AnyContent] = Action.async { implicit request =>
    Future{
      Ok("deleteUser ok")
    }
  }

  def updateUser(id: Long): Action[AnyContent] = Action.async { implicit request =>
    Future{
      Ok("")
    }
  }

  def updateUserHandle = Action.async { implicit request =>
    Future{
      Ok("updateUserHandle ok")
    }
  }


  def addUser: Action[AnyContent] = Action.async { implicit request =>
    Future {
      Ok("addUser ok")
    }
  }
}


