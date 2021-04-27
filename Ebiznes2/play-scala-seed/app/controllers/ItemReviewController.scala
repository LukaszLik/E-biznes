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
class ItemReviewController @Inject()(cc: MessagesControllerComponents)(implicit ec: ExecutionContext) extends MessagesAbstractController(cc) {

  def getItemReview: Action[AnyContent] = Action.async { implicit request =>
    Future {
      Ok("")
    }
  }

  def deleteItemReview(id: Long): Action[AnyContent] = Action.async {
    Future {
      Ok("")
    }
  }

  def updateItemReview(id: Long): Action[AnyContent] = Action.async { implicit request: MessagesRequest[AnyContent] =>
    Future {
      Ok("")
    }
  }

  def updateItemReviewHandle = Action.async {
    Future {
      Ok("updateProductHandle ok")
    }
  }


  def addItemReview: Action[AnyContent] = Action.async {
    Future {
      Ok("addProduct ok")
    }
  }

  def addItemReviewHandle = Action.async {
    Future {
      Ok("addProductHandle ok")
    }
  }

}
