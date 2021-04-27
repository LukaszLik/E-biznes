package controllers

import javax.inject._
import play.api.mvc._
import scala.concurrent.{ExecutionContext, Future}
import scala.util.{Failure, Success}
/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class OrderController @Inject()(cc: MessagesControllerComponents)(implicit ec: ExecutionContext) extends MessagesAbstractController(cc) {

  def getOrder: Action[AnyContent] = Action.async { implicit request =>
    Future {
      Ok("")
    }
  }

  def delete(id: Long): Action[AnyContent] = Action.async {
    Future {
      Ok("")
    }
  }

  def updateOrder(id: Long): Action[AnyContent] = Action.async { implicit request: MessagesRequest[AnyContent] =>
    Future {
      Ok("")
    }
  }

  def updateOrderHandle = Action.async {
    Future {
      Ok("updateProductHandle ok")
    }
  }


  def addOrder: Action[AnyContent] = Action.async {
    Future {
      Ok("addProduct ok")
    }
  }

  def addOrderHandle = Action.async {
    Future {
      Ok("addProductHandle ok")
    }
  }
}