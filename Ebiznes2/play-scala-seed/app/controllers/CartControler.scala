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
class CartController @Inject()(cc: MessagesControllerComponents)(implicit ec: ExecutionContext) extends MessagesAbstractController(cc) {

  def getCart: Action[AnyContent] = Action.async { implicit request =>
    Future {
      Ok("")
    }
  }

  def deleteCart(id: Long): Action[AnyContent] = Action.async {
    Future {
      Ok("")
    }
  }

  def updateCart(id: Long): Action[AnyContent] = Action.async { implicit request: MessagesRequest[AnyContent] =>
    Future {
      Ok("")
    }
  }

  def updateCartHandle = Action.async {
    Future {
      Ok("updateProductHandle ok")
    }
  }


  def addCart: Action[AnyContent] = Action.async {
    Future {
      Ok("addProduct ok")
    }
  }

  def addCartHandle = Action.async {
    Future {
      Ok("addProductHandle ok")
    }
  }

}
